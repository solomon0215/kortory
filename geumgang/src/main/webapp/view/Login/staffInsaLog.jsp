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
	<!-- 인사부 -->
	<form:form class="w3-container w3-border w3-border-light-blue w3-margin w3-padding-16" action="inLogPro" method="post" commandName="insaLogCommand">
	  	<h2>인사부 로그인</h2>
	  	<label>아이디</label> 
	  	<div class="w3-center">
	  	  	<form:input path="inSaId" class="w3-input"/>
	  	  	<form:errors path="inSaId" class="w3-text-light-blue"/>
		</div>
		<label>비밀번호</label>
		<div class="w3-center">
			<form:password path="inSaPw" class="w3-input"/>
			<form:errors path="inSaPw" class="w3-text-light-blue"/>
		</div>  
		<br>
		<br>	
	  	<button class="w3-button w3-white w3-border w3-hover-light-blue" type="submit" >LOGIN</button>
	</form:form>
</body>
</html>