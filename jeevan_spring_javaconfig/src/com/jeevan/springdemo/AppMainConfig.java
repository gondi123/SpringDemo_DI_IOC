package com.jeevan.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.jeevan.springdemo")
@PropertySource("classpath:application.properties")
public class AppMainConfig {
	
	//define bean for deployment process which is serverless deployemnt
	@Bean
	public DeploymentProcess deploymentProcess() {
		return new ServerlessDeployment();
		
	}
	
	/**
	 * define bean for dev process which is waterfall dev process 
	 * and injecting deploymentProcess in Java based Spring config for
	 * bean definiton and DI
	 * 
	 */
	@Bean
	public WaterfallDevProcess devProcess() {
		WaterfallDevProcess devProcess = new WaterfallDevProcess(deploymentProcess());
		return devProcess;
	}

}
