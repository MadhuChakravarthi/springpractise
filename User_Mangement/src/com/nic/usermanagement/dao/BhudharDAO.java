package com.nic.usermanagement.dao;

import java.util.Map;

import com.nic.usermanagement.model.BhudharRegistration;

public interface BhudharDAO {
	
	
	public BhudharRegistration bhudharRegistration(BhudharRegistration bhurdetails);
	
	public BhudharRegistration BhudharDetailsById(Integer bhudharid);

	BhudharRegistration bhudharDetailsById(Integer bhudharid);
	
public Map getDistricts(String statecode);
	
	
	public Map getVillages();
	
	
	public Map getMandals();
}
