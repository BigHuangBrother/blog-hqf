package com.hqf.blogboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.hqf.blogboot.*")
public class BlogBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogBootApplication.class, args);
    }
}
