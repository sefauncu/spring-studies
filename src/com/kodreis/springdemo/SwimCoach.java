package com.kodreis.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class SwimCoach implements Coach{

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    private  FortuneService fortuneService;

    //@Autowired
    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Yüzme Koçu : #getDailyWorkout";
    }

    @Override
    public String getDailyFortune() {
        return "Yüzme Koçu : #getDailyFortune " + fortuneService.getFortune();
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }
}
