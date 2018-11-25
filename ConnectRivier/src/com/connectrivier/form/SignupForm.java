package com.connectrivier.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


@SuppressWarnings("serial")
public class SignupForm extends ActionForm{

	private String realname;
	private String email;
	private String username;
	private String password;
	private String confirmPassword;
	
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
    public ActionErrors validate(ActionMapping mapping,
     HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if(this.realname == null || this.realname.trim().equals(""))
            errors.add("realname", new ActionMessage("error.realname.required"));
        if(this.username == null || this.username.trim().equals(""))
            errors.add("username", new ActionMessage("error.username.required"));
        if(this.email == null || this.email.trim().equals(""))
            errors.add("email", new ActionMessage("error.email.required"));
        if(this.password == null || this.password.trim().equals(""))
            errors.add("password", new ActionMessage("error.password.required"));
        if(this.confirmPassword == null || this.confirmPassword.trim().equals(""))
            errors.add("confirmPassword", new ActionMessage("error.confirmPassword.required"));
        return errors;
    }

    public void reset(ActionMapping mapping, HttpServletRequest request) {
        this.realname = null;
        this.email = null;
        this.username = null;
        this.password = null;
        this.confirmPassword= null;
        super.reset(mapping, request);
    }
	
	
}
