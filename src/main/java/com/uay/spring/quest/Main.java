package com.uay.spring.quest;

import com.uay.spring.quest.strategy.ApplicationContextQuest;
import com.uay.spring.quest.strategy.QuestContext;

public class Main {

    public static final String SPRING_CONFIG_XML = "spring-config.xml";
    public static final String SPRING_CONFIG_XML_ANNOTATION_DRIVEN = "spring-config-annotation.xml";
    public static final String QUEST_BEAN_NAME = "quest";

    public static void main(String[] args) {
        long start = System.nanoTime();
        QuestContext questContext = new QuestContext(new ApplicationContextQuest());
//        QuestContext questContext = new QuestContext(new BeanFactoryQuest());
//        QuestContext questContext = new QuestContext(new AnnotationConfigContextQuest());
        Quest quest = questContext.getQuest();
        quest.completeQuest();
        System.out.println("time = " + String.valueOf(System.nanoTime() - start));
    }
}
