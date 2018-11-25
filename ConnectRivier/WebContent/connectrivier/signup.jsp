
<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>

<html>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<meta name="description" content="ConnectRivier - let's get connected" />
		<meta name="keywords" content="Connect with your friends" />
		<meta name="author" content="Saroj Maharjan" />
		
		
		<link href="/ConnectRivier/css/albums.css" type="text/css" rel="stylesheet" />
		<link href="/ConnectRivier/css/inside.css" type="text/css" rel="stylesheet" />
		<link href="/ConnectRivier/contents/favicon.ico" type="image/x-icon" rel="shortcut icon" />
											
						
				
<title><bean:message key="title.registration" /></title>
</head>
<body>
	<div id="toprow" class="">
					<div id="toprow2">
											
							<div id="userlinks">
								<a href="/ConnectRivier/connectrivier/signin.jsp"><b>Sign in</b></a>
								<a href="/ConnectRivier/connectrivier/signup.jsp"><b>Sign up</b></a>
							</div>
														
					</div>
	</div>
	
	
	<div id="nethdr1">
		<div id="nethdr2">
					
					
			<div id="netnav" class="specialhomelink">
							<a href="/ConnectRivier/connectrivier/dashboard.jsp" id="logolink" title="ConnectRivier">ConnectRivier</a>																													
			</div>
			
			<div id="topsearch">
				<form name="search_form" method="post" action="http://sand.truman.edu/~sm5314/capstone/search">
					<input type="hidden" name="lookin" value="users" />
					 
					 
					<div id="searchinput"> <input type="text"  onClick="textClear(this);" value="Search Friends" name="lookfor" value="" rel="autocomplete" autocompleteoffset="-6,4" />						</div>
				</form>
			</div>
			
		</div>
	</div>
	
		<div id="site">
			<div id="wholesite">
				
				
				
				<div id="slim_msgbox" style="display:none;">
					<strong id="slim_msgbox_msg"></strong>
					<a href="javascript:;" onclick="msgbox_close('slim_msgbox'); this.blur();" onfocus="this.blur();"><b></b></a>
				</div>
				
								
				<div id="pagebody">
							
			
				<h1 style="margin-top:30px;">Sign Up for ConnectRivier</h1>
								
							
	<div style="color:red">
   	<html:errors />
    </div>
    
	<html:form action="/signupAction.do" method="post">
		<table id="regform" cellspacing="5" style="margin-bottom:10px;">
				<tr>
					<td class="regparam"><bean:message key="lbl.fullname" /></td>
					<td><html:text name="signup" property="realname" value=""/></td>
				</tr>
				
				<tr>
					<td class="regparam"><bean:message key="lbl.username" /></td>
					<td><html:text name="signup" property="username" value=""/></td>
				</tr>
				
				<tr>
					<td class="regparam"><bean:message key="lbl.email" /></td>
					<td><html:text name="signup" property="email" value="" /></td>
				</tr>
								
				<tr>
					<td class="regparam"><bean:message key="lbl.password" /></td>
					<td><html:password name="signup" property="password" value=""/></td>
				</tr>
				<tr>
					<td class="regparam"><bean:message key="lbl.confirmPassword" /></td>
					<td><html:password name="signup" property="confirmPassword" value="" /></td>
				</tr>
					
				<tr>
					<td><html:submit  value="Continue" style="padding:4px; font-weight:bold;" /></td>
					<td><html:reset /></td>
				</tr>
			
		</table>

	</html:form>
	
<div id="loginlinks">
						<div style="float:left; margin-top:5px;">
				<a id="facebookconnect" href="https://www.facebook.com/dialog/oauth?client_id=156910611046912&redirect_uri=http%3A%2F%2Fmeropost.com%2Fsignup%2Fget%3Afacebook&state=735b66909a724d44c94e0edbf24d241d"></a>
			</div>
								</div>
		
				</div>
			</div>
			
			<div class="klear"></div>
			 
			 
				<div id="subfooter">
				<div id="sfleft">
					ConnectRivier					&middot;
					<a href="/ConnectRivier/connectrivier/contacts.jsp">Contacts</a>
					&middot;								
				</div>				
			</div>
			
			
</div>
				
				
	</body>
</html>	
