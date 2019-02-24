package com.gmail.nesterovich.aleksandr.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource({"classpath:properties/hibernate.properties", "classpath:properties/app.properties"})
@ComponentScan(basePackages = {
        "com.gmail.nesterovich.aleksandr"
})
public class AppConfig {
}