package com.example.demogradle1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
//@EnableJpaRepositories(basePackages="com.example.*")
public class Demogradle1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demogradle1Application.class, args);
    }
}
