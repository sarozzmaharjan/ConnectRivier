package com.connectrivier.db.service;

import java.util.List;

import com.connectrivier.db.dao.ReferenceDao;
import com.connectrivier.db.dao.ReferenceDaoImpl;
import com.connectrivier.entity.Address;
import com.connectrivier.entity.PrivateInfo;
import com.connectrivier.entity.Signin;
import com.connectrivier.entity.Signup;
import com.connectrivier.entity.Upload;
import com.connectrivier.form.SigninForm;
import com.connectrivier.form.SignupForm;

public class ManageSigninBean {


	ReferenceDao dao = new ReferenceDaoImpl();
	ManageSigninBean manageSignup;
	public ManageSigninBean() {
		super();
		// TODO Auto-generated constructor stub
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
	
	public boolean checkUserUsernamePassword(SigninForm signinForm) {
		boolean bool = false;
		Signin signin = new Signin();
	
		signin.setUsername(signinForm.getUsername());
		signin.setPassword(signinForm.getPassword());
		//dao.getConnection();
		if(dao.validateUser(signin)){
			bool = true;
		}
		return bool;
		
	}
	
	public Integer getCurrentUserid(String username, String password){
		return dao.getUserid(username, password);
	}

	public String getFullName(String username, String password){
		return dao.getFullName(username, password);
	}



	
	




}
