<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page import="com.connectrivier.entity.Upload"%>
<%@page import="com.connectrivier.entity.PrivateInfo"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ page import="javax.mail.internet.*,javax.activation.*"%>
<%@ page import="java.io.*,java.util.*,javax.mail.*"%>                                                                                                            
                                   
<%@page import="java.util.Properties"%>                                                                                                     
<%@page import="javax.mail.Session"%>                                                                                                       
<%@page import="javax.mail.Authenticator"%>                                                                                                 
<%@page import="javax.mail.PasswordAuthentication"%>                                                                                        
<%@page import="javax.mail.Message"%>                                                                                                       
<%@page import="javax.mail.internet.MimeMessage"%>                                                                                          
<%@page import="javax.mail.internet.InternetAddress"%>                                                                                      
<%@page import="javax.mail.Transport"%>  
<%@ page import="java.io.*,java.util.*,javax.mail.*"%>
<%@ page import="javax.mail.internet.*,javax.activation.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>

<%-- <% --%>
//    String result;
//    // Recipient's email ID needs to be mentioned.
//    String to = "sarozzmaharjan@yahoo.com";

//    // Sender's email ID needs to be mentioned
//    String from = "sarozzmaharjan@gmail.com";

//    // Assuming you are sending email from localhost
//    String host = "ssl://smtp.gmail.com";

//    // Get system properties object
//    Properties properties = System.getProperties();

//    // Setup mail server
//    properties.setProperty("mail.smtp.host", host);

//    // Get the default Session object.
//    Session mailSession = Session.getDefaultInstance(properties);

//    try{
//       // Create a default MimeMessage object.
//       MimeMessage message = new MimeMessage(mailSession);
//       // Set From: header field of the header.
//       message.setFrom(new InternetAddress(from));
//       // Set To: header field of the header.
//       message.addRecipient(Message.RecipientType.TO,
//                                new InternetAddress(to));
//       // Set Subject: header field
//       message.setSubject("This is the Subject Line!");
//       // Now set the actual message
//       message.setText("This is actual message");
//       // Send message
//       Transport.send(message);
//       result = "Sent message successfully....";
//    }catch (MessagingException mex) {
//       mex.printStackTrace();
//       result = "Error: unable to send message....";
//    }
<%-- %> --%>



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
String tempPassword = (String) request.getAttribute("tempPassword");


%>
<%-- <% --%>

// out.println("result:"+result+"\n");
<%-- %> --%>
	
	<div id="toprow" class="">
		<div id="toprow2">

			<div id="userlinks">
				<a href="/connectrivier/signin.jsp" style="font-weight: bold"><b>Sign in</b></a> 
			</div>

		</div>
	</div>
	<div id="nethdr1">
		<div id="nethdr2">


			<div id="netnav" class="specialhomelink">
				<a href="/connectrivier/dashboard.jsp" id="logolink"
					title="ConnectRivier">ConnectRivier</a> 

			</div>
		
		</div>
	</div>
	<div id="site">
		<div id="wholesite">

		
				
								
				<div id="pagebody">
										<div id="settings">
						
						<div id="settings_right">
							<div class="ttl">
								<div class="ttl2">
									<h3>Reset Password</h3>
								</div>
							</div>
														<div class="greygrad" style="margin-top:5px;">
								<div class="greygrad2">
									<div class="greygrad3">
										<b>This is your temporary password to login. Please change it after you log in into your account.</b>
										<h3><%=tempPassword %></h3> 
										
									</div>
								</div>
							</div>
							
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