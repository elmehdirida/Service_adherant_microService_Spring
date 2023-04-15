package com.rida.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.rida.service","com.rida.controller"})
@EntityScan("com.rida.model")
@EnableJpaRepositories("com.rida.dao")
public class ServiceAdherantApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceAdherantApplication.class, args);
    }

}
