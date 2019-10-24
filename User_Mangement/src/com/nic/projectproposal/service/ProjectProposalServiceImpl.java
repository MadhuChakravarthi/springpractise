package com.nic.projectproposal.service;

import com.nic.projectproposal.dao.ProjectProposalDAO;

import com.nic.projectproposal.model.PpCategoryDetails;
import com.nic.projectproposal.model.PpGeneralDetails;
import com.nic.projectproposal.model.PpOutsourcingOfTheProjectActivities;
import com.nic.projectproposal.model.PpWelfareCost;


public class ProjectProposalServiceImpl implements ProjectProposalService {

	@Override
	public Integer generalCreation(PpGeneralDetails user) {
		
		return generaldao.generalCreation(user);
	}





private ProjectProposalDAO generaldao;




public ProjectProposalDAO getGeneraldao() {
	return generaldao;
}




public void setGeneraldao(ProjectProposalDAO generaldao) {
	this.generaldao = generaldao;
}




@Override
public void categoryCreation(PpCategoryDetails user) {
	
	generaldao.categoryCreation(user);
	
}




@Override
public void welfareCreation(PpWelfareCost user) {
	
	generaldao.welfareCreation(user);
}




@Override
public void outsourceCreation(PpOutsourcingOfTheProjectActivities user) {
	// TODO Auto-generated method stub
	generaldao.outsourceCreation(user);
}


	
    
	
}










