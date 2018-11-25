package com.connectrivier.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;

import com.connectrivier.db.service.ManageChangePassword;
import com.connectrivier.db.service.ManageDeleteAccount;
import com.connectrivier.db.service.ManageSigninBean;
import com.connectrivier.form.ChangePasswordForm;
import com.connectrivier.form.DeleteActionForm;
import com.connectrivier.form.SigninForm;

public class DeleteAccountAction extends Action {

	private final static String SUCCESS = "success";
	private final static String FAILURE = "failure";
	public HttpSession session;

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		DeleteActionForm deleteAccountForm = (DeleteActionForm) form;
		ManageDeleteAccount manageDeleteAccount = new ManageDeleteAccount();
		session = request.getSession(false);
		int userid = (int) session.getAttribute("userid");
		if (manageDeleteAccount.validatePassword(deleteAccountForm, userid)) {
			manageDeleteAccount.deleteAccount(userid);

		}

		return mapping.findForward(SUCCESS);

	}

}
