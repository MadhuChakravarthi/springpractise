package com.nic.usermanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="dist_sr_master")
public class District {

	
	@Id
	private String sr_cd;
	private String distcd;
	private String drname;
	private String sr_name;
	
	
	public String getDistcd() {
		return distcd;
	}
	public void setDistcd(String distcd) {
		this.distcd = distcd;
	}
	public String getDrname() {
		return drname;
	}
	public void setDrname(String drname) {
		this.drname = drname;
	}
	public String getSr_name() {
		return sr_name;
	}
	public void setSr_name(String sr_name) {
		this.sr_name = sr_name;
	}
	public String getSr_cd() {
		return sr_cd;
	}
	public void setSr_cd(String sr_cd) {
		this.sr_cd = sr_cd;
	}
	
	
	
}
