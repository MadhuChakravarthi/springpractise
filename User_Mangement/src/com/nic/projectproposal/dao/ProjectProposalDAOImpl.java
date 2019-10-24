package com.nic.projectproposal.dao;



import javax.sql.DataSource;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.nic.projectproposal.model.PpCategoryDetails;
import com.nic.projectproposal.model.PpGeneralDetails;
import com.nic.projectproposal.model.PpOutsourcingOfTheProjectActivities;
import com.nic.projectproposal.model.PpWelfareCost;





public class ProjectProposalDAOImpl   extends GenericDaoImpl<PpGeneralDetails, Integer> implements ProjectProposalDAO {


	
    private HibernateTemplate hibernateTemplate;
	
    private DataSource dataSource; 
    
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}


	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	
	}


	@Override
	public int generalCreation(PpGeneralDetails user) {
		return (int)hibernateTemplate.save(user);
		
	}


	@Override
	public void categoryCreation(PpCategoryDetails user) {
		
		hibernateTemplate.save(user);
		
	}


	@Override
	public void welfareCreation(PpWelfareCost user) {
		
		hibernateTemplate.save(user);
		
	}


	@Override
	public void outsourceCreation(PpOutsourcingOfTheProjectActivities user) {
		
		hibernateTemplate.save(user);
	}

	

	





	


	




}
