package org.example.scheduler_outofmemory.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.config.ScheduledTask;
import org.springframework.stereotype.Service;

@Service
public class SheduledTaskService {
    private static final Logger LOGGER = LoggerFactory.getLogger(ScheduledTask.class);

    @Async("taskExecutor")
    @Scheduled(fixedRate = 1)
    public void shedule() {
        LOGGER.info("sheduled service started");
        LOGGER.info("sheduled service ended");
    }
}
