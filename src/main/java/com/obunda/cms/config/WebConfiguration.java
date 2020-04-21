package com.obunda.cms.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class WebConfiguration extends WebMvcConfigurationSupport {
	// https://memorynotfound.com/adding-static-resources-css-javascript-images-thymeleaf/
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) { 
    	registry.addResourceHandler(
                "/static/img/**",
                "/static/css/**",
                "/static/js/**",
                "/static/libs/**")
                .addResourceLocations(
                        "classpath:/static/img/",
                        "classpath:/static/css/",
                        "classpath:/static/js/",
                        "classpath:/static/libs/");
    }
}
