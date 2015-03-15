package com.uay.spring.quest.log;

import org.springframework.stereotype.Component;

@Component
public class Logger {

    public void logBefore() {
        System.out.println("Logger 'before' has been triggeered");
    }

    public void logAfter() {
        System.out.println("Logger 'after' has been triggeered");
    }
}
