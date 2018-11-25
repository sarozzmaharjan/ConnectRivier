package com.connectrivier.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;

import com.connectrivier.db.service.ManagePersonalInformationBean;
import com.connectrivier.db.service.ManageSignupBean;
import com.connectrivier.entity.Signin;
import com.connectrivier.form.PersonalInformationForm;
import com.connectrivier.form.SigninForm;
import com.connectrivier.form.SignupForm;



public class PersonalInformationAction extends Action {
    
    private final static String SUCCESS = "success";
    private final static String FAILURE = "failure";
    
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
    	PersonalInformationForm personalInfoForm = (PersonalInformationForm) form;
    	ManagePersonalInformationBean personalInfoBean = new ManagePersonalInformationBean();
    	
    	request.getSession().setAttribute("user", personalInfoForm.getFirstname());
    	
    	personalInfoBean.saveRecord(personalInfoForm);
    	
    	 
    	
    	
    	
    	
    		return mapping.findForward(SUCCESS);
    
    }
}
