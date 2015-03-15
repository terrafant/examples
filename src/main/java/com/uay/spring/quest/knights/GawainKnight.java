package com.uay.spring.quest.knights;

import org.springframework.stereotype.Component;

@Component
public class GawainKnight implements Knight {

    @Override
    public void rescueDamsel() {
        System.out.println("Gawain rescued the damsel");
    }
}
