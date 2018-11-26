<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	   <%@page import="com.connectrivier.entity.Upload"%>
<%@page import="com.connectrivier.entity.PrivateInfo"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<!DOCTYPE html>
<html>
<head>
<title>ConnectRivier: Let's get connected</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="description" content="ConnectRivier - let's get connected" />
<meta name="keywords" content="Connect with your friends" />
<meta name="author" content="Saroj Maharjan" />


<link rel="stylesheet"
	href="https://s3.us-east-2.amazonaws.com/elasticbeanstalk-us-east-2-336696735975/css/albums.css">
<link rel="stylesheet"
	href="https://s3.us-east-2.amazonaws.com/elasticbeanstalk-us-east-2-336696735975/css/inside.css">
<link href="/ConnectRivier/contents/favicon.ico" type="image/x-icon"
	rel="shortcut icon" />


</head>
<body>
<% 
session = request.getSession(false);
String user = (String) session.getAttribute("user"); 
String fullname = (String) session.getAttribute("fullname");
String username = (String) session.getAttribute("username");
PrivateInfo privateInfoObj = (PrivateInfo) session.getAttribute("privateInfoObj");
// Upload uploadObj = (Upload)session.getAttribute("uploadObj");


%>


	<div id="toprow" class="">
		<div id="toprow2">
			<div id="userlinks">

			<a href="/connectrivier/profile.jsp" id="username"><b>Welcome
						<font color="indigo" size="3px"> <%=user %><br>
					</font>
				</b></a> <div id="logout">
					<html:form action="/signoutAction.do" method="post">
						<html:submit value="Log Out"/>
					</html:form>
				</div>
			</div>
		</div>
	</div>
	<div id="nethdr1">
		<div id="nethdr2">


			<div id="netnav" class="specialhomelink">
				<a href="/connectrivier/dashboard.jsp" id="logolink"
					title="ConnectRivier">ConnectRivier</a> <a
					href="/connectrivier/dashboard.jsp" class="homelink"><span><b>Home</b></span></a>

				<a href="/connectrivier/profile.jsp" id="username"><span><b>Profile</b></span> </a> <a
					href="/connectrivier/personalInformation.jsp"><span><b>Settings</b></span></a>

				<a href="/connectrivier/upload.jsp"><span><b>
							New Post</b></span></a>

			</div>
			<div id="topsearch">
				<form name="search_form" method="post" action="search.jsp">
					<input type="hidden" name="lookin" value="users" />

					<div id="searchinput">
						<input type="text" id="country" name="country" value="Search Friends"
							onClick="textClear(this);" />

						<script>
							$("#country").autocomplete("getdata.jsp");
						</script>

					</div>
				</form>
			</div>
		</div>
	</div>
	<div id="site">
		<div id="wholesite">



			<div id="slim_msgbox" style="display: none;">
				<strong id="slim_msgbox_msg"></strong> <a href="javascript:;"
					onclick="msgbox_close('slim_msgbox'); this.blur();"
					onfocus="this.blur();"><b>OK</b></a>
			</div>




			<div id="pagebody">
				<div id="settings">
					<div id="settings_left">
						<div class="ttl" style="margin-right: 12px;">
							<div class="ttl2">
								<h3>Account Settings</h3>
							</div>
						</div>
						<div class="sidenav">
							<a href="/connectrivier/personalInformation.jsp">Personal
								Information</a> <a href="/connectrivier/changePassword.jsp"
								class="">Change Password</a> <a
								href="/connectrivier/delAccount.jsp" class="">Delete
								Account</a>


						</div>
					</div>
					<div id="settings_right">
						<div class="ttl">
							<div class="ttl2">
								<h3>Profile Information</h3>
							</div>
						</div>
						<html:errors/>
						<html:form action="/personalInformationAction" method="POST" >
							<table id="setform" cellspacing="5">
								<tr>
									<td><bean:message key="lbl.firstname" /></td>
									<td><html:text name="personalInfo" property="firstname" /></td>
									<td><html:errors property="firstname" /></td>
								</tr>

								<tr>
									<td class="setparam"><bean:message key="lbl.middlename" /></td>
									<td><html:text name="personalInfo" property="middlename" /></td>
								</tr>

								<tr>
									<td class="setparam"><bean:message key="lbl.lastname" /></td>
									<td><html:text name="personalInfo" property="lastname" /></td>
									<td><html:errors property="lastname" /></td>
								</tr>

								<tr>
									<td class="setparam"><bean:message key="lbl.email" /></td>
									<td><html:text name="personalInfo" property="email" /></td>
								</tr>

								<tr>
									<td class="setparam"><bean:message key="lbl.phone" /></td>
									<td><html:text name="personalInfo" property="phone" /></td>
								</tr>

								<tr>
									<td class="setparam" valign="top"><bean:message
											key="lbl.gender" /></td>
									<td><label><html:radio name="personalInfo"
												property="gender" value="male" /><span>Male</span></label> <label>
											<html:radio name="personalInfo" property="gender" value="female" /><span>Female</span>
									</label></td>
								</tr>

								<tr>
									<td class="setparam"><bean:message key="lbl.dob" /></td>
									<td><html:text name="personalInfo" property="dob" /></td>
								</tr>
								
								<tr>
									<td class="setparam"><bean:message key="lbl.country" /></td>
									<td><html:text name="personalInfo" property="country" /></td>
								</tr>

								<tr>
									<td class="setparam"><bean:message key="lbl.schoolYear" /></td>
									<td><html:text name="personalInfo" property="schoolyear" /></td>
								</tr>

								<tr>
									<td class="setparam"><bean:message key="lbl.street" /></td>
									<td><html:text name="personalInfo" property="street" /></td>
								</tr>
								<tr>
									<td class="setparam"><bean:message key="lbl.city" /></td>
									<td><html:text name="personalInfo" property="city" /></td>
								</tr>
								<tr>
									<td class="setparam"><bean:message key="lbl.state" /></td>
									<td><html:text name="personalInfo" property="state" /></td>
								</tr>

								<tr>
									<td class="setparam"><bean:message key="lbl.zipcode" /></td>
									<td><html:text name="personalInfo" property="zipcode" /></td>
								</tr>

						       <tr>
							   <td class="setparam"><bean:message key="lbl.aboutMe" /></td>
								<td><html:textarea cols="40" rows="6" name="personalInfo" property="aboutme" style="height: 90px;"></html:textarea></td>
								</tr> 
								<tr>
									<td></td>
									<td><html:submit style="padding: 4px; font-weight: bold;" /></td>
									<td><html:reset /></td>
								</tr>
							</table>
						</html:form>
					</div>
				</div>
			</div>
		</div>



		<div id="subfooter">
			<div id="sfleft">
				ConnectRivier &middot; <a
					href="/connectrivier/contacts.jsp">Contacts</a>
				&middot;
			</div>
		</div>

	</div>



</body>
</html>