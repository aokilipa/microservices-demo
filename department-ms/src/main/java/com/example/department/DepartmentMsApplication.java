package com.example.department;

import com.example.department.controller.DepartmentController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
public class DepartmentMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DepartmentMsApplication.class, args);
    }

}
