package com.uay.spring.quest.log;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.uay")
public class LogConfiguration {

    //instantiate via factory-method
    @Bean
    public LogAspect getLogAspect() {
        return LogAspect.aspectOf();
    }
}
