package com.example.lms_admin_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LmsAdminProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(LmsAdminProjectApplication.class, args);
    }

}
