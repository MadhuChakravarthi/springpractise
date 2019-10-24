package com.nic.dyna;

public class Contact {
	
	
	private String  name,sex,contactid;
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getSex() {
		return sex;
	}



	public void setSex(String sex) {
		this.sex = sex;
	}



	public String getContactid() {
		return contactid;
	}



	public void setContactid(String contactid) {
		this.contactid = contactid;
	}

public Contact(){}

	public Contact(String name, String sex, String contactid) 
	{
	    this.contactid=contactid;
		this.name = name;
		this.sex = sex;
	}
	
	
	
	
	
	

}
