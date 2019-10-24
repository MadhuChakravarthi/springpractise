package com.nic.crudbhudhar.service;

import java.util.List;

import com.nic.crudbhudhar.dao.SaveBhudharDetailsDAO;
import com.nic.model.DocumentDetailsBean;

import common.LandDetailsBean;
import common.LandListDetails;

public class SaveBhudharServiceImpl implements SaveBhudharService {

	

	@Override
	public List<LandListDetails> retriveBhudharDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public List<LandDetailsBean> saveBhudharDetails(List<LandDetailsBean> listDetail) {
		List<LandDetailsBean> k=saveBhudhar.saveBhudharDetails(listDetail);
	    
		return k;
	}
	






public void setSaveBhudhar(SaveBhudharDetailsDAO saveBhudhar) {
	this.saveBhudhar = saveBhudhar;
}




@Override
public List<DocumentDetailsBean> saveCardDetails(List<DocumentDetailsBean> cardDetails) {
	
	List<DocumentDetailsBean> detailBean=saveBhudhar.saveDocumentDetails(cardDetails);
	return detailBean;
}





private SaveBhudharDetailsDAO saveBhudhar;








}
