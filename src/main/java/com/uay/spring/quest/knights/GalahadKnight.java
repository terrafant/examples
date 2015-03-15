package com.uay.spring.quest.knights;

import org.springframework.stereotype.Component;

@Component
public class GalahadKnight implements Knight {

    @Override
    public void rescueDamsel() {
        System.out.println("And here comes Galahad and galantly saves the damsel");
    }
}
