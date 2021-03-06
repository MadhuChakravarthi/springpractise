// default package
// Generated Sep 18, 2017 5:06:03 PM by Hibernate Tools 5.2.1.Final
package com.nic.projectproposal.model;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 * PpCategoryDetails generated by hbm2java
 */
@Entity
@Table(name = "pp_category_details", schema = "public")
public class PpCategoryDetails implements java.io.Serializable {

	private int ppCategoryId;
	private Integer categoryType;
	private Integer project_proposal_id;
	

	private String fundingEligibilityDetailsF1;
	private String fundingEligibilityDetailsF2;
	private String fundingEligibilityDetailsF3;
	private String fundingEligibilityDetailsF4;
	private String fundingEligibilityDetailsF5;
	private String fundingEligibilityDetailsF6;
	private String roleId;
	private String createdBy;
	private String modifiedBy;
	private Date createdDate;
	private Date modifiedDate;

	public PpCategoryDetails() {
	}

	public PpCategoryDetails(int ppCategoryId) {
		this.ppCategoryId = ppCategoryId;
	}

	public PpCategoryDetails(int ppCategoryId, Integer categoryType, String fundingEligibilityDetailsF1,
			String fundingEligibilityDetailsF2, String fundingEligibilityDetailsF3, String fundingEligibilityDetailsF4,
			String fundingEligibilityDetailsF5, String fundingEligibilityDetailsF6, String roleId, String createdBy,
			String modifiedBy, Date createdDate, Date modifiedDate) {
		this.ppCategoryId = ppCategoryId;
		this.categoryType = categoryType;
		this.fundingEligibilityDetailsF1 = fundingEligibilityDetailsF1;
		this.fundingEligibilityDetailsF2 = fundingEligibilityDetailsF2;
		this.fundingEligibilityDetailsF3 = fundingEligibilityDetailsF3;
		this.fundingEligibilityDetailsF4 = fundingEligibilityDetailsF4;
		this.fundingEligibilityDetailsF5 = fundingEligibilityDetailsF5;
		this.fundingEligibilityDetailsF6 = fundingEligibilityDetailsF6;
		this.roleId = roleId;
		this.createdBy = createdBy;
		this.modifiedBy = modifiedBy;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
	}

	@Id
	@Column(name="pp_category_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="pp_category_details_pp_category_id_seq")
	@SequenceGenerator(name="pp_category_details_pp_category_id_seq", sequenceName="pp_category_details_pp_category_id_seq", allocationSize=1)
	
	public int getPpCategoryId() {
		return this.ppCategoryId;
	}

	public void setPpCategoryId(int ppCategoryId) {
		this.ppCategoryId = ppCategoryId;
	}

	
	@Column(name = "project_proposal_id")
	public Integer getProject_proposal_id() {
		return project_proposal_id;
	}

	public void setProject_proposal_id(Integer project_proposal_id) {
		this.project_proposal_id = project_proposal_id;
	}
	
	
	@Column(name = "category_type")
	public Integer getCategoryType() {
		return this.categoryType;
	}

	public void setCategoryType(Integer categoryType) {
		this.categoryType = categoryType;
	}

	@Column(name = "funding_eligibility_details_f1")
	public String getFundingEligibilityDetailsF1() {
		return this.fundingEligibilityDetailsF1;
	}

	public void setFundingEligibilityDetailsF1(String fundingEligibilityDetailsF1) {
		this.fundingEligibilityDetailsF1 = fundingEligibilityDetailsF1;
	}

	@Column(name = "funding_eligibility_details_f2")
	public String getFundingEligibilityDetailsF2() {
		return this.fundingEligibilityDetailsF2;
	}

	public void setFundingEligibilityDetailsF2(String fundingEligibilityDetailsF2) {
		this.fundingEligibilityDetailsF2 = fundingEligibilityDetailsF2;
	}

	@Column(name = "funding_eligibility_details_f3")
	public String getFundingEligibilityDetailsF3() {
		return this.fundingEligibilityDetailsF3;
	}

	public void setFundingEligibilityDetailsF3(String fundingEligibilityDetailsF3) {
		this.fundingEligibilityDetailsF3 = fundingEligibilityDetailsF3;
	}

	@Column(name = "funding_eligibility_details_f4")
	public String getFundingEligibilityDetailsF4() {
		return this.fundingEligibilityDetailsF4;
	}

	public void setFundingEligibilityDetailsF4(String fundingEligibilityDetailsF4) {
		this.fundingEligibilityDetailsF4 = fundingEligibilityDetailsF4;
	}

	@Column(name = "funding_eligibility_details_f5")
	public String getFundingEligibilityDetailsF5() {
		return this.fundingEligibilityDetailsF5;
	}

	public void setFundingEligibilityDetailsF5(String fundingEligibilityDetailsF5) {
		this.fundingEligibilityDetailsF5 = fundingEligibilityDetailsF5;
	}

	@Column(name = "funding_eligibility_details_f6")
	public String getFundingEligibilityDetailsF6() {
		return this.fundingEligibilityDetailsF6;
	}

	public void setFundingEligibilityDetailsF6(String fundingEligibilityDetailsF6) {
		this.fundingEligibilityDetailsF6 = fundingEligibilityDetailsF6;
	}

	@Column(name = "role_id")
	@Transient
	public String getRoleId() {
		return this.roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	@Column(name = "created_by")
	@Transient
	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Column(name = "modified_by")
	@Transient
	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	@Temporal(TemporalType.DATE)
	@Transient
	@Column(name = "created_date", length = 13)
	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "modified_date", length = 13)
	public Date getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

}
