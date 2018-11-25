package com.connectrivier.db.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.connectrivier.entity.Address;
import com.connectrivier.entity.LogInInfo;
import com.connectrivier.entity.PrivateInfo;
import com.connectrivier.entity.Signin;
import com.connectrivier.entity.Signup;
import com.connectrivier.entity.Upload;

public class ReferenceDaoImpl implements ReferenceDao {

	public Connection con = null;
	public ResultSet rs = null;
	public PreparedStatement pstmt = null;

	final String driver = "com.mysql.jdbc.Driver";
	// final String url =
	// "jdbc:mysql://sql3.freemysqlhosting.net:3306/sql322179?";
	// final String uname = "sql322179";
	// final String pwd = "hQ9%fV2*";

	final String url = "jdbc:mysql://mysql.freehostia.com:3306/sarmah0_rivier";
	final String uname = "sarmah0_rivier";
	final String pwd = "Rodies$123";

	public static void main(String[] args) {
		System.out.println("hello");
		ReferenceDao dao = new ReferenceDaoImpl();
		Connection con = dao.getConnection();
		System.out.println("con done");
		try {
			System.out.println(con.getSchema());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Address getAddress(int userid) {
		getConnection();
		String query = "select * from USER_ADDRESS where U_ADDRESS_ID = ?";
		Address pf = new Address();

		try {
			pstmt = con.prepareStatement(query);

			pstmt.setInt(1, userid);

			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {

				if (!(rs.getString(3) == null)) {
					pf.setStreet(rs.getString(3));
				} else {
					pf.setStreet("");
				}
				if (!(rs.getString(4) == null)) {
					pf.setCity(rs.getString(4));
				} else {
					pf.setCity("");
				}
				if (!(rs.getString(5) == null)) {
					pf.setState(rs.getString(5));
				} else {
					pf.setState("");
				}

				if (!(rs.getString(6) == null)) {
					pf.setZipCode(rs.getString(6));
				} else {
					pf.setZipCode("");
				}

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeConnection();

		return pf;

	}

	public PrivateInfo getAllPrivateInfo(int userid) {
		getConnection();
		String query = "select * from USER_PRIVATE_INFORMATION where U_PRIVATE_INFORMATION_ID = ?";
		PrivateInfo pf = new PrivateInfo();

		try {
			pstmt = con.prepareStatement(query);

			pstmt.setInt(1, userid);

			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				// System.out.println(rs.getString(1));
				// System.out.println(rs.getString(2));
				// System.out.println(rs.getString(3));
				// System.out.println(rs.getString(4));
				// System.out.println(rs.getString(5));
				// System.out.println(rs.getString(6));
				// System.out.println(rs.getString(7));
				// System.out.println(rs.getString(8));
				// System.out.println(rs.getString(9));
				// System.out.println(rs.getString(10));

				if (!(rs.getString(11) == null)) {
					pf.setAboutme(rs.getString(11));
				} else {
					pf.setAboutme("");
				}
				if (!(rs.getString(10) == null)) {
					pf.setCountry(rs.getString(10));
				} else {
					pf.setCountry("");
				}
				if (!(rs.getString(9) == null)) {
					pf.setDob(rs.getString(9));
				} else {
					pf.setDob("");
				}

				if (!(rs.getString(6) == null)) {
					pf.setEmail(rs.getString(6));
				} else {
					pf.setEmail("");
				}

				if (!(rs.getString(3) == null)) {
					pf.setFirstname(rs.getString(3));
				} else {
					pf.setFirstname("");

				}
				if (!(rs.getString(8) == null)) {
					pf.setGender(rs.getString(8));
				} else {
					pf.setGender("");

				}

				if (!(rs.getString(5) == null)) {
					pf.setLastname(rs.getString(5));
				} else {
					pf.setLastname("");
				}

				if (!(rs.getString(4) == null)) {
					pf.setMiddlename(rs.getString(4));
				} else {
					pf.setMiddlename("");
				}

				if (!(rs.getString(7) == null)) {
					pf.setPhone(rs.getString(7));
				} else {
					pf.setPhone("");
				}

				if (!(rs.getString(2) == null)) {
					pf.setSchoolyear(rs.getString(2));
				} else {
					pf.setSchoolyear("");
				}

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeConnection();

		return pf;
	}

	@Override
	public void saveRegistrationInfo(Signup signup) {
		getConnection();
		try {
			pstmt = con.prepareStatement("INSERT INTO SIGNUP(FULLNAME,EMAIL,USERNAME,PASSWORD,USER_ID) VALUES(?,?,?,?,?)");
			pstmt.setString(1, signup.getRealname());
			pstmt.setString(2, signup.getEmail());
			pstmt.setString(3, signup.getUsername());
			pstmt.setString(4, signup.getPassword());
			pstmt.setInt(5, (int) ((new Date()).getTime()));

			int rows = pstmt.executeUpdate();
			System.out.println(rows);
		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}

	}

	@Override
	public void saveLogInInfo(LogInInfo loginInfo) {
		// TODO Auto-generated method stub
		getConnection();
		try {
			pstmt = con.prepareStatement(
					"INSERT INTO USER_LOGIN_INFORMATION(USERNAME,PASSWORD, U_LOGIN_INFO_ID) VALUES(?,?,?)");

			pstmt.setString(1, loginInfo.getUsername());
			pstmt.setString(2, loginInfo.getPassword());
			pstmt.setInt(3, loginInfo.getUserid());

			int rows = pstmt.executeUpdate();
			System.out.println("num rows in log in" + rows);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
	}

	// public void saveTest() {
	// Signup signup = new Signup();
	// getConnection();
	// try {
	// pstmt = con
	// .prepareStatement("INSERT INTO SIGNUP(FULLNAME,EMAIL,USERNAME,PASSWORD)
	// VALUES(?,?,?,?)");
	// pstmt.setString(1, signup.getRealname());
	// pstmt.setString(2, signup.getEmail());
	// pstmt.setString(3, signup.getUsername());
	// pstmt.setString(4, signup.getPassword());
	//
	// int rows = pstmt.executeUpdate();
	// System.out.println("saved " + rows);
	// saveTest1();
	// } catch (Exception e) {
	// e.printStackTrace();
	// } finally {
	// closeConnection();
	// }
	// }

	@Override
	public void savePostsInfo(Upload upload) {
		getConnection();
		try {

			pstmt = con.prepareStatement(
					"INSERT INTO USER_POSTS(U_POSTS_ID,POSTS,PASSWORD,DATE,FULLNAME) VALUES(?,?,?,?,?)");
			pstmt.setInt(1, upload.getUploadId());
			pstmt.setString(2, upload.getMessage());
			pstmt.setString(4, upload.getDate());
			pstmt.setString(3, upload.getPassword());
			pstmt.setString(5, upload.getFullname());

			int rows = pstmt.executeUpdate();
			System.out.println("privateinfo saved " + rows);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}

	}

	@Override
	public void saveEmailToPrivateInfo(PrivateInfo privateInfo) {
		getConnection();
		try {
			System.out.println("outside emailtoprivate info");

			pstmt = con.prepareStatement(
					"INSERT INTO USER_PRIVATE_INFORMATION(EMAIL, U_PRIVATE_INFORMATION_ID) VALUES(?,?)");
			System.out.println("inside emailtoprivate info");
			pstmt.setString(1, privateInfo.getEmail());
			pstmt.setInt(2, privateInfo.getPrivateid());

			int rows = pstmt.executeUpdate();
			System.out.println("privateinfo saved " + rows);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}

	}

	@Override
	public void saveEmailToAddressInfo(Address address) {
		getConnection();
		try {
			System.out.println("outside usersaveEmailToAddressinfo");

			pstmt = con.prepareStatement("INSERT INTO USER_ADDRESS(EMAIL, U_ADDRESS_ID) VALUES(?,?)");
			System.out.println("inside usersaveEmailToAddressIinfo");
			pstmt.setString(1, address.getEmail());
			pstmt.setInt(2, address.getAddresid());

			int rows = pstmt.executeUpdate();
			System.out.println("privateinfo saved " + rows);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}

	}

	@Override
	public void savePrivateInfo(PrivateInfo privateInfo, String email) {
		getConnection();
		try {
			System.out.println("outside user private info");

			pstmt = con.prepareStatement(
					"UPDATE USER_PRIVATE_INFORMATION SET FIRSTNAME =?, MIDDLENAME=?, LASTNAME=?, EMAIL=?,PHONE=?,GENDER=?,DOB=?,COUNTRY=?,U_PRIVATE_INFORMATION_ID=?, SCHOOLYEAR=?,ABOUTME=? WHERE EMAIL=?");
			System.out.println("inside user private info");
			pstmt.setString(1, privateInfo.getFirstname());
			pstmt.setString(2, privateInfo.getMiddlename());
			pstmt.setString(3, privateInfo.getLastname());
			pstmt.setString(4, privateInfo.getEmail());
			pstmt.setString(5, privateInfo.getPhone());
			pstmt.setString(6, privateInfo.getGender());
			pstmt.setString(7, privateInfo.getDob());
			pstmt.setString(8, privateInfo.getCountry());
			pstmt.setInt(9, privateInfo.getPrivateid());
			pstmt.setString(10, privateInfo.getSchoolyear());
			pstmt.setString(11, privateInfo.getAboutme());
			pstmt.setString(12, email);

			int rows = pstmt.executeUpdate();
			System.out.println("school year is  " + privateInfo.getSchoolyear());
			System.out.println("about me is " + privateInfo.getAboutme());
			System.out.println("privateinfo saved " + rows);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}

	}

	@Override
	public void saveAddress(Address address, String email) {
		getConnection();
		try {
			pstmt = con.prepareStatement(
					"UPDATE USER_ADDRESS SET STREET =?, CITY=?, STATE=?, ZIPCODE=? ,U_ADDRESS_ID=? WHERE EMAIL=?");
			pstmt.setString(1, address.getStreet());
			pstmt.setString(2, address.getCity());
			pstmt.setString(3, address.getState());
			pstmt.setString(4, address.getZipCode());
			pstmt.setInt(5, address.getAddresid());
			pstmt.setString(6, email);
			;

			int rows = pstmt.executeUpdate();
			System.out.println("address saved " + rows);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
	}

	@Override
	public boolean validateUserUpload(Upload upload) {
		getConnection();
		String query = "select * from USER_LOGIN_INFORMATION where PASSWORD = ?";
		int count = 0;
		boolean bool = false;

		try {
			pstmt = con.prepareStatement(query);

			pstmt.setString(1, upload.getPassword());

			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				count += 1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		if (count == 1) {
			bool = true;
			System.out.println("success upload");
		}
		closeConnection();
		return bool;

	}

	@Override
	public boolean validateUser(Signin signin) {
		getConnection();
		String query = "select * from USER_LOGIN_INFORMATION where USERNAME = ? and PASSWORD = ?";
		int count = 0;
		boolean bool = false;

		try {
			pstmt = con.prepareStatement(query);

			pstmt.setString(1, signin.getUsername());
			pstmt.setString(2, signin.getPassword());

			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				count += 1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		if (count == 1) {
			bool = true;
			System.out.println("success signin");
		}
		closeConnection();
		return bool;

	}

	@Override
	public boolean validateCurrentPassword(String password, int userid) {
		getConnection();
		String query = "select * from USER_LOGIN_INFORMATION where PASSWORD = ? and U_LOGIN_INFO_ID = ?";
		int count = 0;
		boolean bool = false;

		try {
			pstmt = con.prepareStatement(query);

			pstmt.setString(1, password);
			pstmt.setInt(2, userid);

			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				count += 1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		if (count == 1) {
			bool = true;
			System.out.println("password exist");
		}
		closeConnection();
		return bool;

	}

	@Override
	public boolean validateEmail(String email) {
		getConnection();
		String query = "select * from SIGNUP where EMAIL = ?";
		int count = 0;
		boolean bool = false;

		try {
			pstmt = con.prepareStatement(query);

			pstmt.setString(1, email);

			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				count += 1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		if (count == 1) {
			bool = true;
			System.out.println("email exist");
		}
		closeConnection();
		return bool;

	}

	@Override
	public void updatePassword(String newPassword, int userid) {

		getConnection();
		String query = "UPDATE USER_LOGIN_INFORMATION SET PASSWORD= ? where U_LOGIN_INFO_ID = ?";

		try {
			pstmt = con.prepareStatement(query);

			pstmt.setString(1, newPassword);
			pstmt.setInt(2, userid);

			pstmt.execute();
			System.out.println("password changed");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeConnection();

	}

	@Override
	public void updatePasswordSignUp(String newPassword, int userid) {

		getConnection();
		String query = "UPDATE SIGNUP SET PASSWORD= ? where USER_ID = ?";

		try {
			pstmt = con.prepareStatement(query);

			pstmt.setString(1, newPassword);
			pstmt.setInt(2, userid);

			pstmt.execute();
			System.out.println("password changed");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeConnection();

	}

	/*
	 * public static PrivateInfo getRecord(PrivateInfo privateInfo, int userid)
	 * { getConnection(); String qry =
	 * "select PASSWORD from&nbsp;EMP_MSTR where EMP_NO=?"; String password =
	 * null; ResultSet resultSet = null; try&nbsp;{ PreparedStatement pstat
	 * =&nbsp;con.prepareStatement(qry); pstat.setString(1,
	 * employee.getempNo()); resultSet = pstat.executeQuery(); while
	 * (resultSet.next()) {
	 * employee.setpassword(resultSet.getString("PASSWORD"));
	 * employee.setfName(resultSet.getString("FNAME"));
	 * employee.setmName(resultSet.getString("MNAME"));
	 * employee.setlName(resultSet.getString("LNAME"));
	 * employee.setDept(resultSet.getString("DEPT"));
	 * employee.setDesig(resultSet.getString("DESIG"));
	 * employee.setAddress(resultSet.getString("ADDR")); } } catch (SQLException
	 * e) { e.printStackTrace(); }
	 * 
	 * return employee; }
	 */
	@Override
	public String getFullName(String username, String password) {
		getConnection();
		String fullname = "";
		String query = "select FULLNAME from SIGNUP where USERNAME=? AND PASSWORD = ?";
		try {
			pstmt = con.prepareStatement(query);

			pstmt.setString(1, username);
			pstmt.setString(2, password);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				fullname = rs.getString(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeConnection();
		return fullname;
	}

	@Override
	public String getFullNameByPassword(String password) {
		getConnection();
		String fullname = "";
		String query = "select FULLNAME from SIGNUP where PASSWORD = ?";
		try {
			pstmt = con.prepareStatement(query);

			pstmt.setString(1, password);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				fullname = rs.getString(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeConnection();
		return fullname;
	}

	@Override
	public Integer getUserid(String username, String password) {
		getConnection();
		Integer userid = null;
		String query = "select USER_ID from SIGNUP where USERNAME = ? and PASSWORD =?";
		try {
			pstmt = con.prepareStatement(query);

			pstmt.setString(1, username);
			pstmt.setString(2, password);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				userid = rs.getInt(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeConnection();
		return userid;
	}

	@Override
	public int getUseridFromEmail(String email) {
		getConnection();
		Integer userid = null;
		String query = "select USER_ID from SIGNUP where EMAIL=?";
		try {
			pstmt = con.prepareStatement(query);

			pstmt.setString(1, email);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				userid = rs.getInt(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeConnection();
		return userid;
	}

	@Override
	public String getEmailfromID(int userid) {
		getConnection();
		String email = "";
		String query = "select EMAIL from SIGNUP where USER_ID =?";
		try {
			pstmt = con.prepareStatement(query);

			pstmt.setInt(1, userid);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				email = rs.getString(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeConnection();
		return email;
	}

	@Override
	public int getUseridFromPassword(String password) {
		getConnection();
		Integer userid = null;
		String query = "select USER_ID from SIGNUP where PASSWORD=?";
		try {
			pstmt = con.prepareStatement(query);

			pstmt.setString(1, password);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				userid = rs.getInt(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeConnection();
		return userid;
	}

	@Override
	public String getFirstname(int userid) {
		getConnection();
		String firstname = "";
		String query = "select FIRSTNAME from USER_PRIVATE_INFORMATION where U_PRIVATE_INFORMATION_ID = ?";
		try {
			pstmt = con.prepareStatement(query);

			pstmt.setInt(1, userid);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				firstname = rs.getString(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeConnection();
		return firstname;
	}

	@Override
	public String getLastname(int userid) {
		getConnection();
		String lastname = "";
		String query = "select LASTNAME from USER_PRIVATE_INFORMATION where U_PRIVATE_INFORMATION_ID = ?";
		try {
			pstmt = con.prepareStatement(query);

			pstmt.setInt(1, userid);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				lastname = rs.getString(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeConnection();
		return lastname;
	}

	@Override
	public String getEmail(int userid) {
		getConnection();
		String email = "";
		String query = "select EMAIL from USER_PRIVATE_INFORMATION where U_PRIVATE_INFORMATION_ID = ?";
		try {
			pstmt = con.prepareStatement(query);

			pstmt.setInt(1, userid);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				email = rs.getString(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeConnection();
		return email;
	}

	@Override
	public String getMiddlename(int userid) {
		getConnection();
		String middlename = "";
		String query = "select MIDDLENAME from USER_PRIVATE_INFORMATION where U_PRIVATE_INFORMATION_ID = ?";
		try {
			pstmt = con.prepareStatement(query);

			pstmt.setInt(1, userid);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				middlename = rs.getString(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeConnection();
		return middlename;
	}

	@Override
	public String getPhone(int userid) {
		getConnection();
		String phone = "";
		String query = "select PHONE from USER_PRIVATE_INFORMATION where U_PRIVATE_INFORMATION_ID = ?";
		try {
			pstmt = con.prepareStatement(query);

			pstmt.setInt(1, userid);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				phone = rs.getString(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeConnection();
		return phone;
	}

	@Override
	public String getDob(int userid) {
		getConnection();
		String dob = "";
		String query = "select DOB from USER_PRIVATE_INFORMATION where U_PRIVATE_INFORMATION_ID = ?";
		try {
			pstmt = con.prepareStatement(query);

			pstmt.setInt(1, userid);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				dob = rs.getString(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeConnection();
		return dob;
	}

	@Override
	public String getGender(int userid) {
		getConnection();
		String gender = "";
		String query = "select GENDER from USER_PRIVATE_INFORMATION where U_PRIVATE_INFORMATION_ID = ?";
		try {
			pstmt = con.prepareStatement(query);

			pstmt.setInt(1, userid);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				gender = rs.getString(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeConnection();
		return gender;
	}

	@Override
	public String getAboutme(int userid) {
		getConnection();
		String aboutme = "";
		String query = "select ABOUTME from USER_PRIVATE_INFORMATION where U_PRIVATE_INFORMATION_ID = ?";
		try {
			pstmt = con.prepareStatement(query);

			pstmt.setInt(1, userid);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				aboutme = rs.getString(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeConnection();
		return aboutme;
	}

	@Override
	public String getCountry(int userid) {
		getConnection();
		String country = "";
		String query = "select COUNTRY from USER_PRIVATE_INFORMATION where U_PRIVATE_INFORMATION_ID = ?";
		try {
			pstmt = con.prepareStatement(query);

			pstmt.setInt(1, userid);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				country = rs.getString(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeConnection();
		return country;
	}

	@Override
	public String getPosts(int userid) {
		getConnection();
		String post = "";
		String query = "select POSTS from USER_POSTS where U_POSTS_ID = ?";
		try {
			pstmt = con.prepareStatement(query);

			pstmt.setInt(1, userid);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				post = rs.getString(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeConnection();
		return post;
	}

	@Override
	public String getDate(int userid) {
		getConnection();
		String date = "";
		String query = "select DATE from USER_POSTS where U_POSTS_ID = ?";
		try {
			pstmt = con.prepareStatement(query);

			pstmt.setInt(1, userid);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				date = rs.getString(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeConnection();
		return date;
	}

	@Override
	public void deleteSignupRecord(int userid) {
		getConnection();
		String query = "DELETE FROM SIGNUP WHERE USER_ID=?;";
		try {
			pstmt = con.prepareStatement(query);

			pstmt.setInt(1, userid);

			pstmt.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeConnection();

	}

	@Override
	public void deletePrivateInformation(int userid) {
		getConnection();
		String query = "DELETE FROM USER_PRIVATE_INFORMATION WHERE U_PRIVATE_INFORMATION_ID=?;";
		try {
			pstmt = con.prepareStatement(query);

			pstmt.setInt(1, userid);

			pstmt.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeConnection();

	}

	@Override
	public void deleteAddress(int userid) {
		getConnection();
		String query = "DELETE FROM USER_ADDRESS WHERE U_ADDRESS_ID=?;";
		try {
			pstmt = con.prepareStatement(query);

			pstmt.setInt(1, userid);

			pstmt.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeConnection();

	}

	@Override
	public void deletePosts(int userid) {
		getConnection();
		String query = "DELETE FROM USER_POSTS WHERE U_POSTS_ID=?;";
		try {
			pstmt = con.prepareStatement(query);

			pstmt.setInt(1, userid);

			pstmt.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeConnection();

	}

	@Override
	public void deletePostsFromDashBoard(int userid) {
		getConnection();
		String query = "DELETE FROM DASHBOARD_POST WHERE U_DASHBOARD_POST_ID=?;";
		try {
			pstmt = con.prepareStatement(query);

			pstmt.setInt(1, userid);

			pstmt.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeConnection();
	}

	@Override
	public void deleteLoginInformation(int userid) {
		getConnection();
		String query = "DELETE FROM USER_LOGIN_INFORMATION WHERE U_LOGIN_INFO_ID=?;";
		try {
			pstmt = con.prepareStatement(query);

			pstmt.setInt(1, userid);

			pstmt.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeConnection();
	}

	int countCon = 0;

	@Override
	public Connection getConnection() {

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, uname, pwd);
			System.out.println("connected");
			countCon += 1;
			System.out.println("Number of connections : " + countCon);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	@Override
	public void closeConnection() {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (con != null) {
			try {
				con.close();
				if (countCon > 0) {
					countCon -= 1;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public String getSchoolyear(int userid) {
		getConnection();
		String schoolyear = "";
		String query = "select SCHOOLYEAR from USER_PRIVATE_INFORMATION where U_PRIVATE_INFORMATION_ID = ?";
		try {
			pstmt = con.prepareStatement(query);

			pstmt.setInt(1, userid);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				schoolyear = rs.getString(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeConnection();
		return schoolyear;
	}

	@Override
	public String getStreet(int userid) {
		getConnection();
		String street = "";
		String query = "select STREET from USER_ADDRESS where U_ADDRESS_ID = ?";
		try {
			pstmt = con.prepareStatement(query);

			pstmt.setInt(1, userid);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				street = rs.getString(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeConnection();
		return street;
	}

	@Override
	public String getCity(int userid) {
		getConnection();
		String city = "";
		String query = "select CITY from USER_ADDRESS where U_ADDRESS_ID = ?";
		try {
			pstmt = con.prepareStatement(query);

			pstmt.setInt(1, userid);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				city = rs.getString(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeConnection();
		return city;
	}

	@Override
	public String getZipcode(int userid) {
		getConnection();
		String zip = "";
		String query = "select ZIPCODE from USER_ADDRESS where U_ADDRESS_ID = ?";
		try {
			pstmt = con.prepareStatement(query);

			pstmt.setInt(1, userid);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				zip = rs.getString(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeConnection();
		return zip;
	}

	@Override
	public String getState(int userid) {
		getConnection();
		String state = "";
		String query = "select STATE from USER_ADDRESS where U_ADDRESS_ID = ?";
		try {
			pstmt = con.prepareStatement(query);

			pstmt.setInt(1, userid);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				state = rs.getString(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeConnection();
		return state;
	}

	@Override
	public Upload getUpload(int userid) {
		getConnection();
		String query = "select * from USER_POSTS where U_POSTS_ID = ?";
		Upload pf = new Upload();

		try {
			pstmt = con.prepareStatement(query);

			pstmt.setInt(1, userid);

			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				// System.out.println(rs.getString(1));
				// System.out.println(rs.getString(2));
				// System.out.println(rs.getString(3));
				// System.out.println(rs.getString(4));
				// System.out.println(rs.getString(5));
				// System.out.println(rs.getString(6));
				// System.out.println(rs.getString(7));
				// System.out.println(rs.getString(8));
				// System.out.println(rs.getString(9));
				// System.out.println(rs.getString(10));

				if (!(rs.getString(3) == null)) {
					pf.setMessage(rs.getString(3));
				} else {
					pf.setMessage(" ");

					pf.setDate(rs.getString(5));
					pf.setPassword(rs.getString(4));
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeConnection();
		return pf;
	}

	@Override
	public List<Upload> getUploadList(int userid) {

		getConnection();
		String query = "select * from USER_POSTS where U_POSTS_ID = ?";
		List<Upload> postList = new ArrayList<Upload>();

		try {
			pstmt = con.prepareStatement(query);

			pstmt.setInt(1, userid);

			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Upload pf = new Upload();

				pf.setMessage(rs.getString(2));

				pf.setDate(rs.getString(4));
				pf.setPassword(rs.getString(3));
				pf.setFullname(rs.getString(5));
				postList.add(pf);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeConnection();
		return postList;
	}

	@Override
	public List<Upload> getUploadListAll() {

		getConnection();
		String query = "select * from USER_POSTS";
		List<Upload> postList = new ArrayList<Upload>();

		try {
			pstmt = con.prepareStatement(query);

			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Upload pf = new Upload();

				pf.setMessage(rs.getString(2));

				pf.setDate(rs.getString(4));
				pf.setPassword(rs.getString(3));
				pf.setFullname(rs.getString(5));
				postList.add(pf);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeConnection();
		return postList;
	}

	@Override
	public void savePrivateInfo(PrivateInfo privateInfo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveAddress(Address address) {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveEmailToAddressInfo(Address address, String email) {
		// TODO Auto-generated method stub

	}

}
