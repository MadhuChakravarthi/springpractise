package com.nic.crudbhudhar.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.nic.usermanagement.model.CategoryBean;
import com.nic.usermanagement.model.PublicationBean;

public class PublicationDAOImpl implements PublicationDAO {

	@Override
	public void addPubliction(PublicationBean pubBean) {
		
		hibernateTemplate.save(pubBean);
	
	}

	

	

private HibernateTemplate hibernateTemplate;





public HibernateTemplate getHibernateTemplate() {
	return hibernateTemplate;
}





public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
	this.hibernateTemplate = hibernateTemplate;
}





@Override
public List<CategoryBean> getListofCategories() {
	
	return hibernateTemplate.find("from CategoryBean");
}




}
