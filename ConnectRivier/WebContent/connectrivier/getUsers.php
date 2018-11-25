<?php
mysql_connect("jdbc:mysql://sql3.freemysqlhosting.net:3306/sql322179?","sql322179","hQ9%fV2*") or die(mysql_error());
mysql_select_db("sql322179") or die(mysql_error());


$partialUsers = $_POST['partialUser'];

$users = mysql_query("SELECT FULLNAME FROM SIGNUP WHERE USERNAME LIKE '%$partialUsers%' ");

while($user = mysql_fetch_array($users)){
	
	"<div>".$user['USERNAME']."</div>";
}

?>
