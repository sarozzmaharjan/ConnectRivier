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
		<script src="jquery-latest.js"></script>
		<link rel="stylesheet" href="jquery.autocomplete.css" type="text/css"/>
		<script type="text/javascript" src="jquery.autocomplete.js"> </script>
		<script type="text/javascript" src="jquery.bgiframe.min.js"></script>
		<script src="jquery.dimensions.js"></script>
		<script type="text/javascript" src="jquery.autocomplete.js"></script>
		
		<script type="text/javascript" src="/ConnectRivier/js/jquery-latest.js"></script>
<script type="text/javascript" src="/ConnectRivier/js/jquery.autocomplete.js"></script>
<script type="text/javascript" src="/ConnectRivier/js/jquery.bgiframe.min.js"></script>
<script type="text/javascript" src="/ConnectRivier/js/jquery.dimensions.js"></script>
<link type="text/css" rel="stylesheet" href="/ConnectRivier/js/jquery.autocomplete.css"/>
		<script>
		function getDetails(){
			autoCompleteSearch("enquiry.do","txtsearch");
		}
		function autoCompleteSearch(urlData,textBoxId){
			$.ajax({
			url:urlData,
			dataType:'text',
			type:'GET',
			error:function(){
				alert('Error loading jsp document');
			},
			success:function(text){
				var data = text.split(",");
				$("#"+textBoxId).autocomplete(data);				
			}
			
			
			});
			
		}
		</script>
	
		
		<link href="/ConnectRivier/css/albums.css" type="text/css" rel="stylesheet" />
		<link href="/ConnectRivier/css/inside.css" type="text/css" rel="stylesheet" />
		<link href="/ConnectRivier/contents/favicon.ico" type="image/x-icon" rel="shortcut icon" />

		
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
							
							<a href="/ConnectRivier/connectrivier/profile.jsp" id="username"><b>Welcome
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
												<a href="/ConnectRivier/connectrivier/dashboard.jsp" id="logolink" title="ConnectRivier">ConnectRivier</a>
															
							<a href="/ConnectRivier/connectrivier/dashboard.jsp" class="homelink"><span><b>Home</b></span></a>
							
							<a href="/ConnectRivier/connectrivier/profile.jsp" id="username" ><span><b>Profile</b></span> </a>
																																																		
							<a href="/ConnectRivier/connectrivier/personalInformation.jsp"><span><b>Settings</b></span></a>
							
							<a href="/ConnectRivier/connectrivier/upload.jsp"><span><b>
							New Post</b></span></a>																			
							
						</div>
						<div id="topsearch">
								<form name="search_form" method="post" action="/search.jsp">
									<input type="hidden" name="lookin" value="users" />
								 
									<div id="searchinput"> <input type="text"  onClick="textClear(this);" value="Search Friends" name="lookfor" value="" rel="autocomplete" autocompleteoffset="-6,4" /></div>
								</form>
						</div>
					</div>
				</div>
	<div id="site">
		<div id="wholesite">		


			<div id="pagebody">
			<form method="post" action="ConnectRivier/connectrivier/search.jsp">
							<input type="hidden" name="lookin" value="users" />
							<strong style="display:block;padding:5px;padding-left:9px;">Search for</strong>
							<div class="greygrad">
								<div class="greygrad2">
									<div class="greygrad3" style="padding:3px;">
										<table id="setform" cellspacing="5">
											<tr>
												<td>
													<input type="text" name="txtsearch" id="txtsearch" />
													<input type="button" value="search" onclick="getDetails()"/>
												</td>
											</tr>
										</table>
									</div>
								</div>
							</div>
						</form>

			
			

				
		</div>

		<div class="klear"></div>



		<div id="subfooter">
			<div id="sfleft">
				ConnectRivier &middot; <a
					href="/ConnectRivier/connectrivier/contacts.jsp">Contacts</a>
				&middot;
			</div>
		</div>

	</div>
	</div>



</body>
</html>