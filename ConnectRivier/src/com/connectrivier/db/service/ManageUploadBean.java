package com.connectrivier.db.service;




import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpSession;

import com.connectrivier.db.dao.ReferenceDaoImpl;
import com.connectrivier.entity.Signin;
import com.connectrivier.entity.Signup;
import com.connectrivier.entity.Upload;
import com.connectrivier.form.SigninForm;
import com.connectrivier.form.SignupForm;
import com.connectrivier.form.UploadForm;

public class ManageUploadBean{
	
	ReferenceDaoImpl dao = new ReferenceDaoImpl();

	public void saveUploadRecord(UploadForm uploadForm) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		   Date d = new Date();
		String date = dateFormat.format(d);
		System.out.println(date);
		
		Upload upload = new Upload();
		String fullname = dao.getFullNameByPassword(uploadForm.getPassword());
		upload.setMessage(uploadForm.getMessage());
		upload.setPassword(uploadForm.getPassword());
		upload.setFullname(fullname);
		upload.setDate(date);
	
		int userid = dao.getUseridFromPassword(uploadForm.getPassword());
		upload.setUploadId(userid);

		
		dao.savePostsInfo(upload);
		
	}
	public boolean checkUserPassword(UploadForm uploadForm) {
		boolean bool = false;
		Upload upload = new Upload();
	
		
		upload.setPassword(uploadForm.getPassword());
		//dao.getConnection();
		if(dao.validateUserUpload(upload)){
			bool = true;
		}
		return bool;
		
	}

}
