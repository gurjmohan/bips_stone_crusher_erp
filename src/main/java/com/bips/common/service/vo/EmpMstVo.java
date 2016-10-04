package com.bips.common.service.vo;

import java.util.Date;

public class EmpMstVo {

	private long empId;
	private String empName;
	private String pwd;
	private String emailId;
	private String mobileNo;
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public byte getActiveFlag() {
		return activeFlag;
	}
	public void setActiveFlag(byte activeFlag) {
		this.activeFlag = activeFlag;
	}
	public String getCrtUser() {
		return crtUser;
	}
	public void setCrtUser(String crtUser) {
		this.crtUser = crtUser;
	}
	public Date getCrtTime() {
		return crtTime;
	}
	public void setCrtTime(Date crtTime) {
		this.crtTime = crtTime;
	}
	public String getLstUpdtUser() {
		return lstUpdtUser;
	}
	public void setLstUpdtUser(String lstUpdtUser) {
		this.lstUpdtUser = lstUpdtUser;
	}
	public Date getLstUpdtTime() {
		return lstUpdtTime;
	}
	public void setLstUpdtTime(Date lstUpdtTime) {
		this.lstUpdtTime = lstUpdtTime;
	}
	private byte activeFlag;
	private String crtUser;
	private Date crtTime;
	private String lstUpdtUser;
	private Date lstUpdtTime;

}
