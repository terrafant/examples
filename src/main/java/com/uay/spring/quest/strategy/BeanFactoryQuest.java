package com.uay.spring.quest.strategy;

import com.uay.spring.quest.Main;
import com.uay.spring.quest.Quest;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class BeanFactoryQuest implements QuestFactoryStrategy {

    public Quest getQuest() {
        Resource resource = new ClassPathResource(Main.SPRING_CONFIG_XML);
        BeanFactory xmlBeanFactory = new XmlBeanFactory(resource);
        return (Quest) xmlBeanFactory.getBean(Main.QUEST_BEAN_NAME);
    }
}
