<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리부 메인</title>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lobster">
<link href="https://fonts.googleapis.com/css?family=Single+Day&display=swap" rel="stylesheet">
</head>
<style>
.w3-lobster {
  font-family: "Lobster", serif;
}
.w3-myfont {
  font-family: 'Single Day', cursive;
}
</style>
<body>
<div class="w3-container w3-center" style="background-color: #ffffb3;">
	<div class="w3-bar w3-xlarge" style="background-color: #ffffb4;">
	  	<a href="http://localhost:8080/geumgang/youngup/main" class="w3-bar-item w3-button w3-margin-left w3-margin-right">Main</a>
		<a href="http://localhost:8080/geumgang/youngup/main" class="w3-bar-item w3-button w3-margin-left w3-margin-right">Tour List</a>
		<a href="http://localhost:8080/geumgang/youngup/myPage" class="w3-bar-item w3-button w3-margin-left w3-margin-right">MyPage</a>
		<a href="http://localhost:8080/geumgang/youngup/myWork" class="w3-bar-item w3-button w3-margin-left w3-margin-right">Working Page</a>
	</div>
</div>
<div class="w3-row">
	<!-- Sidebar -->
	<div class="w3-sidebar w3-bar-block w3-myfont w3-col w3-padding-small" style="width: 20%; background-color: #e6f7ff;">
	    <p class="w3-bar-item w3-xlarge ">영업부 업무 메뉴</p>
		<div>
		    <ul>
		         <li class="menu">
		             <a href="#tabContent01" style="text-decoration:none" class="w3-large">업체 영업 업무</a>
		            <ul>
		                <li><a href="http://localhost:8080/geumgang/youngup/newcompany" style="text-decoration:none">신규업체</a></li>
		                <li><a href="http://localhost:8080/geumgang/youngup/explorList" style="text-decoration:none">사전답사 보고서</a></li>
		            </ul>
		        </li>
		        <br/>
		         <li class="menu">
		             <a href="#tabContent02" style="text-decoration:none" class="w3-large">업체 평가 업무</a>
		            <ul >
		                <li>가이드 설문조사 양식</li>
		                <li>업체 평가 집계 보고서</li>
		                <li>협력업체 개선안</li>
		            </ul>
		        </li>
		        <br/>
		         <li class="menu">
		             <a href="#tabContent03" style="text-decoration:none" class="w3-large">위반사항 처리 업무</a>
		            <ul >
		              	 <li>신규 계약위반 제보 목록</li>
		              	 <li>계약 위반건 목록</li>
		            </ul>
		        </li>
		        <br/>
		        <li class="menu">
		             <a href="#tabContent04" style="text-decoration:none" class="w3-large">문의 대화</a>
		            <ul >
		                 <li>고객의 문의 대화</li>
		                 <li>가이드의 문의 대화</li>
		            </ul>
		        </li>
		        <br>
		        <li class="menu">
		             <a href="http://localhost:8080/geumgang/youngup/expSchedule" style="text-decoration:none" class="w3-large">사전답사 일정 확인하러 가기!</a>
		        </li>
		    </ul>
		</div>
	</div>
	<div class="w3-container w3-display-middle" style="padding-left: 20%;padding-top: 5 %; width:100%; height:100%; ">
		<jsp:include page="${pageName}"></jsp:include>
	</div>	
</div>

</body>
</html>