<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page import="com.connectrivier.entity.Upload"%>
<%@page import="com.connectrivier.entity.PrivateInfo"%>
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
					href="/connectrivier/dashboard.jsp
					id="logolink" title="ConnectRivier">ConnectRivier</a> <a href="/dashboard.jsp"
					class="homelink"><span><b>Home</b></span></a> <a
					href="/connectrivier/profile.jsp" id="username" class="onnettab"><span><b>Profile</b></span>
				</a> <a href="/connectrivier/settings.jsp"><span><b>Settings</b></span></a> <a
					href="javascript:;" onclick="postform_open();"><span><b>
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





			<div id="postform" style="display: none;">
				<form name="post_form" action="" method="post"
					onsubmit="return false;">
					<div id="pf_mainpart" style="display: none;">
						<script type="text/javascript">
							pf_msg_max_length = 5000;
							pf_close_confirm = "Discard changes?";
							pf_rmatch_confirm = "Remove attachment?";
						</script>
						<div id="pfhdr">
							<div id="pfhdrleft">
								<b id="pf_title_newpost">Share something </b> <b
									id="pf_title_edtpost" style="display: none;">Edit message:</b>
								<div id="sharewith_user" class="pmuser" style="display: none;">
									<strong>user:</strong> <input type="text" name="username"
										value="" class="recdrop2" rel="autocomplete"
										autocompleteoffset="0,3"
										autocompleteafter="d.post_form.message.focus(); postform_sharewith_user(d.post_form.username.value);"
										onblur="postform_bgcheck_username();" /> <a
										href="javascript:;"
										onclick="dropdiv_open('updateoptions',-2);"
										onfocus="this.blur();"></a>
								</div>
								<div id="sharewith_group" class="pmuser" style="display: none;">
									<strong>group:</strong> <input type="text" name="groupname"
										class="recdrop2" value="" rel="autocomplete"
										autocompleteoffset="0,3"
										autocompleteafter="d.post_form.message.focus(); postform_sharewith_group(d.post_form.groupname.value);"
										onblur="postform_bgcheck_groupname();" /> <a
										href="javascript:;"
										onclick="dropdiv_open('updateoptions',-2);"
										onfocus="this.blur();"></a>
								</div>
							</div>

							<div id="pfhdrright">
								<a href="javascript:;" onclick="postform_close_withconfirm();"
									onfocus="this.blur();"></a> <small><span
									id="pf_chars_counter">5000</span> symbols left</small>
							</div>

						</div>
						<textarea id="transl2" name="message" tabindex="1"
							rel="autocomplete" autocompleteoffset="0,3"></textarea>
						<div id="pfattach">
							<a href="javascript:;" class="attachbtn"
								onclick="postform_attachbox_open('image', 131); this.blur();"
								id="attachbtn_image" tabindex="3"><b> Photo</b></a>
							<div id="attachok_image" class="attachok" style="display: none;">
								<span><b>Image:</b> <em id="attachok_image_txt"></em> <a
									href="javascript:;" class="removeattachment"
									onclick="postform_attach_remove('image');"
									onfocus="this.blur();"></a></span>
							</div>
							<a href="javascript:;" class="attachbtn"
								onclick="postform_attachbox_open('videoembed', 110); this.blur();"
								id="attachbtn_videoembed" tabindex="3"><b> Video</b></a>
							<div id="attachok_videoembed" class="attachok"
								style="display: none;">
								<span><b>Video:</b> <em id="attachok_videoembed_txt"></em>
									<a href="javascript:;" class="removeattachment"
									onclick="postform_attach_remove('videoembed');"
									onfocus="this.blur();"></a></span>
							</div>
							<a href="javascript:;" id="postbtn" onclick="postform_submit();"
								tabindex="2"><b id="postbtn_newpost">+Post</b><b
								id="postbtn_edtpost" style="display: none;">Save</b></a>
						</div>
					</div>
					<div id="attachbox" style="display: none;">
						<div id="attachboxhdr"></div>
						<div id="attachboxcontent">
							<div id="attachboxcontent_link" style="display: none;">
								<a href="javascript:;" class="closeattachbox"
									onclick="postform_attachbox_close();" onfocus="this.blur();"></a>
								<div class="attachform">
									<small id="attachboxtitle_link" defaultvalue="URL:"></small> <input
										type="text" name="atch_link" value="" style="width: 400px;"
										onpaste="postform_attach_pastelink(event,this,postform_attach_submit);"
										onkeyup="postform_attach_pastelink(event,this,postform_attach_submit);" />
								</div>
								<div id="attachboxcontent_link_ftr" class="submitattachment">
									<a href="javascript:;" class="submitattachmentbtn"
										onclick="postform_attach_submit();" onfocus="this.blur();"><b>Attach
											Link</b></a>
									<div class="orcancel">
										or <a href="javascript:;"
											onclick="postform_attachbox_close();" onfocus="this.blur();">Cancel</a>
									</div>
								</div>
							</div>
							<div id="attachboxcontent_image" style="display: none;">
								<div class="litetabs">
									<a href="javascript:;" class="closeattachbox"
										onclick="postform_attachbox_close();" onfocus="this.blur();"></a>
									<a href="javascript:;"
										onclick="postform_attachimage_tab('upl');"
										id="attachform_img_upl_btn" class="onlitetab"
										onfocus="this.blur();"><b>Upload image</b></a> <a
										href="javascript:;" onclick="postform_attachimage_tab('url');"
										id="attachform_img_url_btn" class="" onfocus="this.blur();"><b>Get
											image from URL</b></a>
								</div>
								<div class="attachform">

									<div id="attachform_img_url_div" style="display: none;">
										<small id="attachboxtitle_image_url" defaultvalue="Image URL:"></small>
										<input type="text" name="atch_image_url" value=""
											style="width: 400px;"
											onpaste="postform_attach_pastelink(event,this,postform_attach_submit);"
											onkeyup="postform_attach_pastelink(event,this,postform_attach_submit);" />
									</div>
								</div>
								<div id="attachboxcontent_image_ftr" class="submitattachment">
									<a href="javascript:;" class="submitattachmentbtn"
										onclick="postform_attach_submit();" onfocus="this.blur();"><b>Upload
											Image</b></a>
									<div class="orcancel">
										or <a href="javascript:;"
											onclick="postform_attachbox_close();" onfocus="this.blur();">Cancel</a>
									</div>
								</div>
							</div>
							<div id="attachboxcontent_videoembed" style="display: none;">
								<a href="javascript:;" class="closeattachbox"
									onclick="postform_attachbox_close();" onfocus="this.blur();"></a>
								<div class="attachform">
									<small id="attachboxtitle_videoembed"
										defaultvalue="Embed code / URL:"></small> <input type="text"
										name="atch_videoembed" value="" style="width: 400px;"
										onpaste="postform_attach_pastelink(event,this,postform_attach_submit);"
										onkeyup="postform_attach_pastelink(event,this,postform_attach_submit);" />
								</div>
								<div id="attachboxcontent_videoembed_ftr"
									class="submitattachment">
									<a href="javascript:;" class="submitattachmentbtn"
										onclick="postform_attach_submit();" onfocus="this.blur();"><b>Embed
											Video</b></a>
									<div class="orcancel">
										or <a href="javascript:;"
											onclick="postform_attachbox_close();" onfocus="this.blur();">Cancel</a>
									</div>
								</div>
							</div>
						</div>
						<div id="attachboxftr"></div>
					</div>

					<div id="pfattached">
						<div id="att_ok_image_container"
							style="display: block; margin-top: 1px;" title="Image:"></div>
						<div id="att_ok_videoembed_container"
							style="display: block; margin-top: 1px;" title="Video:"></div>
					</div>

				</form>
			</div>


			<div id="pagebody">

				<div id="profile">
					<div id="profile2">
						<div id="profile_left">
							<div id="profileavatar">
								<a href="\picture.jsp"></a>
							</div>

							<div id="homefltr">

								<a href="\info.jsp" class="item info"><b></b><strong>Info</strong></a>
								<a href="\friends.jsp" class="item friend"><b></b><strong>Friends</strong></a>
								<a href="\albums.jsp" class="item info"><b></b><strong>Photos</strong></a>

							</div>











						</div>
						<div id="profile_content">
							<div id="profilehdr">



								<h2>UserName</h2>
						 
					
					 		
						 
												<div id="usermenu">
														<a href="javascript:;" onclick="postform_open();">New Post</a>
							
														<div id="usrpg_top_tooltip" class="umtt" style="display:none;"><div></div></div>
						</div>
						
						
					</div>
					
									<div style="padding-top:8px; padding:15px;">
												<div class="ttl" style="margin-top:4px;"><div class="ttl2">
							<h3>About Me</h3>
														<a class="ttlink" href="\settings.jsp">edit</a>
													</div></div>
						<div style="margin-left:4px;">
							<table cellspacing="4">
								<tr>
								<td>Some about user</td>
								</tr>
							</table>
						</div>
												<div class="ttl"><div class="ttl2">
							<h3>Details</h3>
														<a class="ttlink" href="\settings.jsp">edit</a>
													</div></div>
						<div style="margin-left:4px;">
							<table cellspacing="4">
																<tr>
									<td class="detailsparam">Location:</td>
									<td class="detailsvalue"></td>
								</tr>
																								<tr>
									<td class="detailsparam">Gender:</td>
									<td class="detailsvalue"></td>
								</tr>
																								<tr>
									<td class="detailsparam">Birthday:</td>
									<td class="detailsvalue"></td>
								</tr>
					
												
																															</table>
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

	</div>
	</div>



</body>
</html>