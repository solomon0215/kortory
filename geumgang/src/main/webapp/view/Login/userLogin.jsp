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
	<div class="w3-container w3-half">
		<form:form class="w3-ontainer w3-card-4 w3-light-grey" commandName="userLogCommnand">
		  	<h2>회원 로그인</h2> 
		  	<p><label>아이디</label>
		  	<form:input path="userId" class="w3-input w3-border"/></p>
		
		  	<p><label>비밀번호</label>
		  	<form:input  path="userPw" class="w3-input w3-border" type="text"/></p>
		</form:form>
	</div>
</body>
</html>