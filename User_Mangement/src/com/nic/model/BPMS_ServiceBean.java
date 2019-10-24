package com.nic.model;

import java.util.ArrayList;
import java.util.List;

public class BPMS_ServiceBean {

private List<DocumentDetailsBean> detailsBean=new ArrayList<DocumentDetailsBean>();


	public List<DocumentDetailsBean> getDetailsBean() {
		return detailsBean;
	}
	public void setDetailsBean(List<DocumentDetailsBean> detailsBean) {
		this.detailsBean = detailsBean;
	}
	private List ownerNamesList;
	private String errMsg;
	private int statusCode;
	
	public List getOwnerNamesList() {
		return ownerNamesList;
	}
	public void setOwnerNamesList(List ownerNamesList) {
		this.ownerNamesList = ownerNamesList;
	}
	public String getErrMsg() {
		return errMsg;
	}
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	
	
	
}
