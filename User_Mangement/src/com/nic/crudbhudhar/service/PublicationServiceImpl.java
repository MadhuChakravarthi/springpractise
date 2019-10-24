package com.nic.crudbhudhar.service;

import java.util.List;

import com.nic.crudbhudhar.dao.PublicationDAO;
import com.nic.crudbhudhar.service.PublicationService;
import com.nic.usermanagement.model.CategoryBean;
import com.nic.usermanagement.model.PublicationBean;

public class PublicationServiceImpl implements PublicationService {

	@Override
	public void addPubliction(PublicationBean pubService) {
		// TODO Auto-generated method stub
		
		publicationDAO.addPubliction(pubService);
		
	}

	public PublicationDAO getPublicationDAO() {
		return publicationDAO;
	}





	public void setPublicationDAO(PublicationDAO publicationDAO) {
		this.publicationDAO = publicationDAO;
	}

	


	




	@Override
	public List<CategoryBean> getListofCategories() {
		// TODO Auto-generated method stub
		return publicationDAO.getListofCategories();
	}


//9652398126


	private PublicationDAO publicationDAO;

	
}
