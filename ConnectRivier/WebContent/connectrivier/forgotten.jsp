<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.connectrivier.entity.Upload"%>
<%@page import="com.connectrivier.entity.PrivateInfo"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>

<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
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



<style type="text/css">
.inputapi-transliterate-indic-suggestion-menu {
	margin-top: -80px;
}
</style>


</head>
<body>

	<div id="toprow" class="">
		<div id="toprow2">

			<div id="userlinks">
				<a href="http://sand.truman.edu/~sm5314/capstone/signin"><b>Sign
						in</b></a> <a href="http://sand.truman.edu/~sm5314/capstone/signup"><b>Sign
						up</b></a>
			</div>

		</div>
	</div>


	<div id="nethdr1">
		<div id="nethdr2">


			<div id="netnav" class="specialhomelink">
				<a href="http://sand.truman.edu/~sm5314/capstone/dashboard"
					id="logolink" title="ConnectRivier">ConnectRivier</a>
			</div>

			<div id="topsearch">
				<form name="search_form" method="post"
					action="http://sand.truman.edu/~sm5314/capstone/search">
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



			<div id="slim_msgbox" style="display: none;">
				<strong id="slim_msgbox_msg"></strong> <a href="javascript:;"
					onclick="msgbox_close('slim_msgbox'); this.blur();"
					onfocus="this.blur();"><b></b></a>
			</div>


			<div id="pagebody">
				<div class="ttl" style="margin-bottom: 10px;">
					<div class="ttl2">
						<h3>Forgotten Password - ConnectRivier</h3>
					</div>
				</div>
				<logic:present name="errorList">
					<logic:iterate id="error" name="errorList">
						<p style="color: red">
							<bean:write name="error" />
						</p>
					</logic:iterate>
				</logic:present>
				<html:form method="post" action="/forgetPasswordAction.do">
					<table id="regform" cellspacing="5">
						<tr>
							<td class="regparam">E-mail:</td>
							<td><input type="text" name="email" value="" maxlength="100"
								class="reginp" /></td>
						</tr>
						<tr>
							<td></td>
							<td><html:submit></html:submit></td>
						</tr>
					</table>
				</html:form>
				<html:errors />

			</div>
		</div>

		<div class="klear"></div>


		<div id="subfooter">
			<div id="sfleft">
				ConnectRivier &middot; <a
					href="http://sand.truman.edu/~sm5314/capstone/contacts">Contacts</a>
				&middot;
			</div>
		</div>


	</div>


</body>
</html>