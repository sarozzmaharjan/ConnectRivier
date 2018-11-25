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
	href="https://s3.us-east-2.amazonaws.com/elasticbeanstalk-us-east-2-336696735975/css/outside.css">
<link href="/ConnectRivier/contents/favicon.ico" type="image/x-icon"
	rel="shortcut icon" />
											
	</head>
	<body>
	
	<div id="heading">
		<div id="headfront">
	                               
						<div id="toprow" class="specialhomelink">						
							<a href="/ConnectRivier/connectrivier/main.jsp" id="logolink" title="ConnectRivier"></a>										
						</div>
				
				<div id="loginbox">
								<html:form action="/signinAction.do" method="post">
								
													 
									<<html:text name="signin" property="username" onfocus="textClear(this);" value="username"  tabindex="1" />
									 
									<<html:password name="signin" property="password"  onfocus="textClear(this);" value="password"  tabindex="2" />
									<input type="submit" id="loginbtn" class="loginbtn" value="Sign In" tabindex="4" />
									<label style="clear:none;">
										<input type="checkbox" name="rememberme" value="1" tabindex="3" />
										<span>Remember me</span>
										<span><a href="http://sand.truman.edu/~sm5314/capstone/signin/forgotten">Forgotten Password?</a></span>
									</label>
								</html:form>
				</div>								
		</div>	
	</div>
	
	
<div id="sitehome">
	<div id="wholesite">
	
			<div id="pagebody">			
			<div id="homewraper">
			
				<div id="intro">
					<h1>Welcome to ConnectRivier-</h1>
								<p align="justify">
									<font color="#fff" style="text-shadow:2px 1px 2px #000;"><b>ConnectRivier is the a social network or a community where you get connected with you friends </b> <br><br></font>
								</p>
				</div>

				<div id="useronline2">
				<div id="signuphome">
				
								<div class="signuphdr">
								<p align="center" style="font-size:24px; font-weight:800; margin-top:10px;">Create New Account</p>
								</div>
								<hr >
								
								<html:form action="/signupAction.do" method="post">
								<table width="300" height="146" border="0" cellpadding="0" cellspacing="0">
								  <tr>
								    <td width="80"><b>Email</b></td>
								    <td width="6">&nbsp;</td>
								    <td width="285"><html:text name="signup" property="email" value="" /></td>
								  </tr>
								  <tr>
								    <td><b>Full Name</b></td>
								    <td>&nbsp;</td>
								    <td><html:text name="signup" property="realname" value=""/></td>
								  </tr>
								  <tr>
								    <td><b>User name</b></td>
								    <td>&nbsp;</td>
								    <td><html:text name="signup" property="username" value=""/></td>
								  </tr>
								  <tr>
								    <td><b>Password</b></td>
								    <td>&nbsp;</td>
								    <td><html:password name="signup" property="password" value=""/></td>
								  </tr>
								<tr>
								    <td><b>Confirm Password</b></td>
								    <td>&nbsp;</td>
								    <td><html:password name="signup" property="confirmPassword" value="" /></td>
								  </tr>
												
								  <tr>
								    <td>&nbsp;</td>
								    <td>&nbsp;</td>
								    <td style="padding:0; margin:0; ">
								    <input type="submit" value="Join Now" class="signupbtn" style=" margin-right:15px; font-weight:bold;" /></td>
								  </tr>
								</table>
								</html:form>
						
				</div>			 
				</div>
				
 			</div>
			</div>

				
<div class="footerintro">
			 ConnectRivier: Let's get connected || <a href="/contacts">Contact us</a>   
</div>
				
	</div>
</div>
		

</body>
</html>