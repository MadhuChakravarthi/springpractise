package com.nic.usermanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="publications")
public class PublicationBean {
@Id	
@Column(name="pubid")
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="publications_pubid_seq")
@SequenceGenerator(name="publications_pubid_seq", sequenceName="publications_pubid_seq", allocationSize=1)
private Integer publicationID;
@Column(name="content")
private String pubContent;

@OneToOne
@JoinColumn(name="categoryid")
private CategoryBean categoryBean;



public String getPubContent() {
	return pubContent;
}

public void setPubContent(String pubContent) {
	this.pubContent = pubContent;
}




public CategoryBean getCategoryBean() {
	return categoryBean;
}

public void setCategoryBean(CategoryBean categoryBean) {
	this.categoryBean = categoryBean;
}



public Integer getPublicationID() {
	return publicationID;
}

public void setPublicationID(Integer publicationID) {
	this.publicationID = publicationID;
}	

	
	
}
