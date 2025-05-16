package jpa_auduting_proj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorProvider")
public class JpaAudutingProjApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaAudutingProjApplication.class, args);
	}

}
