package com.connectrivier.action;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.connectrivier.entity.AutoCompleteDb;

public class SearchAction extends org.apache.struts.action.Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		System.out.println("in action");
		StringBuffer names = new StringBuffer();
		AutoCompleteDb autoCompletedb = new AutoCompleteDb();
		List<String> nameLst = autoCompletedb.getDetailsDb();
		Iterator<String> iterator = nameLst.iterator();

		while (iterator.hasNext()) {
			names = names.append(",").append((String) iterator.next());
		}
		response.getWriter().write(names.toString());

		return null;
	}

}
