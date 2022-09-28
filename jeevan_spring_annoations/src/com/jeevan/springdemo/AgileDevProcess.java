package com.jeevan.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AgileDevProcess implements DevProcess {
	
	/**
	 * Im using field injection instead of constructor injection
	 */
	
	@Autowired
	@Qualifier("containerDepolyment")
	private DeploymentProcess deploymentProcess;
	
	public AgileDevProcess() {}
	
	/*@Autowired
	public AgileDevProcess(DeploymentProcess deploymentProcess) {
		
		this.deploymentProcess = deploymentProcess;
	}*/

	@Override
	public String getDesign() {
		
		return "Agile : desgin task of samll unit of a project";
	}

	@Override
	public String getDeploymentType() {
		
		return deploymentProcess.getDeployemnt();
	}

}
