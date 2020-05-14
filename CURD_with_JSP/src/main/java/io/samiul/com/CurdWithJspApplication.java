package io.samiul.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
public class CurdWithJspApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurdWithJspApplication.class, args);
	}

}
