package com.kodreis.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    private  FortuneService fortuneService;

    private String team;

    private String email;

    @Autowired
    @Qualifier("randomFortuneService")
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "15 dakika hızlı bowling oynamak.";
    }

    @Override
    public String getDailyFortune() {
        return "Kriket Koçu : " + fortuneService.getFortune();
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("Kriket Koçu Takım Adı : Kodreis");
        this.team = team;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        System.out.println("Kriket Koçu Mail Adresi : sefauncu@gmail.com");
        this.email = email;
    }
}
