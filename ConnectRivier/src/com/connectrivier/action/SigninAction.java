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

import com.connectrivier.db.dao.ReferenceDao;
import com.connectrivier.db.dao.ReferenceDaoImpl;
import com.connectrivier.db.service.ManageSigninBean;
import com.connectrivier.form.*;

public class SigninAction extends Action {

	private final static String SUCCESS = "success";
	private final static String FAILURE = "failure";

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		SigninForm signinForm = (SigninForm) form;
		ManageSigninBean manageSignin = new ManageSigninBean();
		List<String> errorList = new ArrayList<String>();
		HttpSession session = request.getSession(true);
		
		ReferenceDao connection = new ReferenceDaoImpl();
		connection.getConnection();
		
		session.setAttribute("username", signinForm.getUsername());
		session.setAttribute("pwd", signinForm.getPassword());

		String username = signinForm.getUsername();
		String password = signinForm.getPassword();

		if (username == null
				|| "".equals(username.trim())) {

			errorList.add(new String("Please enter Username"));
			request.getSession().setAttribute("errorList", errorList);
			// stay in login page
			return mapping.findForward("failure");
		}

		else if (password == null
				|| "".equals(password.trim())) {
			// set error message
			errorList.add(new String("Please enter Password"));
			request.getSession().setAttribute("errorList", errorList);
			// stay in login page
			return mapping.findForward("failure");
		}

		else if (!manageSignin.checkUserUsernamePassword(signinForm)) {
			// set error message
			errorList
					.add(new String("The username or password is not correct"));
			request.getSession().setAttribute("errorList", errorList);
			// stay in login page
			return mapping.findForward("failure");
		}

		else{
		Integer userid = manageSignin.getCurrentUserid(username, password);
		String fullname = manageSignin.getFullName(username, password);

		if (!(userid == null)) {
		

			session.setAttribute("userid", userid);
			session.setAttribute("user", username);
			session.setAttribute("password", password);
			session.setAttribute("fullname", fullname);
			session.setAttribute("addressObj", manageSignin.getAddress(userid));
			session.setAttribute("privateInfoObj", manageSignin.getAllPrivateInfo(userid));
			
		//	session.setAttribute("uploadObj", manageSignin.getUpload(userid));

			session.setAttribute("uploadObjList", manageSignin.getUploadList(userid));
			session.setAttribute("uploadObjListDashBoard", manageSignin.getUploadListAll());

//			session.setAttribute("gender", manageSignin.getGender(usesrid));
//			session.setAttribute("aboutme", manageSignin.getAboutme(userid));
//			session.setAttribute("country", manageSignin.getCountry(userid));
//			session.setAttribute("firstname", manageSignin.getFirstname(userid));
//			session.setAttribute("middlename", manageSignin.getMiddlename(userid));
//			session.setAttribute("lastname", manageSignin.getLastname(userid));
//			session.setAttribute("phone", manageSignin.getPhone(userid));
//			session.setAttribute("email", manageSignin.getEmail(userid));
//			session.setAttribute("dob", manageSignin.getDob(userid));
//			session.setAttribute("schoolyear", manageSignin.getSchoolyear(userid));
//			session.setAttribute("street", manageSignin.getStreet(userid));
//			session.setAttribute("city", manageSignin.getCity(userid));
//			session.setAttribute("state", manageSignin.getState(userid));
//			session.setAttribute("zipcode", manageSignin.getZipcode(userid));
//			session.setAttribute("posts", manageSignin.getPosts(userid));
//			session.setAttribute("date", manageSignin.getDate(userid));		
//	System.out.println(manageSignin.getAllPrivateInfo(1));
			
		}
		return mapping.findForward(SUCCESS);

	   }
	}

}
