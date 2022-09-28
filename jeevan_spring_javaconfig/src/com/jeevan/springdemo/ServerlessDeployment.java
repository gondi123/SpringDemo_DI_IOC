package com.jeevan.springdemo;

public class ServerlessDeployment  implements DeploymentProcess{

	@Override
	public String getDeployemnt() {
		
		return "This is serverless deployemnt!";
	}

}
