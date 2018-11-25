

package com.connectrivier.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;

import com.connectrivier.db.service.ManageSignupBean;
import com.connectrivier.entity.Signup;
import com.connectrivier.form.SignupForm;



@SuppressWarnings("unused")
public class SignupAction extends Action {
    
    private final static String SUCCESS = "success";
    private final static String FAILURE = "failure";
    
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
    	
    	SignupForm signupForm = (SignupForm) form;
    	ManageSignupBean signupbean = new ManageSignupBean();
    	HttpSession session = request.getSession(true);
    	
    
    	if(getErrors(request)== null || getErrors(request).size()==0)
    	{
    	signupbean.saveRecord(signupForm);
    	
    	String username = signupForm.getUsername();
		String password = signupForm.getPassword();

    	Integer userid = signupbean.getCurrentUserid(username, password);
		String fullname = signupbean.getFullName(username, password);
		
    	System.out.println("userid "+ userid);
    	session.setAttribute("userid", userid);
		session.setAttribute("user", username);
		session.setAttribute("password", password);
		session.setAttribute("fullname", fullname);
		session.setAttribute("addressObj", signupbean.getAddress(userid));
		session.setAttribute("privateInfoObj", signupbean.getAllPrivateInfo(userid));
		
		session.setAttribute("uploadObj", signupbean.getUpload(userid));

		session.setAttribute("uploadObjList", signupbean.getUploadList(userid));
		session.setAttribute("uploadObjListDashBoard", signupbean.getUploadListAll());
    	
  
        return mapping.findForward(SUCCESS);
    	}
    	else
    	return mapping.getInputForward();
    }

}
