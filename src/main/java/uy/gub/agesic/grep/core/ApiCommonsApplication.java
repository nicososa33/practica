package uy.gub.agesic.grep.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"uy.gub.agesic.grep.core", "net.atos.external.config"})
public class ApiCommonsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiCommonsApplication.class, args);
	}

}
