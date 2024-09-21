package com.petrov.positionsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PositionsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PositionsServiceApplication.class, args);
    }

}
