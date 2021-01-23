package com.example.bean;

public class Citizen {
	private String fname;
	private String lname;
	private String gender;
	private String dob;
	private String statename;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getStatename() {
		return statename;
	}
	public void setStatename(String statename) {
		this.statename = statename;
	}
	@Override
	public String toString() {
		return "Citizen [fname=" + fname + ", lname=" + lname + ", gender=" + gender + ", dob=" + dob + ", statename="
				+ statename + "]";
	}
	
	
}
