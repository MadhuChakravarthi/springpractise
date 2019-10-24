package com.nic.crudbhudhar.service;

import java.util.List;

import com.nic.model.DocumentDetailsBean;

import common.LandDetailsBean;
import common.LandListDetails;

public interface SaveBhudharService {
	
	
	
	public List<LandDetailsBean> saveBhudharDetails(List<LandDetailsBean> listDetail);
	
	
	public List<DocumentDetailsBean> saveCardDetails(List<DocumentDetailsBean> cardDetail);
	
	public List<LandListDetails> retriveBhudharDetails();



}
