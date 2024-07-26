package com.example.lxjdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@ComponentScan(basePackages = "com.example")
public class LxjDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(LxjDemoApplication.class, args);
    }

}
