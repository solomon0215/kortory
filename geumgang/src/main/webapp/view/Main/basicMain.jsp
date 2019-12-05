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

<div class="w3-container w3-white">
	<div class="w3-bar w3-sand">
	  <a href="main" class="w3-bar-item w3-button">Home</a>
	  <a href="intro" class="w3-bar-item w3-button">회사소개</a>
	  <a href="event/list" class="w3-bar-item w3-button">행사상품</a>
	  <a href="user/login" class="w3-bar-item w3-button">회원로그인</a>
	  <a href="staff/login" class="w3-bar-item w3-button">직원 로그인</a>
	</div>
</div>

<div class="w3-containerr">
  	<jsp:include page="${pageName}"/>
</div>
</body>
</html>