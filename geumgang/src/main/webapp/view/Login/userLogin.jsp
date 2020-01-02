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
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript">
$(function(){
	$("#userSubmit").onclick(function(){
		$("#userFrm").submit();
	});
});
</script>
</head>
<body>
		<!-- 회원 로그인 -->
		<form:form class="w3-container w3-border w3-border-yellow w3-margin w3-padding-16"  method="post"
		action="userLoginPro" id="userFrm" commandName="userLogCommand">
		  	<h2>회원 로그인</h2>
		  	<label>아이디</label> 
		  	<div class="w3-center">
		  	  	<form:input path="userId" class="w3-input"/>
		  	  	<form:errors path="userId" class="w3-text-red"/>
			</div>
			<label>비밀번호</label>
			<div class="w3-center">
				<form:password path="userPw" class="w3-input"/>
				<form:errors path="userPw" class="w3-text-red"/>
			</div>  	
			<br>
		  	<button class="w3-button w3-white w3-border w3-border-yellow" id="userSubmit">로그인</button>
		</form:form>
		<div class="w3-margin w3-center">
			<span class="w3-tag w3-xlarge w3-padding w3-pale-yellow w3-round-small" style="transform:rotate(+2deg)">
		 		<a href="userForm" >Do you want to Join Member?</a>
			</span>	
		</div>
</body>
</html>