package com.luv2code.springdemo;

public class CricketCoach implements Coach {
   private FortuneService fortuneService;
    public CricketCoach(FortuneService theFortuneService) {
    	 fortuneService = theFortuneService;
    }
	@Override
	public String getDailyWorkout() {
		return "Run 1KM";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
