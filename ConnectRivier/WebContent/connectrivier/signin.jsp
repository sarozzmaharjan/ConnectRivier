<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<!DOCTYPE html>
<html>

<head>
	<title>ConnectRivier: Let's get connected</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<meta name="description" content="ConnectRivier - let's get connected" />
	<meta name="keywords" content="Connect with your friends" />
	<meta name="author" content="Saroj Maharjan" />

	<link href="http://connectrivier-env.smqtm2aptp.us-east-2.elasticbeanstalk.com/contents/favicon.ico" type="image/x-icon"
	 rel="shortcut icon" />
	<!-- <link href="http://connectrivier-env.smqtm2aptp.us-east-2.elasticbeanstalk.com/css/albums.css" type="text/css" rel="stylesheet" />
<link href="http://connectrivier-env.smqtm2aptp.us-east-2.elasticbeanstalk.com/css/inside.css" type="text/css" rel="stylesheet" /> -->

	<link rel="stylesheet" href="https://s3.us-east-2.amazonaws.com/elasticbeanstalk-us-east-2-336696735975/css/albums.css">
	<link rel="stylesheet" href="https://s3.us-east-2.amazonaws.com/elasticbeanstalk-us-east-2-336696735975/css/inside.css">



</head>

<body>

	<div id="toprow" class="">
		<div id="toprow2">

			<div id="userlinks">
				<a href="/connectrivier/signin.jsp"><b>Sign in</b></a> <a href="/connectrivier/signup.jsp"><b>Sign
						up</b></a>
			</div>

		</div>
	</div>


	<div id="nethdr1">
		<div id="nethdr2">


			<div id="netnav" class="specialhomelink">
				<a href="/connectrivier/main.jsp" id="logolink" title="ConnectRivier">ConnectRivier</a>
			</div>



		</div>
	</div>


	<div id="site">
		<div id="wholesite">

			<div id="slim_msgbox" style="display: none;">
				<strong id="slim_msgbox_msg"></strong> <a href="javascript:;" onclick="msgbox_close('slim_msgbox'); this.blur();"
				 onfocus="this.blur();"><b></b></a>
			</div>


			<div id="pagebody">
				<script type="text/javascript">
					function js_fix_url() {
						window.location.href = window.location.href.replace("signout:ok", "");
					}
				</script>

				<div id="poblicpage_login">
					<html:form action="/signinAction.do" method="post">
						<div style="padding: 16px">
							<logic:present name="errorList">
								<logic:iterate id="error" name="errorList">
									<p style="color: red">
										<bean:write name="error" />
									</p>
								</logic:iterate>
							</logic:present>
						</div>
						<table id="regform" cellspacing="5">


							<h2>Sign In</h2>


							<tr>
								<td class="regparam">
									<bean:message key="lbl.username" />
								</td>
								<td>
									<html:text name="signin" property="username" value="" tabindex="1" maxlength="100" />
								</td>
							</tr>
							<tr>
								<td class="regparam">
									<bean:message key="lbl.password" />
								</td>
								<td>
									<html:password name="signin" property="password" value="" tabindex="2" maxlength="100" />
								</td>
							</tr>
							<tr>
								<td></td>
								<td valign="middle">
									<html:submit tabindex="4" style="float:left; padding:4px; font-weight:bold;" /> <label style="margin: 0px; padding: 0px; margin-left: 10px; margin-top: 7px; float: left; clear: none;">

									</label></td>
							</tr>
							<tr>

								<td><a id="forgotpass" href="/connectrivier/forgotten.jsp">Forgot your password?</a>
								</td>
							</tr>
						</table>
					</html:form>
				</div>

				<div id="poblicpage_info">
					<h2>No account yet?</h2>
					You can create your free account and start sharing stuff with your
					friends.
					<div id="joinnow">
						<a href="/connectrivier/signup.jsp" class="register" style="margin-top: 0px; padding: 6px 10px; color: #000;"><b>Sign
								up now</b></a>

						<div id="loginlinks" style="border: 0; float: left; margin-top: 15px;">
							<div style="float: left; margin-right: 5px;" title="Facebook Connect"></div>
						</div>
					</div>
				</div>
			</div>
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