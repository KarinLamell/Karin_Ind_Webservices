package com.lamell.karin_ind_webservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class KarinIndWebservicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(KarinIndWebservicesApplication.class, args);
    }

}
