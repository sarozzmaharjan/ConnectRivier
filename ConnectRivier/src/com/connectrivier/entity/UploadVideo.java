package com.connectrivier.entity;

import java.util.Date;

import org.apache.struts.upload.FormFile;

public class UploadVideo {
	
	private FormFile File;
	private String fieldDescription;
	private String firstname;
	private Date date;
	public FormFile getFile() {
		return File;
	}
	public void setFile(FormFile file) {
		File = file;
	}
	public String getFieldDescription() {
		return fieldDescription;
	}
	public void setFieldDescription(String fieldDescription) {
		this.fieldDescription = fieldDescription;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

}
