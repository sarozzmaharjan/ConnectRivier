package com.connectrivier.form;

import javax.servlet.http.HttpServletRequest;
 




import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.upload.FormFile;
 
@SuppressWarnings("serial")
public class UploadPostForm extends ActionForm{
 
	private FormFile file;
	private String fileCaption;
	private String fieldDescription;
	private String message;
 
	

	
	public FormFile getFile() {
		return file;
	}




	public void setFile(FormFile file) {
		this.file = file;
	}




	public String getFileCaption() {
		return fileCaption;
	}




	public void setFileCaption(String fileCaption) {
		this.fileCaption = fileCaption;
	}




	@Override
	public ActionErrors validate(ActionMapping mapping,
	   HttpServletRequest request) {
	    ActionErrors errors = new ActionErrors();
		 if( getFile().getFileSize()== 0){
		       errors.add("common.file.err",
		    	new ActionMessage("error.common.file.required"));
		       return errors;
		    }
	 
		    //only allow textfile to upload
	 
	            //file size cant larger than 10kb
		    if(getFile().getFileSize() > 2048000){ //10kb
		       errors.add("common.file.err.size",
			    new ActionMessage("error.common.file.size.limit", 2048000));
		       return errors;
		    }
	 
		    return errors;
	}




	public String getFieldDescription() {
		return fieldDescription;
	}




	public void setFieldDescription(String fieldDescription) {
		this.fieldDescription = fieldDescription;
	}




	public String getMessage() {
		return message;
	}




	public void setMessage(String message) {
		this.message = message;
	}




	

}