package com.hsenid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.hsenid")
public class RestMongoAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestMongoAppApplication.class, args);
    }

}
