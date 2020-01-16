package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {
	@Autowired
	@Qualifier("practiceRandomFortuneService")
     private FortuneService fortuneService;
   /* public SwimCoach() {
    	System.out.println("Swimcoach default Constructor");
    }*/
	public String getDailyWorkout() {
		return "Run 5km today before going in pool";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
