package com.connectrivier.db.service;

import java.util.List;

import com.connectrivier.db.dao.ReferenceDaoImpl;
import com.connectrivier.entity.Address;
import com.connectrivier.entity.LogInInfo;
import com.connectrivier.entity.PrivateInfo;
import com.connectrivier.entity.Signup;
import com.connectrivier.entity.Upload;
import com.connectrivier.form.SigninForm;
import com.connectrivier.form.SignupForm;

public class ManageSignupBean {


	ReferenceDaoImpl dao = new ReferenceDaoImpl();
	ManageSignupBean manageSignup;
	public ManageSignupBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void saveRecord(SignupForm signupForm) {
		System.out.println(signupForm.getRealname());
		Signup signup = new Signup();
		LogInInfo loginInfo = new LogInInfo();
		PrivateInfo privateInfo = new PrivateInfo();
		Address address = new Address();
		
		signup.setRealname(signupForm.getRealname());
		signup.setEmail(signupForm.getEmail());
		signup.setUsername(signupForm.getUsername());
		signup.setPassword(signupForm.getPassword());
		dao.saveRegistrationInfo(signup);
		
		//logic to save loginInfo obj into its table
		loginInfo.setUsername(signupForm.getUsername());
		loginInfo.setPassword(signupForm.getPassword());
		int userid = dao.getUserid(signupForm.getUsername(), signupForm.getPassword());
		loginInfo.setUserid(userid);
		dao.saveLogInInfo(loginInfo);
		
		privateInfo.setPrivateid(userid);
		privateInfo.setEmail(signupForm.getEmail());
		dao.saveEmailToPrivateInfo(privateInfo);
		
		address.setAddresid(userid);
		address.setEmail(signupForm.getEmail());
		dao.saveEmailToAddressInfo(address);
		
		
		
		
		
		
	}
	
	public Address getAddress(int userid) {
		return dao.getAddress(userid);
	}
	

	public PrivateInfo getAllPrivateInfo(int userid){
		return dao.getAllPrivateInfo(userid);
	}
	
	public List<Upload> getUploadList(int userid){
		return dao.getUploadList(userid);
	}
	
	public List<Upload> getUploadListAll(){
		return dao.getUploadListAll();
	}
	
	
	public Upload getUpload(int userid){
	//	System.out.println(dao.getUpload(33));
		return dao.getUpload(userid);
	}
		

	public Integer getCurrentUserid(String username, String password){
		return dao.getUserid(username, password);
	}

	public String getFullName(String username, String password){
		return dao.getFullName(username, password);
	}
	
	


}
