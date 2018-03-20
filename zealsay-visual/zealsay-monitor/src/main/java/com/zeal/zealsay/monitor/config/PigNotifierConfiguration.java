package com.zeal.zealsay.monitor.config;

import com.zeal.zealsay.monitor.filter.MobileNotifier;
import de.codecentric.boot.admin.notify.RemindingNotifier;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.concurrent.TimeUnit;

/**
 * @author zeal
 * @date 2018/1/25
 *  监控提醒配置
 */
@Configuration
@EnableScheduling
public class PigNotifierConfiguration {
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Autowired
    private MonitorMobilePropertiesConfig monitorMobilePropertiesConfig;
    @Bean
    @Primary
    public RemindingNotifier remindingNotifier() {
        RemindingNotifier remindingNotifier = new RemindingNotifier(mobileNotifier());
        remindingNotifier.setReminderPeriod(TimeUnit.MINUTES.toMillis(1));
        return remindingNotifier;
    }

    @Bean
    public MobileNotifier mobileNotifier(){
        return new MobileNotifier(monitorMobilePropertiesConfig,rabbitTemplate);
    }

    @Scheduled(fixedRate = 60_000L)
    public void remind() {
        remindingNotifier().sendReminders();
    }
}