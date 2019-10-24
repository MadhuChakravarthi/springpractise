package com.nic.usermanagement.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="bhudhar")
public class BhudharRegistration {

	
		@Id
		@Column(name="bhudharid")
		@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="bhudhar_bhudharid_seq")
		@SequenceGenerator(name="bhudhar_bhudharid_seq", sequenceName="bhudhar_bhudharid_seq", allocationSize=1)
		private Integer bhudharId;
		private String propertytaxid;
		private String state;
		private String village;
		private String locality;
		private String surveyno;
		private String plotno;
		private String electricityserviceid;
		private String propertyextent;
		private String address;
		private String district;
		private String hamlet;
		private String pincode;
		private String houseno;
		private String flatno;
		private String waterid;
		private String unitsid;
		
		
		public Integer getBhudharId() {
			return bhudharId;
		}
		public void setBhudharId(Integer bhudharId) {
			this.bhudharId = bhudharId;
		}
		
		
		public String getPropertytaxid() {
			return propertytaxid;
		}
		
		
		public void setPropertytaxid(String propertytaxid) {
			this.propertytaxid = propertytaxid;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getVillage() {
			return village;
		}
		public void setVillage(String village) {
			this.village = village;
		}
		public String getLocality() {
			return locality;
		}
		public void setLocality(String locality) {
			this.locality = locality;
		}
		public String getSurveyno() {
			return surveyno;
		}
		public void setSurveyno(String surveyno) {
			this.surveyno = surveyno;
		}
		public String getPlotno() {
			return plotno;
		}
		public void setPlotno(String plotno) {
			this.plotno = plotno;
		}
		public String getElectricityserviceid() {
			return electricityserviceid;
		}
		public void setElectricityserviceid(String electricityserviceid) {
			this.electricityserviceid = electricityserviceid;
		}
		public String getPropertyextent() {
			return propertyextent;
		}
		public void setPropertyextent(String propertyextent) {
			this.propertyextent = propertyextent;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getDistrict() {
			return district;
		}
		public void setDistrict(String district) {
			this.district = district;
		}
		public String getHamlet() {
			return hamlet;
		}
		public void setHamlet(String hamlet) {
			this.hamlet = hamlet;
		}
		public String getPincode() {
			return pincode;
		}
		public void setPincode(String pincode) {
			this.pincode = pincode;
		}
		public String getHouseno() {
			return houseno;
		}
		public void setHouseno(String houseno) {
			this.houseno = houseno;
		}
		public String getFlatno() {
			return flatno;
		}
		public void setFlatno(String flatno) {
			this.flatno = flatno;
		}
		public String getWaterid() {
			return waterid;
		}
		public void setWaterid(String waterid) {
			this.waterid = waterid;
		}
		public String getUnitsid() {
			return unitsid;
		}
		public void setUnitsid(String unitsid) {
			this.unitsid = unitsid;
		}
		
		
		
}		



		 
		