package com.connectrivier.db.dao;

import java.sql.Connection;
import java.util.List;

import com.connectrivier.entity.Address;
import com.connectrivier.entity.LogInInfo;
import com.connectrivier.entity.PrivateInfo;
import com.connectrivier.entity.Signin;
import com.connectrivier.entity.Signup;
import com.connectrivier.entity.Upload;

public interface ReferenceDao {

	public Connection getConnection();

	public void closeConnection();

	public void saveRegistrationInfo(Signup signup);

	public void savePrivateInfo(PrivateInfo privateInfo);

	public void saveAddress(Address address);

	boolean validateUser(Signin signin);

	String getFirstname(int userid);
	String getMiddlename(int userid);
	String getLastname(int userid);
	
	String getEmail(int userid);
	String getGender(int userid);
	String getAboutme(int userid);
	String getDob(int userid);
	String getPhone(int userid);
	String getCountry(int userid);

	boolean validateCurrentPassword(String password, int userid);

	Integer getUserid(String username, String password);
	public void updatePassword(String newPassword,int  userid);

	 String getFullName(String username, String password);

	public String getSchoolyear(int userid);

	public String getStreet(int userid);

	public String getCity(int userid);

	public String getZipcode(int userid);

	public String getState(int userid);

	public String getPosts(int userid);

	public String getDate(int userid);

	public PrivateInfo getAllPrivateInfo(int userid);

	public Upload getUpload(int userid);

	public List<Upload> getUploadList(int userid);

	void saveLogInInfo(LogInInfo loginInfo);


	boolean validateUserUpload(Upload upload);

	void savePrivateInfo(PrivateInfo privateInfo, String email);

	void saveEmailToAddressInfo(Address address, String email);

	void saveAddress(Address address, String email);

	void deleteLoginInformation(int userid);

	void deletePostsFromDashBoard(int userid);

	void deletePosts(int userid);

	void deleteAddress(int userid);

	void deletePrivateInformation(int userid);

	void deleteSignupRecord(int userid);

	int getUseridFromPassword(String password);

	String getEmailfromID(int userid);

	int getUseridFromEmail(String email);

	String getFullNameByPassword(String password);

	void saveEmailToAddressInfo(Address address);

	void saveEmailToPrivateInfo(PrivateInfo privateInfo);

	void savePostsInfo(Upload upload);

	void updatePasswordSignUp(String newPassword, int userid);

	List<Upload> getUploadListAll();

	public Address getAddress(int userid);

	boolean validateEmail(String email);
	

}
