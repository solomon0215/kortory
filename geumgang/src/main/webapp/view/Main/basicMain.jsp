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
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>Insert title here</title>
<style>

.header {
  background-color: #ffffff;
  text-align: center;
  padding: 20px;
}

</style>
</head>
<body>
<!-- Header -->
<header class="w3-margin-top ">
<div class="header">
<br>
  <h1 class="w3-jumbo">
  <b style="color:red">K</b>
  <b style="color:gold">O</b>
  <b style="color:green">R</b>
  <b style="color:indigo">T</b>
  <b style="color:amber">O</b>
  <b style="color:orange">R</b>
  <b style="color:lime">Y</b></h1>
  <b>"역사와 함께 떠나는 여행"</b>
</div>
<div class="menubar" style="margin-bottom:3%;">
	<div class="w3-bar w3-black w3-text-center">
	  <a href="http://localhost:8080/geumgang/main"  class="w3-bar-item w3-button fa fa-home w3-hover-red" 
	  style="width:20%">&nbsp; HOME</a>
	  <a href="http://localhost:8080/geumgang/intro" class="w3-bar-item w3-button fa fa-info w3-hover-lime" 
	  style="width:20%">&nbsp; 회사소개</a>
	  <a href="http://localhost:8080/geumgang/event/list" class="w3-bar-item w3-button fa fa-plane w3-hover-yellow" 
	  style="width:20%">&nbsp; 행사상품</a>
	  <a href="http://localhost:8080/geumgang/user/login" class="w3-bar-item w3-button fa fa-handshake-o w3-hover-cyan" 
	  style="width:20%">&nbsp; 회원로그인</a>
	  <a href="http://localhost:8080/geumgang/staff/login" class="w3-bar-item w3-button fa fa-user-circle-o w3-hover-orange" 
	  style="width:20%">&nbsp; 직원 로그인</a>
	</div>
</div>	
</header>
	<div class="bgimg-1 w3-container" id="include" style="max-height:40%;width:80%;margin: 0px auto;">
	  	<jsp:include page="${pageName}" />
	</div>
</body>
</html>