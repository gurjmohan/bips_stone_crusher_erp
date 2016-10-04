package com.bips.common.service.vo;

import java.util.Date;

public class EmpGrpMpgVo {
private long  grpId;
private String grpName;
private byte activeFlag;
private String crtUser;
public long getGrpId() {
	return grpId;
}
public void setGrpId(long grpId) {
	this.grpId = grpId;
}
public String getGrpName() {
	return grpName;
}
public void setGrpName(String grpName) {
	this.grpName = grpName;
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
private Date crtTime;
private String lstUpdtUser;
private Date lstUpdtTime;

}
