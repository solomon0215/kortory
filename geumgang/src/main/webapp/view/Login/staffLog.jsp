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
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<title>Insert title here</title>
</head>
<body>
<div class="w3-container w3-white">
	<div class="w3-bar w3-sand">
	  <a href="#" class="w3-bar-item w3-button">Home</a>
	  <a href="#" class="w3-bar-item w3-button"></a>
	  <a href="#" class="w3-bar-item w3-button">Link 2</a>
	  <a href="staff/login" class="w3-bar-item w3-button">직원 로그인</a>
	</div>
</div>
<div class="w3-container">
	<form:form class="w3-ontainer w3-card-4 w3-light-grey" action="gwanriJoinAction" commandName="gwanriLogCommand">
	  	<h2>관리부 로그인</h2> 
	  	<p><label>아이디</label>
	  	<form:input path="gwanRiId" class="w3-input w3-border"/></p>
		
	  	<p><label>비밀번호</label>
	  	<form:input class="w3-input w3-border" path="gwanRiPw" type="text"/></p>
	  	<input type="submit" value="로그인">
	</form:form>

	<form:form class="w3-container w3-card-4 w3-light-grey" commandName="insaLogCommand">
	  	<h2>인사부</h2>
	  	<p><label>아이디</label>
	  	<form:input path="inSaId" class="w3-input w3-border"/></p>
	
	  	<p><label>비밀번호</label>
	  	<form:input class="w3-input w3-border" path="inSaPw" /></p>
	  	<input type="submit" value="로그인">
	</form:form>
</div>

</body>
</html>