package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

@SpringBootApplication
@EnableJpaRepositories
@Import(RepositoryRestMvcConfiguration.class)
@EnableDiscoveryClient

public class CompanyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompanyServiceApplication.class, args);
	}
}

@Configuration
class RestWsApplicationConfig { // Note that this class is NOT public
@Bean
public Jackson2ObjectMapperBuilder jacksonBuilder() {
Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder();
builder.indentOutput(true);
return builder;
}
}