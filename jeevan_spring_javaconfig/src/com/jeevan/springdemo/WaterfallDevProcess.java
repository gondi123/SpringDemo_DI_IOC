package com.jeevan.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class WaterfallDevProcess implements DevProcess {
	
	private DeploymentProcess deploymentProcess; 
	
	@Value("${team}")
	private String team;
	
	@Value("${teamMember}")
	private String teamMember;
	
	public String getTeam() {
		return team;
	}

	public String getTeamMember() {
		return teamMember;
	}

	public WaterfallDevProcess() {}
	
	public WaterfallDevProcess(DeploymentProcess deploymentProcess) {
		this.deploymentProcess = deploymentProcess;
	}

	@Override
	public String getDesign() {
		
		return "Desgin whole project in waterfall model";
	}

	@Override
	public String getDeploymentType() {
		
		return deploymentProcess.getDeployemnt();
	}

}
