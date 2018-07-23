package com.kodreis.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
    public static void main(String[] args){

        ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Coach theCoach = context.getBean("myCricketCoach", Coach.class);

        Coach theCoach = context.getBean("baseballCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        //System.out.println(cricketCoach.getTeam());

        //System.out.println(cricketCoach.getEmail());

        context.close();
    }
}
