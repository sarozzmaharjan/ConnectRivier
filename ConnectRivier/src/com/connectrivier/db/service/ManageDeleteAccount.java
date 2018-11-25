package com.connectrivier.db.service;

import com.connectrivier.db.dao.ReferenceDaoImpl;
import com.connectrivier.entity.Signin;
import com.connectrivier.entity.Signup;
import com.connectrivier.form.ChangePasswordForm;
import com.connectrivier.form.DeleteActionForm;
import com.connectrivier.form.SigninForm;
import com.connectrivier.form.SignupForm;

public class ManageDeleteAccount {


	ReferenceDaoImpl dao = new ReferenceDaoImpl();
	public ManageDeleteAccount() {
		super();
		// TODO Auto-generated constructor stub
	}


	public boolean validatePassword(DeleteActionForm deleteAccount, int userid){
		return dao.validateCurrentPassword(deleteAccount.getPassword(), userid);
	}

	public void deleteAccount(int userid) {
		try{
		
		dao.deletePrivateInformation(userid);
		dao.deleteAddress(userid);
		dao.deletePostsFromDashBoard(userid);
		dao.deletePosts(userid);
		dao.deleteLoginInformation(userid);
		dao.deleteSignupRecord(userid);
		}
		catch(Exception e){
			System.out.println("something went wrong");
		}
		
	}
	


}
