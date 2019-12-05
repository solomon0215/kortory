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
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>
	<!-- 업체등록 신청서 작성 페이지 -->
	<div class="w3-container w3-display-middle">
		<form:form class="w3-container w3-card-4 w3-light-grey w3-text-blue w3-margin" commandName="companyFormCommand">
		<h2 class="w3-center">업체등록 신청서</h2>
		 
		<div class="w3-row w3-section">
		    <div class="w3-rest">
		      <form:input path="" class="w3-input w3-border"  placeholder="First Name"/>
		    </div>
		</div>
		<button class="w3-button w3-block w3-section w3-blue w3-ripple w3-padding">Send</button>
		</form:form>		
	</div>
</body>
</html>