package com.connectrivier.db.dao;

import java.util.List;

import com.connectrivier.db.service.ManageDeleteAccount;
import com.connectrivier.entity.PrivateInfo;
import com.connectrivier.entity.Upload;

public class TestDB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ReferenceDaoImpl dao = new ReferenceDaoImpl();
		//dao.validateCurrentPassword("sarun", 1);
		//int a = dao.getUserid("sarun", "sarun");
		//System.out.println(a);
		
		//System.out.println(dao.getFirstname(1));
		//System.out.println(dao.getLastname(2));
		//dao.updatePassword("sarunaasd", 1);
		//dao.saveTest();
		//dao.deleteSignupRecord(14);
		
		//ManageDeleteAccount md = new ManageDeleteAccount();
		//md.deleteAccount(4);
		//PrivateInfo pfff =  dao.getAllPrivateInfo(1);
		//System.out.println(pfff.getEmail());
		List<Upload> ul = dao.getUploadList(33);
		for (Upload upload : ul) {
			System.out.println(upload.getMessage());
		}
	}

}
