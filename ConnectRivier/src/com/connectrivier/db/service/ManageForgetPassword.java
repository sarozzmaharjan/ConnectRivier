package com.connectrivier.db.service;

import java.util.Random;

import com.connectrivier.db.dao.ReferenceDaoImpl;


public class ManageForgetPassword {

	ReferenceDaoImpl dao = new ReferenceDaoImpl();

	static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	static Random rnd = new Random();

	public String generateRandomPassword(int len) {
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++)
			sb.append(AB.charAt(rnd.nextInt(AB.length())));
		return sb.toString();
	}

	public void updateToRandomPassword(String tempPassword, int userid) {
		dao.updatePassword(tempPassword, userid);
		dao.updatePasswordSignUp(tempPassword, userid);
	}

	public int getUserId(String email) {
		return dao.getUseridFromEmail(email);
	}

	public boolean validateEmail(String email) {
		boolean val = false;
		if (dao.validateEmail(email)) {
			val = true;
		}
		return val;
	}

}
