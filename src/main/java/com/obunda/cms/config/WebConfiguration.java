package com.obunda.cms.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
public class WebConfiguration implements WebMvcConfigurer {
	// https://memorynotfound.com/adding-static-resources-css-javascript-images-thymeleaf/
    // https://stackoverflow.com/questions/47552835/the-type-webmvcconfigureradapter-is-deprecated
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
    
    	// http://zetcode.com/spring/webjars/
        registry.addResourceHandler("/webjars/**")
        .addResourceLocations("/webjars/").resourceChain(false);
    }
}
