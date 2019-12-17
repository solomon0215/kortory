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
<div class="w3-bar w3-yellow w3-lobster w3-xlarge w3-text-middle">
  <a href="#" class="w3-bar-item w3-button">Home</a>
  <a href="#" class="w3-bar-item w3-button">Link 1</a>
  <a href="#" class="w3-bar-item w3-button">Link 2</a>
  <a href="#" class="w3-bar-item w3-button">Link 3</a>
</div>
<div class="w3-row">
	<!-- Sidebar -->
	<div class="w3-sidebar w3-dark-gray w3-bar-block w3-myfont w3-col w3-padding-small" style="width: 20%;">
	    <p class="w3-bar-item w3-xlarge ">영업부 업무 메뉴</p>
		<div>
		    <ul>
		         <li class="menu">
		             <a href="#tabContent01" style="text-decoration:none" class="w3-large">업체 영업 업무</a>
		            <ul>
		                <li>신규업체</li>
		                <li><a href="explorList" style="text-decoration:none">사전답사 보고서</a></li>
		                <li>협력 조건안</li>
		                <li>업체 계약서</li>
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
		    </ul>
		</div>
	</div>
	<div class="w3-container w3-display-middle" style="padding-left: 20%; width:100%;">
		<jsp:include page="${pageName}"></jsp:include>
	</div>	
</div>

</body>
</html>