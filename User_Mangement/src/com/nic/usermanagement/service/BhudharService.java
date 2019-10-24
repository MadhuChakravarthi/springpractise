package com.nic.usermanagement.service;

import java.util.Map;

import com.nic.usermanagement.model.BhudharRegistration;

public interface BhudharService {
	
	
	public BhudharRegistration saveBhudharRegistration(BhudharRegistration bhudhar);
   	
	public BhudharRegistration BhudharDetailsById(Integer bhudharid);
	

	public Map getDistricts(String statecode);	
	public Map getVillages();
	
	
	public Map getMandals();
}
