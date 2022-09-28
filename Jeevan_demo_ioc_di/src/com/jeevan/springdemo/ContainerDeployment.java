package com.jeevan.springdemo;

import java.util.Random;

public class ContainerDeployment implements DeploymentProcess {

	String[] arr= {"Deploying application as contianer in GKE",
			"Deploying application as contianer in AWS K8s",
			"Deploying application as contianer in Azure k8s"};
	
	// create a random number generator
	private Random myRandom = new Random();
	
	@Override
	public String getDeployment() {
		
		int index = myRandom.nextInt(arr.length);
		return arr[index];
	}

}
