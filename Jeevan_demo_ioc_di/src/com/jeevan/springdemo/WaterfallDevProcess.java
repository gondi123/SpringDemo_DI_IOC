package com.jeevan.springdemo;

public class WaterfallDevProcess implements DevProcess {
	
	private DeploymentProcess deploymnetprocess;
	//Injecting literal values thorugh configuration
	private String team;
	private String teamMember;
	
	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getTeamMember() {
		return teamMember;
	}

	public void setTeamMember(String teamMember) {
		this.teamMember = teamMember;
	}

	//Setter DI
	public void setDeploymentType(DeploymentProcess deploymentProcess) {
		this.deploymnetprocess = deploymentProcess;
	}

	@Override
	public String getDesign() {
		
		return "Design whole project in waterfall model";
	}

	@Override
	public String getImplementation() {
		
		return "Implemetation whole project in waterfall model";
	}

	@Override
	public String getTest() {
		
		return "Testing whole project in waterfall model";
	}

	@Override
	public String getDeploymentType() {
		
		return deploymnetprocess.getDeployment();
	}

}
