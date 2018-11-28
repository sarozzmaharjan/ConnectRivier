<%@page import="com.connectrivier.entity.Upload"%>
<%@page import="com.connectrivier.entity.PrivateInfo"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
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

<script type="text/javascript" src="/js/inside.js"></script>
<script type="text/javascript" src="/js/inside_autocomplete.js"></script>
<script type="text/javascript" src="/js/inside_postform.js"></script>
<script type="text/javascript" src="/js/inside_posts.js"></script>
<script type="text/javascript" src="/js/swfobject.js"></script>



</head>
<body>

	<%
		session = request.getSession(false);
		String user = (String) session.getAttribute("user");
		String fullname = (String) session.getAttribute("fullname");
		String username = (String) session.getAttribute("username");
		PrivateInfo privateInfoObj = (PrivateInfo) session
				.getAttribute("privateInfoObj");
		Upload uploadObj = (Upload) session.getAttribute("uploadObj");
		// Upload uploadObj = (Upload)session.getAttribute("uploadObj");
	%>

	<div id="toprow" class="">
		<div id="toprow2">
			<div id="userlinks">

				<a href="/connectrivier/profile.jsp" id="username"><b>Welcome
						<font color="indigo" size="3px"> <%=user%><br>

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

				<div id="profile">
					<div id="profile2">
						<div id="profile_left">
							<div id="profileavatar">
								<a href="\picture.jsp"></a>
							</div>

							<div id="homefltr">

								<a href="/connectrivier/session_john_info.jsp" class="item info"><b></b><strong>Info</strong></a>
								<a href="/connectrivier/session_john_friends.jsp" class="item friend"><b></b><strong>Friends</strong></a>
								<a href="/connectrivier/session_john_albums.jsp" class="item info"><b></b><strong>Photos</strong></a>

							</div>


						</div>
						<div id="profile_content">
							<div id="profilehdr">

								<h2>John Smith</h2>
								<p></p>
								<div class="infoheader1">Male, johnsmith@rivier.edu
								</div>
							</div>

							<div style="padding-top: 8px; padding: 15px;">
								<div class="ttl" style="margin-top:-20px;">
									<div class="ttl2">
										<h3>About Me:</h3><br>
										<p>Hi, I am a freshman at Rivier</p>
									</div>
									<div class="klear"></div>
								</div>
							</div>


							<div id="posts_html" >
								
									<div class="post">


										<div class="postbody">


											<a href="\ConnectRivier\John%20Smith.jsp" class="postusername">
												John Smith
											</a>
											<div class="posttext">
												Feeling Happy

											</div>
											<div class="postftr">
												<font style="color: #999;"> 2018-11-19 14:15</font>

											</div>
											<br>


										</div>
										</div>
										<div class="post">
										
										
											<div class="postbody">


											<a href="\ConnectRivier\John%20Smith.jsp" class="postusername">
												John Smith
											</a>
											<div class="posttext">
												Hello World

											</div>
											<div class="postftr">
												<font style="color: #999;"> 2018-11-20 12:13</font>

											</div>
											<br>


										</div>
										



									</div>
									<div class="post">
										
										
											<div class="postbody">


											<a href="\ConnectRivier\John%20Smith.jsp" class="postusername">
												John Smith
											</a>
											<div class="posttext">
												Excitied for Christmas
											</div>
											<div class="postftr">
												<font style="color: #999;"> 2018-11-20 12:13</font>

											</div>
											<br>


										</div>
										



									</div>
								
							</div>






						</div>


					</div>
				</div>
			</div>

			<div class="klear"></div>
		</div>


		<div id="subfooter">
			<div id="sfleft">
				ConnectRivier &middot; <a href="/connectrivier/contacts.jsp">Contacts</a>
				&middot;
			</div>
		</div>

	</div>




</body>
</html>