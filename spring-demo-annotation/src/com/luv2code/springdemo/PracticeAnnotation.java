package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeAnnotation {

	public static void main(String[] args) {
		//Load spring config file
		ClassPathXmlApplicationContext context= 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//Retrieve Bean
		 Coach theCoach = context.getBean("swimCoach",Coach.class);
		//use bean
		 System.out.println(theCoach.getDailyWorkout());
		 System.out.println(theCoach.getDailyFortune());
		 
		//Close context
		 context.close();

	}

}
