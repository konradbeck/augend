package com.merchantcapital.augend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

@EnableScheduling
public class ScheduleConfig {

/*    @Scheduled(initialDelay = START_DELAY_IN_MILLISECONDS, fixedDelay = 1)
    public void orderAndTradeFluxUpdate() {
        if (enabled.get()) {
            orderFlux.update();
            tradeFlux.update();
        }
    }*/

/*    @Bean
    public TaskScheduler taskScheduler() {
        ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
        scheduler.setWaitForTasksToCompleteOnShutdown(true);
        scheduler.setAwaitTerminationMillis(TERMINATION_DELAY_IN_MILLISECONDS);
        scheduler.setThreadNamePrefix("trading-bot-flux-");
        scheduler.setPoolSize(SCHEDULER_POOL_SIZE);
        scheduler.setErrorHandler(throwable -> {
            try {
                log.error("Error in scheduled tasks: {}", throwable.getMessage());
            } catch (Exception exception) {
                log.error("Error in scheduled tasks: {}", exception.getMessage());
            }
        });
        return scheduler;
    }*/
}
