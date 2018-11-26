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
				</b></a>
				<div id="logout">
					<html:form action="/signoutAction.do" method="post">
						<html:submit value="Log Out" />
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
				<a href="/connectrivier/profile.jsp" id="username"><span><b>Profile</b></span>
				</a> <a href="/connectrivier/personalInformation.jsp"><span><b>Settings</b></span></a>
				<a href="/connectrivier/upload.jsp"><span><b>
							New Post</b></span></a>

			</div>
			<div id="topsearch">
				<form name="search_form" method="post" action="search.jsp">
					<input type="hidden" name="lookin" value="users" />

					<div id="searchinput">
						<input type="text" onClick="textClear(this);"
							value="Search Friends" name="lookfor" value="" rel="autocomplete"
							autocompleteoffset="-6,4" />
					</div>
				</form>
			</div>
		</div>
	</div>


	<div id="site">
		<div id="wholesite">



			<div id="pagebody" style="margin: 0px; border-top: 1px solid #fff;">
				<div>
					<div id="contacts_left" style="width: 100%;">

						<div class="ttl">

							<div class="ttl2">
								<h3>Contact us</h3>
							</div>
						</div>
						<div class="greygrad" style="margin-top: 5px;">
							<div class="greygrad2">
								<div class="greygrad3">
									<b>Contact Form:</b> <br>
									<hr>
									<br>
									<form method="post" action="">
										<table id="setform" style="width: 100%;" cellspacing="5">
											<tr>
												<td class="setparam">Your name:</td>
												<td><input type="text" class="setinp" name="fullname"
													value="" maxlength="100" /></td>
											</tr>
											<tr>
												<td class="setparam">E-mail:</td>
												<td><input type="text" class="setinp" name="email"
													value="" maxlength="100" /></td>
											</tr>
											<tr>
												<td class="setparam" valign="top">Your message:</td>
												<td><textarea style="width: 700px; height: 300px;"
														name="message"></textarea></td>
											</tr>

											<tr>
												<td></td>
												<td><input type="submit" name="sbm"
													value="Send message"
													style="padding: 4px; font-weight: bold;" /></td>
											</tr>
										</table>
									</form>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>


		</div>
	</div>

	<div class="klear"></div>


	<div id="subfooter">
		<div id="sfleft">
			ConnectRivier &middot; <a
				href="/connectrivier/contacts.jsp">Contacts</a>
			&middot;
		</div>
	</div>






</body>
</html>