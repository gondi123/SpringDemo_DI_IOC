package com.jeevan.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {
	
	public static void main(String[] args) {
		
		//read spring java config file
		AnnotationConfigApplicationContext context = new 
				AnnotationConfigApplicationContext(AppMainConfig.class);
		//retrieve bean
		WaterfallDevProcess process = context.getBean("devProcess", WaterfallDevProcess.class);
		
	    //call method of bean
		System.out.println("Process : "+process.getDesign());
		System.out.println("Process : "+process.getDeploymentType());
		System.out.println("Team : "+process.getTeam());
		System.out.println("Team : "+process.getTeamMember());
		
		
		//close context
		context.close();
		
		
		
	}

}
