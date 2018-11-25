package com.connectrivier.form;

import javax.servlet.http.HttpServletRequest;
 

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.upload.FormFile;
 
@SuppressWarnings("serial")
public class UploadVideoForm extends ActionForm{
 
	private FormFile file;
	private String fieldDescription;
	private String videoDescription;
 
	

	
	@Override
	public ActionErrors validate(ActionMapping mapping,
	   HttpServletRequest request) {
 
	    ActionErrors errors = new ActionErrors();
	    return errors;
	}




	public String getFieldDescription() {
		return fieldDescription;
	}




	public void setFieldDescription(String fieldDescription) {
		this.fieldDescription = fieldDescription;
	}




	public FormFile getFile() {
		return file;
	}




	public void setFile(FormFile file) {
		this.file = file;
	}




	public String getVideoDescription() {
		return videoDescription;
	}




	public void setVideoDescription(String videoDescription) {
		this.videoDescription = videoDescription;
	}

}