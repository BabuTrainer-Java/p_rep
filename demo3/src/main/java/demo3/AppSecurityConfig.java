package demo3;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity

public class AppSecurityConfig extends  WebSecurityConfiguration
 {
	@Bean
	 
	protected <UserDetails> UserDetailsService userDetailsService(){
		List<UserDetails>user=new ArrayList<>();
		user.add((UserDetails) User.withDefaultPasswordEncoder().
		username("navin").password("1234").
		roles("USER").build());
		return new InMemoryUserDetailsManager();
		}
	

}
