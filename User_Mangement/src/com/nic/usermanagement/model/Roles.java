package com.nic.usermanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="roles")	
public class Roles {
	
	@Id
	@Column(name="role_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="roles_id_seq")
	@SequenceGenerator(name="roles_id_seq", sequenceName="roles_id_seq", allocationSize=1)
	private Integer role_id;
	private String role_name;
	
	public Integer getRole_id() {
		return role_id;
	}
	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}
    @Column(name="role_name")
	public String getRole_name() {
		return role_name;
	}
   
    
   public void setRole_name(String role_name) {
		this.role_name = role_name;
	}



	



	

	
	

}
