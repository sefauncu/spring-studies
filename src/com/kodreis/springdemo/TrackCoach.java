package com.kodreis.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;


    @Override
    public String getDailyWorkout() {
        return "5k seviyede zor koşu yapmak.";
    }

    @Override
    public String getDailyFortune() {
        return "Antrenör : " + fortuneService.getFortune();
    }
}
