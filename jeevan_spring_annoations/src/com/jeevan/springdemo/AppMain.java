package com.jeevan.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
	
	public static void main(String[] args) {
		
		//Read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");;
		
		//get bean from container
		KanbanDevProcess process = context.getBean("kanbanDevProcess", KanbanDevProcess.class);
				
	    //call method of bean
		System.out.println("Process : "+process.getDesign());
		System.out.println("DeployemntProcess : "+process.getDeploymentType());
		System.out.println("Team : "+process.getTeam());
		System.out.println("TeamMember : "+process.getTeamMember());
				
		//close context
		context.close();
	}

}
