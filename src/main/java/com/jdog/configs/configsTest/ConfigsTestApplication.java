package com.jdog.configs.configsTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ConfigsTestApplication {

	@Autowired
	String name;

	@Bean
	public CommandLineRunner runner() {
		return args -> {
			System.out.println(name);
		};
	}
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(ConfigsTestApplication.class);
		app.setWebApplicationType(WebApplicationType.NONE);
		ConfigurableApplicationContext context
				= app.run(args);
	}

}
