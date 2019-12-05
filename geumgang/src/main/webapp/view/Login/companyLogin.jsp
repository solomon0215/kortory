<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 업체 로그인 -->
	<form:form class="w3-container w3-border w3-border-blue w3-margin w3-padding-16" commandName="companyLogCommand">
	  	<h2>업체 로그인(Company Login)</h2>
	  	<label>아이디 (ID)</label> 
	  	<div class="w3-center">
	  	  	<form:input path="companyId" class="w3-input"/>
		</div>
		<label>비밀번호 (Password)</label>
		<div class="w3-center">
			<form:input path="companyPw" class="w3-input"/>
		</div>  	
		<br>
	  	<button class="w3-button w3-white w3-border w3-border-blue" id="company">LOGIN</button>
	</form:form>
	<div class="w3-margin w3-center">
		<span class="w3-tag w3-xlarge w3-padding w3-blue w3-round-small" style="transform:rotate(+2deg)">
	 		<a href="user/companyJoin" >Do You Wanna Join Partner?</a>
		</span>	
	</div>
</body>
</html>