package com.nic.crudbhudhar.service;

import java.util.List;

import com.nic.usermanagement.model.CategoryBean;
import com.nic.usermanagement.model.PublicationBean;

public interface PublicationService 
{

public List<CategoryBean> getListofCategories();	

public void addPubliction(PublicationBean pubService);

}








