package com.connectrivier.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMessage;

import com.connectrivier.db.service.ManageChangePassword;
import com.connectrivier.db.service.ManageDeleteAccount;
import com.connectrivier.db.service.ManageForgetPassword;
import com.connectrivier.db.service.ManageSigninBean;
import com.connectrivier.form.ChangePasswordForm;
import com.connectrivier.form.DeleteActionForm;
import com.connectrivier.form.ForgetPasswordForm;
import com.connectrivier.form.SigninForm;

public class ForgetPasswordAction extends Action {

	private final static String SUCCESS = "success";
	private final static String FAILURE = "failure";

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String val = FAILURE;
		ForgetPasswordForm forgetpasswordform = (ForgetPasswordForm) form;
		ManageForgetPassword manageforget = new ManageForgetPassword();
		List<String> errorList = new ArrayList<String>();
		if(!manageforget.validateEmail(forgetpasswordform.getEmail())){
			errorList.add(new String("Enter valid email"));
			request.getSession().setAttribute("errorList", errorList);
			return mapping.getInputForward();
		}
		
		if (manageforget.validateEmail(forgetpasswordform.getEmail())) {
			//HttpSession session = request.getSession(true);
		int userid = manageforget.getUserId(forgetpasswordform.getEmail());
		String tempPassword = manageforget.generateRandomPassword(11);
		manageforget.updateToRandomPassword(tempPassword, userid);
		val = SUCCESS;
		request.setAttribute("tempPassword", tempPassword);
		return mapping.findForward(val);
	}
		return mapping.getInputForward();
	}

}
