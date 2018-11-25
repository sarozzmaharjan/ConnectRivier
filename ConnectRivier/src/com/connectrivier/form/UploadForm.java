package com.connectrivier.form;


import javax.servlet.http.HttpServletRequest;
 



import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.upload.FormFile;
 
@SuppressWarnings("serial")
public class UploadForm extends ActionForm{
 
   private String message;
private String password;

 

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	 public void reset(ActionMapping mapping, HttpServletRequest request) {
	        this.message = null;
	        this.password = null;
	        super.reset(mapping, request);
	    }
		

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}