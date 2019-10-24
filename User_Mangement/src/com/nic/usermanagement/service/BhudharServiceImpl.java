package com.nic.usermanagement.service;
import java.util.Map;

import com.nic.usermanagement.dao.BhudharDAO;
import com.nic.usermanagement.model.BhudharRegistration;

public class BhudharServiceImpl implements BhudharService {


	private BhudharDAO bhudharDAO;

	
	public void setBhudharDAO(BhudharDAO bhudharDAO) {
		this.bhudharDAO = bhudharDAO;
	}


	@Override
	public BhudharRegistration saveBhudharRegistration(BhudharRegistration bhudhar) {
	 	
	 return bhudharDAO.bhudharRegistration(bhudhar);
	
	}


	@Override
	public BhudharRegistration BhudharDetailsById(Integer bhudharid) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	public Map getDistricts(String statecode) {
		
return bhudharDAO.getDistricts(statecode); 
		
	
	
	}


	@Override
	public Map getVillages() {

	return bhudharDAO.getVillages();
	
	}


	@Override
	public Map getMandals() {

	return bhudharDAO.getMandals();
	
	}
	



	


	


	
}

