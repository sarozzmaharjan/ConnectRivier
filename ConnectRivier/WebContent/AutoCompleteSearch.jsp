<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<title>AutoComplete search</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

		<script src="jquery-latest.js"></script>
		<link rel="stylesheet" href="jquery.autocomplete.css" type="text/css"/>
		<script type="text/javascript" src="jquery.autocomplete.js"> </script>
		<script type="text/javascript" src="jquery.bgiframe.min.js"></script>
		<script src="jquery.dimensions.js"></script>
		
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
		</head>
		<body>
		STATES<br><br>
		<input type="text" name="txtsearch" id="txtsearch"/><input type="button" value="search" onclick="getDetails()">
		
		</body>
		</html>