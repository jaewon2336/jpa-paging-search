package site.metacoding.pagingsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class PagingsearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(PagingsearchApplication.class, args);
	}

}
