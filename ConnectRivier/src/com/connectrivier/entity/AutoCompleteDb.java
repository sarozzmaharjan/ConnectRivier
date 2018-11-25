package com.connectrivier.entity;
import java.sql.*;
import java.util.*;


public class AutoCompleteDb {
	
	public List getDetailsDb(){
		List nameLst = new ArrayList();
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			
			System.out.println("In class");
			Connection con = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net:3306/sql322179?", "sql322179", "hQ9%fV2*");
			
			Statement stat =con.createStatement();
			ResultSet rs=stat.executeQuery("SELECT FULLNAME FROM SIGNUP");
			while(rs.next()){
				nameLst.add(rs.getString(2));				
			}
			
			stat.close();
			con.close();
		}
		catch(Exception e){
			System.out.println("In excep"+e);
		}
		return nameLst;
	}

}
