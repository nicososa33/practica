package uy.gub.agesic.grep.core.configurations;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import uy.gub.agesic.grep.core.interceptors.UsernameInterceptor;
//import uy.gub.agesic.grep.core.interceptors.UsernameInterceptor;

@Configuration
@EnableSwagger2
//@EnableJpaAuditing(auditorAwareRef = "auditorProvider")
public class SpringBootConfiguration implements WebMvcConfigurer {
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("uy.gub.agesic.grep.core.controllers"))
				.paths(PathSelectors.any()).build().apiInfo(getApiInfo());
	}

	@Bean
	UsernameInterceptor usernameInterceptor() {
		return new UsernameInterceptor();
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(usernameInterceptor());
	}

	private ApiInfo getApiInfo() {
		return new ApiInfo("API Codigueras", "API Codigueras", "1.0",
				"https://www.gub.uy/agencia-gobierno-electronico-sociedad-informacion-conocimiento/",
				new Contact("AGESIC",
						"https://www.gub.uy/agencia-gobierno-electronico-sociedad-informacion-conocimiento/",
						"mathias.battistella@magentainnova.com"),
				"LICENSE", "LICENSE URL", Collections.emptyList());
	}
	
	

}
