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

public class RefreshAction extends Action {

	private final static String SUCCESS = "success";
	private final static String FAILURE = "failure";

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		RefreshForm refreshForm = (RefreshForm) form;
		ManageSigninBean manageSignin = new ManageSigninBean();
		HttpSession session = request.getSession(true);
		

		Integer userid = (Integer) session.getAttribute("userid");

	
		

			session.setAttribute("userid", userid);
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
			
		
		return mapping.findForward(SUCCESS);

	   }
	}


