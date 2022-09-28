package com.jeevan.springdemo;

import org.springframework.stereotype.Component;

@Component
public class ServerDeployment implements DeploymentProcess {

	@Override
	public String getDeployemnt() {
		
		return "Server Deployment!";
	}

}
