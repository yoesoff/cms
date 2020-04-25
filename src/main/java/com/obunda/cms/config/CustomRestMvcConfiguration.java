package com.obunda.cms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@Configuration
public class CustomRestMvcConfiguration {
	// https://docs.spring.io/spring-data/rest/docs/current/reference/html/#reference
	@Bean
	public RepositoryRestConfigurer repositoryRestConfigurer() {
	    return new RepositoryRestConfigurer() {
			@Override
			public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
				config.setBasePath("/api");
			}
	    };
	}
}
