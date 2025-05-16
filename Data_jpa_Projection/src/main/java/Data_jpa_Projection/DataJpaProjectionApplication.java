package Data_jpa_Projection;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "Data_jpa_Projection")
public class DataJpaProjectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataJpaProjectionApplication.class, args);
			
	}
	

}
