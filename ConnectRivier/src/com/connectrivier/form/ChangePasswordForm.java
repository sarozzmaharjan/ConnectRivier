package com.connectrivier.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

@SuppressWarnings("serial")
public class ChangePasswordForm extends ActionForm {

	private String oldpassword;
	private String newpassword;
	private String confirmpassword;

	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		ActionErrors errors = new ActionErrors();
		if (oldpassword == null || oldpassword.length() < 1) {
			errors.add("oldpassword", new ActionMessage(
					"error.password.required"));
		}
		if (newpassword == null || newpassword.length() < 1) {
			errors.add("newpassword", new ActionMessage(
					"error.password.required"));
		}
		if (confirmpassword == null || confirmpassword.length() < 1) {
			errors.add("confirmpassword", new ActionMessage(
					"error.password.required"));
		}
		return errors;
	}

	public String getOldpassword() {
		return oldpassword;
	}

	public void setOldpassword(String oldpassword) {
		this.oldpassword = oldpassword;
	}

	public String getNewpassword() {
		return newpassword;
	}

	public void setNewpassword(String newpassword) {
		this.newpassword = newpassword;
	}

	public String getConfirmpassword() {
		return confirmpassword;
	}

	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

}
