package com.demo.jobrunr.scheduler;

import com.demo.jobrunr.service.SampleJobService;
import lombok.RequiredArgsConstructor;
import org.jobrunr.scheduling.JobScheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@RequiredArgsConstructor
public class SampleTaskScheduler {
    private final JobScheduler jobScheduler;
    private final SampleJobService sampleJobService;
//    https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/scheduling/support/CronSequenceGenerator.html
//    Every minutes 60000
//    @Scheduled(fixedRate = 60000)
//    "*/10 * * * * *" = every ten seconds.
    @Scheduled(cron = "*/10 * * * * *")
    public void runJob() {
        String message = "Now time is: " + LocalDateTime.now();
        jobScheduler.enqueue(() -> sampleJobService.execute(message));
    }
}
