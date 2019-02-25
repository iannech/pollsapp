package com.app.polls.pollsapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*
* We’ll be accessing the APIs from the react client that will run on its own development server.
* To allow cross origin requests from the react client
* */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    private final long MAX_AGE_SECS = 3600;

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("HEAD", "POST", "OPTIONS", "GET", "PUT", "PATCH", "DELETE")
                .maxAge(MAX_AGE_SECS);
    }
}
