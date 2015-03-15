package com.uay.spring.quest.strategy;

import com.uay.spring.quest.Quest;

public class QuestContext {

    private QuestFactoryStrategy questFactoryStrategy;

    public QuestContext(QuestFactoryStrategy questFactoryStrategy) {
        this.questFactoryStrategy = questFactoryStrategy;
    }

    public Quest getQuest() {
        return questFactoryStrategy.getQuest();
    }
}
