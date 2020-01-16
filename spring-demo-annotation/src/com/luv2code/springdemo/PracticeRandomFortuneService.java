package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PracticeRandomFortuneService implements FortuneService {
	@Value("${foo.data}")
	private String data;
	@Override
	public String getFortune() {
		return data;
	}

}
