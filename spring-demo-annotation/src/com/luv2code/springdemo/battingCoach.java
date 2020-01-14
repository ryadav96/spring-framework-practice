package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class battingCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Run 5KM today";
	}

}
