package com.kodreis.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Bugün şanslı günümdeyim.";
    }
}
