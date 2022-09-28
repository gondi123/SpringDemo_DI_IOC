package com.jeevan.springdemo;

public class ServerDeployment implements DeploymentProcess {

	@Override
	public String getDeployment() {
		
		return "Deployment is done on server machine";
	}

}
