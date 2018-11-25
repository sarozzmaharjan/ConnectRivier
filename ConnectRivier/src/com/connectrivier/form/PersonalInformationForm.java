package com.connectrivier.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.validator.ValidatorForm;

@SuppressWarnings("serial")
public class PersonalInformationForm extends ValidatorForm {

	private String firstname;
	private String middlename;
	private String lastname;
	private String email;
	private String phone;
	private String gender;
	private String dob;
	private String schoolyear;
	private String street;
	private String state;
	private String zipcode;
	private String city;
	private String aboutme;
	private String country;

	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		ActionErrors errors = new ActionErrors();
		if (this.firstname == null || this.firstname.trim().equals(""))
			errors.add("firstname", new ActionMessage(
					"error.firstname.required"));
		if (this.lastname == null || this.lastname.trim().equals(""))
			errors.add("lastname", new ActionMessage("error.lastname.required"));

		return errors;
	}

	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		firstname = "";
		lastname = "";
		middlename = "";
		email = "";
		phone = "";
		gender = "";
		schoolyear = "";
		street = "";
		zipcode = "";
		city = "";
		aboutme = "";
		country="";

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

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSchoolyear() {
		return schoolyear;
	}

	public void setSchoolyear(String schoolyear) {
		this.schoolyear = schoolyear;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
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

}
