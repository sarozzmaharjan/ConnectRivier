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
				</b></a><div id="logout">
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
				<a href="/connectrivier/profile.jsp" id="username"><span><b>Profile</b></span>
				</a> <a href="/connectrivier/personalInformation.jsp"><span><b>Settings</b></span></a>
				<a href="/connectrivier/upload.jsp"><span><b> New
							Post</b></span></a>

			</div>
			<div id="topsearch">
				<form name="search_form" method="post" action="${searchinput.country}">
					<input type="hidden" name="lookin" value="users" />

					<div id="searchinput">
						<input type="text" id="country" name="country"
							onselect="window.location.href= this.value +'.jsp'"/>

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


			<div id="pagebody">
			
			<div id="settings">
						<div id="settings_left">
														<div class="ttl" style="margin-right:12px;"><div class="ttl2"><h3>New Post</h3></div></div>
							<div class="sidenav">
								<a href="/connectrivier/upload.jsp">Write something</a>
								<a href="/connectrivier/uploadPost.jsp" class="">Upload Photo</a>															
								<a href="/connectrivier/uploadVideo.jsp" class="">Upload Video</a>

								
							</div>	
						</div>
						
			    <div id="settings_right">
			     <div class="ttl"><div class="ttl2"><h3>Write something</h3></div></div>
			     <div style="color:red">
   	<html:errors />
    </div>
			
					<html:form action="/uploadPostAction.do" method="post" enctype="multipart/form-data">
					<table id="setform" cellspacing="5">
 							<tr>
								<td class="setparam"> <bean:message key="lbl.selectFile" /></td>
							    <td><html:file name="uploadPost" property="file"/></td>
							</tr>
							<tr>
								<td class="setparam"> <bean:message key="lbl.caption" /></td>
							    <td><html:text name="uploadPost" property="fileCaption"/></td>
							</tr>
							<tr>
								<td class="setparam"> <bean:message key="lbl.description" /></td>
								<td><html:textarea name="uploadPost" property="fieldDescription">&nbsp;</html:textarea></td>
							</tr>
							<tr>
							  <td></td>
						      <td> <html:submit value="Upload" style="padding:4px; font-weight:bold;"/></td>
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
					ConnectRivier					&middot;
					<a href="/connectrivier/contacts.jsp">Contacts</a>
					&middot;								
				</div>				
			</div>
			
			</div>



</body>
</html>