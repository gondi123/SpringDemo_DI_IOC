package com.jeevan.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class KanbanDevProcess implements DevProcess {
	
	/**
	 * Im using field injection instead of Setter injection
	 */
	@Autowired
	@Qualifier("serverDeployment")
	private DeploymentProcess deploymentProcess;
	
	@Value("${team}")
	private String team;
	
	public String getTeam() {
		return team;
	}

	public String getTeamMember() {
		return teamMember;
	}

	@Value("${teamMember}")
	private String teamMember;
	
	public KanbanDevProcess() {}
	
	@PostConstruct
	public void initBean() {
		System.out.println("Bean Initalization");
	}
	
	/*@Autowired
	public void setKanbanDeployment(DeploymentProcess deploymentProcess) {
		this.deploymentProcess = deploymentProcess;
	}*/

	@Override
	public String getDesign() {
		
		return "Kanban model: Desgin small task of a project";
	}

	@Override
	public String getDeploymentType() {
		return deploymentProcess.getDeployemnt();
	}
	
	@PreDestroy
	public void destroyBean() {
		System.out.println("Bean Destroy");
	}

}
