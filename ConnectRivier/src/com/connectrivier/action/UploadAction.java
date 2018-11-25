package com.connectrivier.action;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;

import com.connectrivier.db.service.ManageSignupBean;
import com.connectrivier.db.service.ManageUploadBean;
import com.connectrivier.entity.PrivateInfo;
import com.connectrivier.form.UploadForm;

public class UploadAction extends Action {

	private final static String SUCCESS = "success";
	private final static String FAILURE = "failure";

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		UploadForm uploadForm = (UploadForm) form;
		ManageUploadBean uploadbean = new ManageUploadBean();
		List<String> errorList = new ArrayList<String>();
		String password = uploadForm.getPassword();
		String message = uploadForm.getMessage();
	//	HttpSession session = request.getSession(false);
		
	  if (message == null
				|| "".equals(message.trim())) {
			// set error message
			errorList.add(new String("Please write something"));
			request.getSession().setAttribute("errorList", errorList);
			// stay in login page
			return mapping.findForward("failure");
		}
		
	  else if (password == null
				|| "".equals(password.trim())) {
			errorList.add(new String("Please enter Password"));
			request.getSession().setAttribute("errorList", errorList);
			return mapping.findForward("failure");
		}
			
	  else if (!uploadbean.checkUserPassword(uploadForm)) {
				errorList
						.add(new String("Your password is not correct"));
				request.getSession().setAttribute("errorList", errorList);
				return mapping.findForward("failure");
			}
			
		
		
	

		else 
			{
			if (errorList.size()==0 || errorList.isEmpty()) {
			
//			PrivateInfo pf = (PrivateInfo) session
//					.getAttribute("privateInfoObj");
			uploadbean.saveUploadRecord(uploadForm);
			}
		

			return mapping.findForward(SUCCESS);
		}
	}
}