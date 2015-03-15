package com.uay.spring.quest;

import com.uay.spring.quest.knights.Knight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Quest {

    private Knight knight;

    @Autowired
    public Quest(@Qualifier("galahadKnight") Knight knight) {
        this.knight = knight;
    }

    public void completeQuest() {
        knight.rescueDamsel();
    }
}
