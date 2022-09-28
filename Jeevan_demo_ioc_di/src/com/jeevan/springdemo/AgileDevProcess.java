package com.jeevan.springdemo;

public class AgileDevProcess implements DevProcess {
	
	private DeploymentProcess deploymentProcess;
	
	//must initalize no-arg constructor if any constructor is mentioned
	public AgileDevProcess() {}
	
	//Constructor DI
	public AgileDevProcess(DeploymentProcess deploymentProcess) {
		this.deploymentProcess = deploymentProcess;
	}
	

	@Override
	public String getDesign() {
		
		return "Design in Agile is for Specific task of project";
	}

	@Override
	public String getImplementation() {
		
		return "Implemetation in Agile is for Specific task of project";
	}

	@Override
	public String getTest() {
	
		return "Testing in Agile is for Specific task of project";
	}

	@Override
	public String getDeploymentType() {
		
		return deploymentProcess.getDeployment();
	}
	
	public void handleInitBean() {
		System.out.println("Initalizng Bean");
	}
	
	public void handleDestroyBean() {
		System.out.println("Destroying Bean");
	}

}
