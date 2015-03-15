package com.uay.spring.quest.strategy;

import com.uay.spring.quest.Main;
import com.uay.spring.quest.Quest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextQuest implements QuestFactoryStrategy {

    public Quest getQuest() {
        ApplicationContext context = new ClassPathXmlApplicationContext(Main.SPRING_CONFIG_XML_ANNOTATION_DRIVEN);
        return (Quest) context.getBean(Main.QUEST_BEAN_NAME);
    }
}
