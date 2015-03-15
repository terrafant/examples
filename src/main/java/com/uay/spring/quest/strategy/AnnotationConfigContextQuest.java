package com.uay.spring.quest.strategy;

import com.uay.spring.quest.Main;
import com.uay.spring.quest.Quest;
import com.uay.spring.quest.log.LogConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigContextQuest implements QuestFactoryStrategy {

    public Quest getQuest() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(LogConfiguration.class);
        return (Quest) applicationContext.getBean(Main.QUEST_BEAN_NAME);
    }
}
