package com.jeevan.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
	
	public static void main(String[] args) {
		/**
		 * Example code for spring ioc and DI and injecting values from config and prop file
		 */
		
		//Creating Spring container(applicationcontext) and passing configuration of xml type
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationCOntext.xml");
		
		//Getting beans from object factory(spring container - applicationcontext)
		WaterfallDevProcess process=context.getBean("waterfall", WaterfallDevProcess.class);
		
		//reading bean data
		System.out.println("DevProcess Model : "+process.getDesign());
		System.out.println("Deployment Process : "+process.getDeploymentType());
		System.out.println("Team : "+process.getTeam());
		System.out.println("Team Memeber : "+process.getTeamMember());
		
		//closing context
		context.close();
		
		
		/**
		 * example code for bean scope singleton and prototype
		 * Bean lifecycle hooks init-method, destroy-method
		 */
		/*
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationCOntext.xml");
		
		DevProcess bean1 = context.getBean("agile", DevProcess.class);
		
		DevProcess bean2 = context.getBean("agile", DevProcess.class);
		
		if(bean1.equals(bean2))
			System.out.println("Both beans are having same reference");
		else
			System.out.println("Both beans are not having same refernce");
		
		context.close();
		*/
		
		
		
	}

}
