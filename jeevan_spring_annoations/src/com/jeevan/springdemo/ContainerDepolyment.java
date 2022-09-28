package com.jeevan.springdemo;

import org.springframework.stereotype.Component;

@Component
public class ContainerDepolyment implements DeploymentProcess {

	@Override
	public String getDeployemnt() {
		
		return "Container Deployemnt of project";
	}

}
