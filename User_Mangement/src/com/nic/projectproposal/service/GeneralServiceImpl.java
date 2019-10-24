package com.nic.projectproposal.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nic.projectproposal.dao.GenericDao;

import com.nic.projectproposal.model.PpGeneralDetails;







	@Service
	public class GeneralServiceImpl extends GenericServiceImpl<PpGeneralDetails, Integer>
	        implements GeneralService {

	    //private GeneralDAO generalDao;
	    public GeneralServiceImpl(){

	    }
	    @Autowired
	    public GeneralServiceImpl(
	           @Qualifier("generalDAOImpl") GenericDao<PpGeneralDetails, Integer> genericDao) {
	        super(genericDao);
	        //this.generalDao = (ProjectProposalGeneralDAO) genericDao;
	    }



}
