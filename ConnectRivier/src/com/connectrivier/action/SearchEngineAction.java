package com.connectrivier.action;

import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.connectrivier.entity.AutoCompleteDb;

public class SearchEngineAction extends org.apache.struts.action.Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		System.out.println("in action");
		StringBuffer stateNames = new StringBuffer();
		AutoCompleteDb autoCompletedb = new AutoCompleteDb();
		List<String> stateLst = autoCompletedb.getDetailsDb();
		Iterator<String> iterator = stateLst.iterator();

		while (iterator.hasNext()) {
			stateNames = stateNames.append(",").append((String) iterator.next());
		}
		response.getWriter().write(stateNames.toString());

		return null;
	}

}
