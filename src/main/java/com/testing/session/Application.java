package com.testing.session;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages = "com.testing.session")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
