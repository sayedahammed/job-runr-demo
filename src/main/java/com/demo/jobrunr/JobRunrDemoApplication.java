package com.demo.jobrunr;

import com.demo.jobrunr.config.MainConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@Import(MainConfiguration.class)
@EnableScheduling
public class JobRunrDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JobRunrDemoApplication.class, args);
    }

}
