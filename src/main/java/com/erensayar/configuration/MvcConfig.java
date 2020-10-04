package com.erensayar.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author ErenSayar
 */

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/addAuthor").setViewName("addAuthor");
        registry.addViewController("/addBook").setViewName("addBook");
        registry.addViewController("/addPublisher").setViewName("addPublisher");
        registry.addViewController("/detailsOfAuthor").setViewName("detailsOfAuthor");
        registry.addViewController("/detailsOfBook").setViewName("detailsOfBook");
        registry.addViewController("/detailsOfPublisher").setViewName("detailsOfPublisher");
    }
}
