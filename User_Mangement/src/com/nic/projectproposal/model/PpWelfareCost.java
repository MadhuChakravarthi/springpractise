
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

@Entity
@Table(name = "pp_welfare_cost", schema = "public")
public class PpWelfareCost implements java.io.Serializable {

	private int projectWelfareId;
	private Integer projectProposalId;
	private String retentionSupport;
	private String carrerProgression;
	private String foreignPlacement;
	private String roleId;
	private String createdBy;
	private String modifiedBy;
	private Date createdDate;
	private Date modifiedDate;

	public PpWelfareCost() {
	}

	public PpWelfareCost(int projectWelfareId) {
		this.projectWelfareId = projectWelfareId;
	}

	public PpWelfareCost(int projectWelfareId, Integer projectProposalId, String retentionSupport,
			String carrerProgression, String foreignPlacement, String roleId, String createdBy, String modifiedBy,
			Date createdDate, Date modifiedDate) {
		this.projectWelfareId = projectWelfareId;
		this.projectProposalId = projectProposalId;
		this.retentionSupport = retentionSupport;
		this.carrerProgression = carrerProgression;
		this.foreignPlacement = foreignPlacement;
		this.roleId = roleId;
		this.createdBy = createdBy;
		this.modifiedBy = modifiedBy;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
	}

	@Id
	@Column(name="project_welfare_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="pp_welfare_cost_project_welfare_id_seq")
	@SequenceGenerator(name="pp_welfare_cost_project_welfare_id_seq", sequenceName="pp_welfare_cost_project_welfare_id_seq", allocationSize=1)
	public int getProjectWelfareId() {
		return this.projectWelfareId;
	}

	public void setProjectWelfareId(int projectWelfareId) {
		this.projectWelfareId = projectWelfareId;
	}

	@Column(name = "project_proposal_id")
	public Integer getProjectProposalId() {
		return this.projectProposalId;
	}

	public void setProjectProposalId(Integer projectProposalId) {
		this.projectProposalId = projectProposalId;
	}

	@Column(name = "retention_support")
	public String getRetentionSupport() {
		return this.retentionSupport;
	}

	public void setRetentionSupport(String retentionSupport) {
		this.retentionSupport = retentionSupport;
	}

	@Column(name = "carrer_progression")
	public String getCarrerProgression() {
		return this.carrerProgression;
	}

	public void setCarrerProgression(String carrerProgression) {
		this.carrerProgression = carrerProgression;
	}

	@Column(name = "foreign_placement")
	public String getForeignPlacement() {
		return this.foreignPlacement;
	}

	public void setForeignPlacement(String foreignPlacement) {
		this.foreignPlacement = foreignPlacement;
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
	@Column(name = "created_date", length = 13)
	@Transient
	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "modified_date", length = 13)
	@Transient
	public Date getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

}
