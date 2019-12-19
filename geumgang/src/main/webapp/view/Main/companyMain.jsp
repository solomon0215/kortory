<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<style>
.w3-lobster {font-family: 'Do Hyeon', sans-serif;
}
.w3-myfont {font-family: 'Noto Sans KR', sans-serif;
}

</style>
<html>
<head>
<meta charset="UTF-8">
<title>업체 메인페이지</title>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link href="https://fonts.googleapis.com/css?family=Do+Hyeon|Noto+Sans+KR&display=swap" rel="stylesheet">

<script src="https://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript" src="js/jquery.form.js"></script>
</head>
<body>

<div class="w3-bar w3-indigo">
<div class="w3-container w3-lobster w3-xlarge">
  <a href="aaaa" class="w3-bar-item w3-button">메인으로</a>
  <a href="http://localhost:8080/geumgang/company/info" class="w3-bar-item w3-button">마이페이지</a>
  <a href="logout"  class="w3-bar-item w3-button w3-right">로그아웃</a>
</div>
</div>
<div class="w3-row">
<!-- Sidebar -->
<div class="w3-sidebar w3-light-grey w3-bar-block" style="width:15%">
<div class="w3-container w3-myfont w3-large"><br/>
   <div class="w3-bar-item w3-xxlarge">업체 메뉴</div>
	<div>
	    <ul>
	        <li class="menu">
	             <a href="#" style="text-decoration:none" >협력업체 관련 업무</a>
	            <ul>
	                <li><a href="#" style="text-decoration:none">협약조건안 목록</a></li>
	                <li>협약조건보고서 목록</li>
	                <li><a href="#" style="text-decoration:none">계약 위반처리</a></li>
	                <li>협력업체계약서 목록</li>
	            </ul>
	        </li> 
	        
	</div>
</div>
</div>
<div class="w3-container w3-myfont w3-large" style="margin-left:15%">
	<jsp:include page="${pageName}"></jsp:include>
</div>


</div>

</body>
</html>