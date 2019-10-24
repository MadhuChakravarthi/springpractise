// default package
// Generated Oct 4, 2017 3:58:12 PM by Hibernate Tools 5.2.1.Final
package com.nic.projectproposal.model;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * PhysicalTarget generated by hbm2java
 */
@Entity
@Table(name = "physical_target", schema = "public")
public class PhysicalTarget implements java.io.Serializable {


	

	private Integer physicaltargetId;
	@Id
	@Column(name = "physicaltarget_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "physical_target_physicaltarget_id_seq")
	@SequenceGenerator(name = "physical_target_physicaltarget_id_seq", sequenceName = "physical_target_physicaltarget_id_seq", allocationSize = 1)
	public Integer getPhysicaltargetId() {
		return physicaltargetId;
	}

	public void setPhysicaltargetId(Integer physicaltargetId) {
		this.physicaltargetId = physicaltargetId;
	}








	
	private List<PhysicalTargetTrngwiseTargets> physicalTargetTrngwiseTargets;
	@OneToMany
	@JoinColumn(name="physicaltarget_id")
	public List<PhysicalTargetTrngwiseTargets> getPhysicalTargetTrngwiseTargets() {
		return physicalTargetTrngwiseTargets;
	}

	public void setPhysicalTargetTrngwiseTargets(List<PhysicalTargetTrngwiseTargets> physicalTargetTrngwiseTargets) {
		this.physicalTargetTrngwiseTargets = physicalTargetTrngwiseTargets;
	}

	

	

	
	private String statecode;
	@Column(name = "statecode")
	public String getStatecode() {
		return this.statecode;
	}

	public void setStatecode(String statecode) {
		this.statecode = statecode;
	}
 /*   @Transient
	@Column(name = "propose_duration")
	public Integer getProposeDuration() {
		return this.proposeDuration;
	}

	public void setProposeDuration(Integer proposeDuration) {
		this.proposeDuration = proposeDuration;
	}
	@Transient
	@Column(name = "propose_trng_target")
	public Integer getProposeTrngTarget() {
		return this.proposeTrngTarget;
	}

	public void setProposeTrngTarget(Integer proposeTrngTarget) {
		this.proposeTrngTarget = proposeTrngTarget;
	}*/

	

}
