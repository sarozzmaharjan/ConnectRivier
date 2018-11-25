
<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="description" content="ConnectRivier - let's get connected" />
<meta name="keywords" content="Connect with your friends" />
<meta name="author" content="Saroj Maharjan" />



<title><bean:message key="title.login" /></title>
</head>
<body>
	<html:form action="/personalInformationAction" method="POST" >
		<table>
			<tr>
				<td><bean:message key="lbl.firstname" /></td>
				<td><html:text name="personalInfo" property="firstname" /></td>
				<td><html:errors property="firstname"/></td>
			</tr>
			<tr>
				<td><bean:message key="lbl.middlename" /></td>
				<td><html:text name="personalInfo" property="middlename" /></td>
			</tr>
			<tr>
				<td><bean:message key="lbl.lastname" /></td>
				<td><html:text name="personalInfo" property="lastname" /></td>
				<td><html:errors property="lastname"/></td>
			</tr>
			<tr>
				<td><bean:message key="lbl.email" /></td>
				<td><html:text name="personalInfo" property="email" /></td>
			</tr>
			<tr>
				<td><bean:message key="lbl.phone" /></td>
				<td><html:text name="personalInfo" property="phone"  /></td>
			</tr>
			<tr>
				<td><bean:message key="lbl.gender" /></td>
				<td><html:text name="personalInfo" property="gender" /></td>
			</tr>

			<tr>
				<td><bean:message key="lbl.dob" /></td>
				<td><html:text name="personalInfo" property="dob" /></td>
			</tr>

			<tr>
				<td><bean:message key="lbl.schoolYear" /></td>
				<td><html:text name="personalInfo" property="schoolyear" /></td>
			</tr>

			<tr>
				<td><bean:message key="lbl.street" /></td>
				<td><html:text name="personalInfo" property="street" /></td>
			</tr>
			<tr>
				<td><bean:message key="lbl.city" /></td>
				<td><html:text name="personalInfo" property="city" /></td>
			</tr>
			<tr>
				<td><bean:message key="lbl.state" /></td>
				<td><html:text name="personalInfo" property="state" /></td>
			</tr>

			<tr>
				<td><bean:message key="lbl.zipcode" /></td>
				<td><html:text name="personalInfo" property="zipcode" /></td>
			</tr>

			<tr>
				<td><html:submit /></td>
				<td><html:reset /></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
			</tr>

		</table>

	</html:form>


</body>
</html>
