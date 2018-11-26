<%@page import="com.connectrivier.entity.PrivateInfo"%>
<%@page import="com.connectrivier.entity.Upload"%>
<%@page import="com.connectrivier.entity.Address"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
Address addressObj = (Address) session.getAttribute("addressObj");
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
				<a
					href="/connectrivier/dashboard.jsp(yo chahi sabaiko blog type ko garna sakyo bhane)"
					id="logolink" title="ConnectRivier">ConnectRivier</a> <a href="/dashboard.jsp"
					class="homelink"><span><b>Home</b></span></a> <a
					href="/connectrivier/profile.jsp" id="username"><span><b>Profile</b></span>
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


			<div id="pagebody">

				<div id="profile">
					<div id="profile2">
						<div id="profile_left">
							<div id="profileavatar">
								<a href="\picture.jsp"></a>
							</div>

							<div id="homefltr">

								<a href="\ConnectRivier\connectrivier\session_saru_info.jsp" class="item info"><b></b><strong>Info</strong></a>
								<a href="\ConnectRivier\connectrivier\session_saru_friends.jsp" class="item friend"><b></b><strong>Friends</strong></a>
								<a href="\ConnectRivier\connectrivier\session_saru_albums.jsp" class="item info"><b></b><strong>Photos</strong></a>

							</div>











						</div>
						<div id="profile_content">
							<div id="profilehdr">

								<h2>Saru Maharjan</h2>
								<p></p>
								<div class="infoheader1">sarunmaharjan@yahoo.com
								</div>
							</div>

							<div style="padding-top: 8px; padding: 15px;">
								
								<div class="ttl">
									<div class="ttl2">
										<h3>Details</h3>
									</div>
								</div>
								<div style="margin-left: 4px;">
								
								
								
								<table id="setform" cellspacing="5">
								<tr>
									<td class="setparam"><bean:message key="lbl.firstname" /></td>
									<td>Saru</td>
								</tr>

								<tr>
									<td class="setparam"><bean:message key="lbl.middlename" /></td>
									<td></td>
								</tr>

								<tr>
									<td class="setparam"><bean:message key="lbl.lastname" /></td>
									<td>Maharjan</td>
								</tr>

								<tr>
									<td class="setparam"><bean:message key="lbl.email" /></td>
									<td>sarunmaharjan@yahoo.com</td>
								</tr>

								<tr>
									<td class="setparam"><bean:message key="lbl.phone" /></td>
									<td>7576947836</td>
								</tr>

								<tr>
									<td class="setparam"><bean:message	key="lbl.gender" /></td>
									<td>Male</td>
								</tr>

								<tr>
									<td class="setparam"><bean:message key="lbl.dob" /></td>
									<td>August 24</td>
								</tr>

								<tr>
									<td class="setparam"><bean:message key="lbl.schoolYear" /></td>
									<td>Graduate</td>
								</tr>

								<tr>
									<td class="setparam"><bean:message key="lbl.street" /></td>
									<td></td>
								</tr>
								<tr>
									<td class="setparam"><bean:message key="lbl.city" /></td>
									<td></td>
								</tr>
								<tr>
									<td class="setparam"><bean:message key="lbl.state" /></td>
									<td>MN</td>
								</tr>

								<tr>
									<td class="setparam"><bean:message key="lbl.zipcode" /></td>
									<td></td>
								</tr>

			     				<tr>
									<td class="setparam"><bean:message key="lbl.aboutMe" /></td>
								<td>Glad to be a Truman graduate</td>
								</tr>
 
								
							</table>
								</div>
							</div>
						</div>


						<div class="klear"></div>
					</div>
				</div>
			</div>
		</div>

		<div class="klear"></div>



		<div id="subfooter">
			<div id="sfleft">
				ConnectRivier &middot; <a
					href="/connectrivier/contacts">Contacts</a>
				&middot;
			</div>
		</div>

	</div>
	



</body>
</html>