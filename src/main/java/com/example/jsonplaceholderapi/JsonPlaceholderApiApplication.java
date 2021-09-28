package com.example.jsonplaceholderapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class JsonPlaceholderApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(JsonPlaceholderApiApplication.class, args);
    }
}
