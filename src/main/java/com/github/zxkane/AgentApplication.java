package com.github.zxkane;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.github.zxkane"})
@EnableReactiveMongoRepositories(basePackages = {"com.github.zxkane.repository"})
public class AgentApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(AgentApplication.class);
		application.setWebApplicationType(WebApplicationType.REACTIVE);
		application.run(args);
	}
}
