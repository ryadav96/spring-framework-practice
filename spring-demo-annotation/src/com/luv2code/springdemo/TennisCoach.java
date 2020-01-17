package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("happyFortuneService")
     private FortuneService fortuneService;
     
     //Default Constructor
     public TennisCoach(){
    	 System.out.println(">>TennisCoach: Inside default constructor");
     }
     /*
     //default setter method
     @Autowired
     public void doSomeCrazyStuff(FortuneService theFortuneService) {
    	 System.out.println(">> TennisCoach: inside doSomeCrazyStuff() method");
    	 fortuneService = theFortuneService;
     }
     */
	@Override
	public String getDailyWorkout() {	
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
