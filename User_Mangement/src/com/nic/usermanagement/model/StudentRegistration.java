package com.nic.usermanagement.model;

import java.sql.Blob;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.criteria.CriteriaBuilder.In;

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicBean1;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;


@Entity
@Table(name = "regdetails")
public class StudentRegistration {

	
	@Id
	@Column(name="studentid")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="regdetails_studentid_seq")
	@SequenceGenerator(name="regdetails_studentid_seq", sequenceName="regdetails_studentid_seq", allocationSize=1)
	private  Integer studentid;

	@Column(name="filename")
	private String filename;
	
	@Column(name="photoname")
	private String photoname;
	
	public String getPhotoname() {
		return photoname;
	}

	public void setPhotoname(String photoname) {
		this.photoname = photoname;
	}
	@Transient
	public MultipartFile photo;

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	
	@Transient
	public MultipartFile file;
	
	public MultipartFile getPhoto() {
		return photo;
	}

	public void setPhoto(MultipartFile photo) {
		this.photo = photo;
	}

	

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	@Column(name="htno")
	private String htno;
	
	@Column(name="year")
	private Integer year;
	
	@Column(name="name")
	private String name;

	@Column(name="board")
	private String board;
	
	@Column(name="fname")
	private String fname;

	@Column(name="sex")
	private String sex;

	@Transient
	@Column(name="dob")
	private Date dob;

	@Column(name="nstate")
	private String nstate;
	
	
	
	@Column(name="ndistrict")
	private String ndistrict;
	
	@Column(name="present")
	private String present;

	@Column(name="urduasst")
	private String urduasst;
	
	
	@Column(name="state")
	private String state;
	
	@Column(name="district")
	private String district;

	@Column(name="address")
	private String address;
	
	@Column(name="statep")
	private String stateap;
	
	@Column(name="districtp")
	private String districtp;


	@Column(name="addressp")
	private String addressp;
	
	@Column(name="upstatus")
	private String upstatus;
	
	@Column(name="towncenter")
	private String towncenter;

	@Column(name="region")
	private String region;


	@Transient
	@Column(name="signature")
	private String signature;

	@Column(name="handicap")
	private String handicap;

	@Column(name="ncc")
	private String ncc;

	@Column(name="sports")
	private String sports;

	@Column(name="cap")
	private String cap;

	@Column(name="declaration")
	private String declaration;

	@Column(name="pincode")
	private String pincode;
	
	@Column(name="pincodep")
	private String pincodep;
	
	
	@Column(name="aadhar")
	private String aadhar;
	
	
	@Column(name="mobile")
	private String mobile;

	

	public String getHtno() {
		return htno;
	}

	public Integer getStudentid() {
		return studentid;
	}

	public void setStudentid(Integer studentid) {
		this.studentid = studentid;
	}

	public void setHtno(String htno) {
		this.htno = htno;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrduasst() {
		return urduasst;
	}

	public void setUrduasst(String urduasst) {
		this.urduasst = urduasst;
	}

	public String getBoard() {
		return board;
	}

	public void setBoard(String board) {
		this.board = board;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getNstate() {
		return nstate;
	}

	public void setNstate(String nstate) {
		this.nstate = nstate;
	}

	public String getNdistrict() {
		return ndistrict;
	}

	public void setNdistrict(String ndistrict) {
		this.ndistrict = ndistrict;
	}

	public String getPresent() {
		return present;
	}

	public void setPresent(String present) {
		this.present = present;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStateap() {
		return stateap;
	}

	public void setStateap(String stateap) {
		this.stateap = stateap;
	}

	public String getDistrictp() {
		return districtp;
	}

	public void setDistrictp(String districtp) {
		this.districtp = districtp;
	}

	public String getAddressp() {
		return addressp;
	}

	public void setAddressp(String addressp) {
		this.addressp = addressp;
	}

	public String getUpstatus() {
		return upstatus;
	}

	public void setUpstatus(String upstatus) {
		this.upstatus = upstatus;
	}

	public String getTowncenter() {
		return towncenter;
	}

	public void setTowncenter(String towncenter) {
		this.towncenter = towncenter;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

		public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getHandicap() {
		return handicap;
	}

	public void setHandicap(String handicap) {
		this.handicap = handicap;
	}

	public String getNcc() {
		return ncc;
	}

	public void setNcc(String ncc) {
		this.ncc = ncc;
	}

	public String getSports() {
		return sports;
	}

	public void setSports(String sports) {
		this.sports = sports;
	}

	public String getCap() {
		return cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
	}

	public String getDeclaration() {
		return declaration;
	}

	public void setDeclaration(String declaration) {
		this.declaration = declaration;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getPincodep() {
		return pincodep;
	}

	public void setPincodep(String pincodep) {
		this.pincodep = pincodep;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	
	

}

