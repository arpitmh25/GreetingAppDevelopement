package com.bridgelabz.greetingapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GreetingApplication {

    public static void main(String[] args) {
        System.out.println("Hello here.....!");
        SpringApplication.run(GreetingApplication.class, args);
    }
}
