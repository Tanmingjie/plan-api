package com.olivert.planapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
public class PlanApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlanApiApplication.class, args);
    }

}
