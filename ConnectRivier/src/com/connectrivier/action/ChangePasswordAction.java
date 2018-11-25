package com.connectrivier.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;

import com.connectrivier.db.dao.ReferenceDao;
import com.connectrivier.db.dao.ReferenceDaoImpl;
import com.connectrivier.db.service.ManageChangePassword;
import com.connectrivier.db.service.ManageSigninBean;
import com.connectrivier.form.ChangePasswordForm;
import com.connectrivier.form.SigninForm;

public class ChangePasswordAction extends Action {

	private final static String SUCCESS = "success";
	private final static String FAILURE = "failure";
	public HttpSession session;

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		System.out.println("session first id id");
		
		ChangePasswordForm changePasswordForm = (ChangePasswordForm) form;
		ManageChangePassword manageChangePassword = new ManageChangePassword();
		System.out.println("session first id id1");
		session = request.getSession(false);
		System.out.println("session first id id2");
		ReferenceDaoImpl dao = new ReferenceDaoImpl();
		System.out.println("session first id id3");

		manageChangePassword.changePassword(changePasswordForm,dao.getUseridFromPassword(changePasswordForm.getOldpassword()));
		
			return mapping.findForward(SUCCESS);
		
	}

}
