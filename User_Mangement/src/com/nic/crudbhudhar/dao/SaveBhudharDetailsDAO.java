package com.nic.crudbhudhar.dao;

import java.util.List;

import com.nic.model.DocumentDetailsBean;

import common.LandDetailsBean;
import common.LandListDetails;

public interface SaveBhudharDetailsDAO {
	
	
	
	public List<LandDetailsBean> saveBhudharDetails(List<LandDetailsBean> listDetails);
	
	public List<DocumentDetailsBean> saveDocumentDetails(List<DocumentDetailsBean> documnetDetails); 
	
	public List<LandListDetails> retriveBhudharDetails();



}
