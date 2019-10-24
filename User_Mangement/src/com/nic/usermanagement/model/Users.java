package com.nic.usermanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "USER_MST")
public class Users {

	@Id
	@Column(name="Id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="user_mst_id_seq")
	@SequenceGenerator(name="user_mst_id_seq", sequenceName="user_mst_id_seq", allocationSize=1)

	private Integer id;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
	@Column(name="user_name")
	@Size(min=2,max=4,message="Improper DATA")
	@Pattern(regexp="[^0-9]*",message="Special Characters Were Not Allowed")
	private String username;
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	
	@Column(name="password")
	private String password;
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
	@Column(name="email")
	private String email;
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
	
	@Column(name = "mobile")
	private String mobileno;
	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	
	@Column(name = "role_id")
	private Integer roleid;
	public Integer getRoleid() {
		return roleid;
	}

	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}
	

}
