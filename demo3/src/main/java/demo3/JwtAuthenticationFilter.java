package demo3;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;
@Component
public class JwtAuthenticationFilter  implements GatewayFilter {

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		 String token = exchange.getRequest().getHeaders().getFirst(HttpHeaders.AUTHORIZATION);
	        if (token == null || !token.startsWith("Bearer ")) {
	            throw new RuntimeException("Unauthorized");
	        }
	        return chain.filter(exchange);	}

}
