package com.nic.model;

import java.util.List;

public class DocumentDetailsBean {

	   int sr_code,reg_year, doct_no,book_no,statusCode;
	   private String survyNumbser;
	   private String allotment_id="";

  
	public String getAllotment_id() {
		return allotment_id;
	}
	public void setAllotment_id(String allotment_id) {
		this.allotment_id = allotment_id;
	}
	public boolean isCheckeditem() {
		return checkeditem;
	}
	
	
	public boolean getCheckeditem() {
		return checkeditem;
	}
	
	public void setCheckeditem(boolean checkeditem) {
		this.checkeditem = checkeditem;
	}
	public String getSurvyNumbser() {
		return survyNumbser;
	}
	public void setSurvyNumbser(String survyNumbser) {
		this.survyNumbser = survyNumbser;
	}
	public int getSr_code() {
		return sr_code;
	}
	public void setSr_code(int sr_code) {
		this.sr_code = sr_code;
	}
	public int getReg_year() {
		return reg_year;
	}
	public void setReg_year(int reg_year) {
		this.reg_year = reg_year;
	}
	public int getDoct_no() {
		return doct_no;
	}
	public void setDoct_no(int doct_no) {
		this.doct_no = doct_no;
	}
	public int getBook_no() {
		return book_no;
	}
	public void setBook_no(int book_no) {
		this.book_no = book_no;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public double getExtent() {
		return Extent;
	}
	public void setExtent(double extent) {
		Extent = extent;
	}
	public String getExtentUnits() {
		return ExtentUnits;
	}
	public void setExtentUnits(String extentUnits) {
		ExtentUnits = extentUnits;
	}
	public String getBuildunit() {
		return buildunit;
	}
	public void setBuildunit(String buildunit) {
		this.buildunit = buildunit;
	}
	public String getMarketValue() {
		return marketValue;
	}
	public void setMarketValue(String marketValue) {
		this.marketValue = marketValue;
	}
	public String getBuildarea() {
		return buildarea;
	}
	public void setBuildarea(String buildarea) {
		this.buildarea = buildarea;
	}
	public String getDoct_location() {
		return doct_location;
	}
	public void setDoct_location(String doct_location) {
		this.doct_location = doct_location;
	}
	public String getDocumentType() {
		return documentType;
	}
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
	public String getNorth() {
		return north;
	}
	public void setNorth(String north) {
		this.north = north;
	}
	public String getSouth() {
		return south;
	}
	public void setSouth(String south) {
		this.south = south;
	}
	public String getEast() {
		return east;
	}
	public void setEast(String east) {
		this.east = east;
	}
	public String getWest() {
		return west;
	}
	public void setWest(String west) {
		this.west = west;
	}
	public String getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}
	public String getSurvyNumber() {
		return survyNumber;
	}
	public void setSurvyNumber(String survyNumber) {
		this.survyNumber = survyNumber;
	}
	public String getSchedule_no() {
		return schedule_no;
	}
	public void setSchedule_no(String schedule_no) {
		this.schedule_no = schedule_no;
	}
	public List getOwnerdetails() {
		return ownerdetails;
	}
	public void setOwnerdetails(List ownerdetails) {
		this.ownerdetails = ownerdetails;
	}
	public String getErrMsg() {
		return errMsg;
	}
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	double Extent;
	   String ExtentUnits,buildunit,marketValue,buildarea, doct_location,documentType,north,south,east,west,registrationDate,survyNumber,schedule_no;
	   List ownerdetails;
	   String errMsg;
	   boolean checkeditem;
	
}
