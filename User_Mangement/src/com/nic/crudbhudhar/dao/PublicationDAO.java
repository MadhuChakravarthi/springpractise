package com.nic.crudbhudhar.dao;

import java.util.List;

import com.nic.usermanagement.model.CategoryBean;
import com.nic.usermanagement.model.PublicationBean;

public interface PublicationDAO {
	
	public void addPubliction(PublicationBean pubBean);
	
	public List<CategoryBean> getListofCategories();	

}
