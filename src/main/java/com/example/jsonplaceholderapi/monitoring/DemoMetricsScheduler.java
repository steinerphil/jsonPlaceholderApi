package com.example.jsonplaceholderapi.monitoring;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Configuration
public class DemoMetricsScheduler {

    private final DemoMetrics demoMetrics;

    public DemoMetricsScheduler(DemoMetrics demoMetrics) {
        this.demoMetrics = demoMetrics;
    }

    @Scheduled(fixedRate = 1500)
    public void triggerCustomMetrics() {
        demoMetrics.getRandomMetricsData();
    }
}