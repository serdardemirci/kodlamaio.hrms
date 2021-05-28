package com.serdardemirci.hrms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableJpaRepositories
@EnableSwagger2
public class HrmsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(HrmsApplication.class, args);
/*
		JobSeekerDao jsDao =
				configurableApplicationContext.getBean(JobSeekerDao.class);

		UserDao userDao =
				configurableApplicationContext.getBean(UserDao.class);


		//JobSeeker js = new JobSeeker();


		JobSeeker js = new JobSeeker();
		js.setFirstName("Serdar");
		js.setLastName("Demirci");
		js.setEmail("o_serdardemirci@hotmail.com");
		js.setDateOfBirth(LocalDate.of(1981,11,24));
		js.setIdentityNumber("12323635");
		js.setPassword("testPassword");
		js.setVerified(true);
*/

		//jsDao.save(js);


	}

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.serdardemirci.hrms"))
				.build();
	}
}
