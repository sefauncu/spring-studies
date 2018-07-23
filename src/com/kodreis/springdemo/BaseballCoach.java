package com.kodreis.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

    @Autowired
    @Qualifier("databaseFortuneService")
    private FortuneService fortuneService;


    @Override
    public String getDailyWorkout() {
        return "Topu fırlatmada 5 dk. harcamak.";
    }

    @Override
    public String getDailyFortune() {
        return "Beyzbol Koçu : " + fortuneService.getFortune();
    }
}
