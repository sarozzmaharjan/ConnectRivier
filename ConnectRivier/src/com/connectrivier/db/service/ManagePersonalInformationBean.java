package com.connectrivier.db.service;

import com.connectrivier.db.dao.ReferenceDaoImpl;
import com.connectrivier.entity.Address;
import com.connectrivier.entity.PrivateInfo;
import com.connectrivier.entity.Signup;
import com.connectrivier.form.PersonalInformationForm;
import com.connectrivier.form.SignupForm;

public class ManagePersonalInformationBean {

	ReferenceDaoImpl dao = new ReferenceDaoImpl();
	ManagePersonalInformationBean manageSignup;

	public ManagePersonalInformationBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void saveRecord(PersonalInformationForm personalInfoForm) {
		try {
			// getting personal info
			String firstname = personalInfoForm.getFirstname();
			String middlename = personalInfoForm.getMiddlename();
			String lastname = personalInfoForm.getLastname();
			String email = personalInfoForm.getEmail();
			String phone = personalInfoForm.getPhone();
			String gender = personalInfoForm.getGender();
			String dob = personalInfoForm.getDob();
			String aboutme = personalInfoForm.getAboutme();
			System.out.println("testing " + aboutme);
			String country = personalInfoForm.getCountry();
			String schoolyear = personalInfoForm.getSchoolyear();
			System.out.println("testing school year " + schoolyear);

			PrivateInfo privateInfo = new PrivateInfo();
			privateInfo.setEmail(email);
			privateInfo.setFirstname(firstname);
			privateInfo.setLastname(lastname);
			privateInfo.setMiddlename(middlename);
			privateInfo.setPhone(phone);
			privateInfo.setGender(gender);
			privateInfo.setDob(dob);
			privateInfo.setAboutme(aboutme);
			privateInfo.setCountry(country);
			privateInfo.setSchoolyear(schoolyear);

			// getting address info
			String street = personalInfoForm.getStreet();
			String city = personalInfoForm.getCity();
			String state = personalInfoForm.getState();
			String zipCode = personalInfoForm.getZipcode();

			Address address = new Address();
			address.setCity(city);
			address.setState(state);
			address.setStreet(street);
			address.setZipCode(zipCode);

			int userid = dao.getUseridFromEmail(email);
			String newEmail = dao.getEmailfromID(userid);

			privateInfo.setPrivateid(userid);
			address.setAddresid(userid);

			dao.savePrivateInfo(privateInfo, newEmail);
			dao.saveAddress(address, newEmail);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
