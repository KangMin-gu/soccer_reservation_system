package com.soccer.rv.reserve.dto;

public class ReserveDto {
	String rUser;
	String rAddr;
	String rTime;
	int phone01;
	int phone02;
	String addr1;
	String addr2;
	String addr3;
	int userNumber;
	String orgName;
	String etc;
	
	public ReserveDto(){}

	public ReserveDto(String rUser, String rAddr, String rTime, int phone01, int phone02, String addr1, String addr2,
			String addr3, int userNumber, String orgName, String etc) {
		super();
		this.rUser = rUser;
		this.rAddr = rAddr;
		this.rTime = rTime;
		this.phone01 = phone01;
		this.phone02 = phone02;
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.addr3 = addr3;
		this.userNumber = userNumber;
		this.orgName = orgName;
		this.etc = etc;
	}

	public String getrUser() {
		return rUser;
	}

	public void setrUser(String rUser) {
		this.rUser = rUser;
	}

	public String getrAddr() {
		return rAddr;
	}

	public void setrAddr(String rAddr) {
		this.rAddr = rAddr;
	}

	public String getrTime() {
		return rTime;
	}

	public void setrTime(String rTime) {
		this.rTime = rTime;
	}

	public int getPhone01() {
		return phone01;
	}

	public void setPhone01(int phone01) {
		this.phone01 = phone01;
	}

	public int getPhone02() {
		return phone02;
	}

	public void setPhone02(int phone02) {
		this.phone02 = phone02;
	}

	public String getAddr1() {
		return addr1;
	}

	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	public String getAddr2() {
		return addr2;
	}

	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}

	public String getAddr3() {
		return addr3;
	}

	public void setAddr3(String addr3) {
		this.addr3 = addr3;
	}

	public int getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getEtc() {
		return etc;
	}

	public void setEtc(String etc) {
		this.etc = etc;
	}
	
	
	
}