<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!--[if lt IE 7]> <html class="no-js lt-ie9 lt-ie8 lt-ie7" lang="en"> <![endif]-->
<!--[if IE 7]>    <html class="no-js lt-ie9 lt-ie8" lang="en"> <![endif]-->
<!--[if IE 8]>    <html class="no-js lt-ie9" lang="en"> <![endif]-->
<!--[if gt IE 8]><!--> 
<html class="no-js" lang="en"> <!--<![endif]-->
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<title>G Nation</title>
	<meta name="description" content="">
	<meta name="author" content="G Adventures Inc.">
	<meta name="viewport" content="width=device-width; initial-scale=1.0">

	<!--[if lt IE 9]>
		<script src="http://css3-mediaqueries-js.googlecode.com/svn/trunk/css3-mediaqueries.js"></script>
	<![endif]-->

	<link rel="shortcut icon" href="//media.gadventures.com/media-server/static/images/favicon.ico" />
	<link rel="stylesheet" href="css/style-responsive.css">

<body>	
<header></header>
<div id="main">
 	<div id="sign-in">
		<div id="gnation"></div>
		<c:if test="${not empty errorMessage}">				
			<p class="notification">${errorMessage}</p>
		</c:if>
		<form action="Login" method="post">
			<div class="form-element">
				<label for="id_username">username</label>
				<input id="id_username" name="id_username" type="text"></input>
			</div>
			<div class="form-element">
				<label for="id_password">password</label>
				<input id="id_password" name="id_password" type="password"></input>
			</div>
			<!--
			<div class="form-element extra-style">
				<input id="id_remeber_me" name="id_remeber_me" type="checkbox"></input>
				<label  class="rm" for="id_remeber_me">remember me forever</label>
			</div>
			-->
			<button id="id_sumbit" type="submit" value="submit">sign in</button>
		</form>
	</div>      
	<div id="g-img">
		<img src="images/todd_640.jpg">
	</div>
</div>
<footer></footer>
</body>
</html>