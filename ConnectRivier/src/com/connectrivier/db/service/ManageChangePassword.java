package com.connectrivier.db.service;

import com.connectrivier.db.dao.ReferenceDaoImpl;
import com.connectrivier.entity.Signin;
import com.connectrivier.entity.Signup;
import com.connectrivier.form.ChangePasswordForm;
import com.connectrivier.form.SigninForm;
import com.connectrivier.form.SignupForm;

public class ManageChangePassword {


	ReferenceDaoImpl dao = new ReferenceDaoImpl();
	public ManageChangePassword() {
		super();
		// TODO Auto-generated constructor stub
	}



	public void changePassword(ChangePasswordForm changePasswordForm, int userid) {
		if(dao.validateCurrentPassword(changePasswordForm.getOldpassword(), userid)){
			dao.updatePassword(changePasswordForm.getNewpassword(), userid);
			dao.updatePasswordSignUp(changePasswordForm.getNewpassword(), userid);
		}

	}
	


}
