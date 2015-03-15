package com.uay.spring.quest.log;

import org.springframework.beans.factory.annotation.Autowired;

public aspect LogAspect {

    public LogAspect() {

    }

    after(): execution(* com.uay.spring.quest.knights.Knight.rescueDamsel()) {
        if (logger == null) {
            System.out.println("Logger autowiring did not work");
        } else {
            logger.logAfter();
        }
    }

    @Autowired
    private Logger logger;
    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
