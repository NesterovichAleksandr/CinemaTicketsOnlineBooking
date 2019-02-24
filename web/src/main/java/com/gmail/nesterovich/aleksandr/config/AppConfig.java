package com.gmail.nesterovich.aleksandr.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@PropertySource({"classpath:properties/hibernate.properties", "classpath:properties/app.properties"})
@ComponentScan(basePackages = {
        "com.gmail.nesterovich.aleksandr"
})
public class AppConfig {
}