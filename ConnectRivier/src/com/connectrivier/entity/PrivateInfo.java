package com.connectrivier.entity;

public class PrivateInfo {

	String firstname;
	String middlename;
	String lastname;
	String email;
	String phone;
	String gender;
	String dob;
	String aboutme;
	String country;
	String schoolyear;

	int privateid;
	
	public int getPrivateid() {
		return privateid;
	}
	public void setPrivateid(int userid) {
		this.privateid = userid;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
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
	
	public String getAboutme() {
		return aboutme;
	}
	public void setAboutme(String aboutme) {
		this.aboutme = aboutme;
	}
	

	public String getCountry() {
		
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public String getSchoolyear() {
		
		return schoolyear;
	}
	public void setSchoolyear(String schoolyear) {
		this.schoolyear = schoolyear;
	}
	

}
