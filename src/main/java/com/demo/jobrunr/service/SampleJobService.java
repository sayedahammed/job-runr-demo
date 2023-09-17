package com.demo.jobrunr.service;

import lombok.extern.slf4j.Slf4j;
import org.jobrunr.jobs.annotations.Job;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class SampleJobService {
    @Job(name = "The sample job without variable")
    public void execute() {
        execute("Hello World!");
    }

    @Job(name = "The sample job with variable %0")
    public void execute(String input) {
        try {
            log.info("The sample job has begun. The variable you passed is {}", input);
        } finally {
            log.info("Sample job has finished...");
        }
    }
}
