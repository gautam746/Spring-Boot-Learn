package com.Practice.HomeWork;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HomeWorkApplication {

    public static void main(String[] args) {
        SpringApplication.run(HomeWorkApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(CackBacker cackBacker){
        return args -> {
            cackBacker.backCack();
        };
    }
}