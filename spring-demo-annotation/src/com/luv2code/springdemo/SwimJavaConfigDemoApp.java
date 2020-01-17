package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		//read spring config java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);	
       
		//get bean from spring container
		Coach theCoach = context.getBean("swimCoach",Coach.class);
		
		//Coach thCoach = context.getBean("tennisCoach",Coach.class);
		//Call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(((SwimCoach) theCoach).getEmail());
		System.out.println(((SwimCoach) theCoach).getTeam());
		//Close the context
		context.close();
           
}
}
