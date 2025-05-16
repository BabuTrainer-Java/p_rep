package demo51;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;
@Component
public class AuditorAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        // Fetching current user (replace with actual authentication logic)
        return Optional.of("adminUser"); // Example: Replace with dynamic user fetching logic
    }
}
