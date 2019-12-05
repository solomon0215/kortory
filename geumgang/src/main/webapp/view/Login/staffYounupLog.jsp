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
	<!-- 영업부 -->
	<form:form class="w3-ontainer" commandName="youngupLogCommand">
	  	<h2>영업부 로그인</h2>
	  	<label>아이디 Name</label> 
	  	<div class="w3-center">
	  	  	<form:input path="youngUpId" class="w3-input"/></p>
		</div>
		<label>비밀번호</label>
		<div class="w3-center">
			<form:input path="youngUpPw" class="w3-input"/></p>
		</div>  	
	  	<input type="submit" value="로그인">
	</form:form>
</body>
</html>