package com.luv2code.springdemo;

public class WishFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Have a nice day.";
	}

}
