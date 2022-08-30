package com.finalproject.dontbeweak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableJpaAuditing
@SpringBootApplication
public class DontbeweakApplication {

    public static final String APPLICATION_LOCATIONS = "spring.config.location="
            + "classpath:application.properties,"
            + "classpath:application.yml,"
            + "classpath:application-swagger.properties";

    public static void main(String[] args) {
//        SpringApplication.run(DontbeweakApplication.class, args);
        new SpringApplicationBuilder(DontbeweakApplication.class)
                .properties(APPLICATION_LOCATIONS)
                .run(args);
    }

}
