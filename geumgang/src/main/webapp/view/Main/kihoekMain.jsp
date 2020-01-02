<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>kihoekMain</title>
<script>
//
function conceptProject() {
	  var x = document.getElementById("projectItem");
	  if (x.className.indexOf("w3-show") == -1) {
	    x.className += " w3-show";
	  } else {
	    x.className = x.className.replace(" w3-show", "");
	  }
	}
//
function companySelect() {
  var x = document.getElementById("selectItem");
  if (x.className.indexOf("w3-show") == -1) {
    x.className += " w3-show";
  } else {
    x.className = x.className.replace(" w3-show", "");
  }
}

//
function eventCheck() {
	  var x = document.getElementById("checkItem");
	  if (x.className.indexOf("w3-show") == -1) {
	    x.className += " w3-show";
	  } else {
	    x.className = x.className.replace(" w3-show", "");
	  }
	}
	
//
function eventProduct() {
	  var x = document.getElementById("productItem");
	  if (x.className.indexOf("w3-show") == -1) {
	    x.className += " w3-show";
	  } else {
	    x.className = x.className.replace(" w3-show", "");
	  }
	}
	
//
function reportConfirm() {
	  var x = document.getElementById("confirmItem");
	  if (x.className.indexOf("w3-show") == -1) {
	    x.className += " w3-show";
	  } else {
	    x.className = x.className.replace(" w3-show", "");
	  }
	}

</script>
<style>
body, h1,h2,h3,h4,h5 {font-family: "Raleway", sans-serif}
.navbar {
  z-index:99;
  position: fixed;
}
.navbar a {
  color: white;
  text-align: center;
  padding: 24px 24px;
  text-decoration: none;
}

.active {
  background-color: #005580;
}
.left {padding-left:40px; padding-top:30px; overflow:hidden; height:auto;}
.left1 {padding-top:30px; }
a {text-decoration: none; !important}
</style>
</head>
<body>
<div class="navbar">
<div class="w3-top w3-bar w3-red w3-card">
  <div class="active">
  <a class="w3-bar-item w3-button w3-hover-sand" href="../main">KORTORY</a></div>
  <a class="w3-bar-item w3-button w3-hover-sand" href="../kihoek/main">MAIN</a>
  <a class="w3-bar-item w3-button w3-hover-sand" href="conceptForm">CONCEPT</a>
  <a class="w3-bar-item w3-button w3-hover-sand" href="eventForm">EVENT</a>
</div>
</div>
<div style="background-color:#white;">
<nav class="w3-sidebar w3-bar-block w3-white w3-animate-left w3-text-blue-gray w3-collapse w3-card" style="width:320px;font-weight:bold" id="mySidebar"><br>
	<div class="left1">
	<a class="w3-center w3-text-deep-orange w3-padding" href="../kihoek/main"><h3><b>KI -<br>HOEK</b></h3></a>
	</div>
	<div class="left ">
		<a onclick="conceptProject()" href="javascript:void(0)" class="w3-bar-item w3-button" id="conceptBtn">
		컨셉 기획서 <i class="fa fa-caret-down"></i>
		</a>
		<div id="projectItem" class="w3-bar-block w3-hide w3-padding w3-text-deep-orange ">
			<a href="conceptForm" class="w3-bar-item w3-button"><i class="fa fa-caret-right w3-margin-right"></i>컨셉 기획서 등록</a>
			<a href="conceptList" class="w3-bar-item w3-button"><i class="fa fa-caret-right w3-margin-right"></i>컨셉 기획서 목록</a>
    	</div>
		
		<a onclick="companySelect()" href="javascript:void(0)" class="w3-bar-item w3-button" id="selectBtn">
		행사 업체 선정 <i class="fa fa-caret-down"></i>
		</a>
		<div id="selectItem" class="w3-bar-block w3-hide w3-padding w3-text-deep-orange ">
			<a href="tourPlaceSelect" class="w3-bar-item w3-button"><i class="fa fa-caret-right w3-margin-right"></i>관광지 업체 선정</a>
			<a href="#" class="w3-bar-item w3-button"><i class="fa fa-caret-right w3-margin-right"></i>숙소 업체 선정</a>
			<a href="#" class="w3-bar-item w3-button"><i class="fa fa-caret-right w3-margin-right"></i>이동수단 업체 선정</a>
    	</div>
    	
    	<a onclick="eventCheck()" href="javascript:void(0)" class="w3-bar-item w3-button" id="checkBtn">
		행사 준비 확인 <i class="fa fa-caret-down"></i>
		</a>
		<div id="checkItem" class="w3-bar-block w3-hide w3-padding w3-text-deep-orange ">
			<a href="#" class="w3-bar-item w3-button"><i class="fa fa-caret-right w3-margin-right"></i>행사 업체 일정 확인</a>
			<a href="#" class="w3-bar-item w3-button"><i class="fa fa-caret-right w3-margin-right"></i>가이드 배치 보고서 확인</a>
			<a href="#" class="w3-bar-item w3-button"><i class="fa fa-caret-right w3-margin-right"></i>예산안 보고서 확인</a>
    	</div>
    	
    	<a onclick="eventProduct()" href="javascript:void(0)" class="w3-bar-item w3-button" id="productBtn">
		행사 상품<i class="fa fa-caret-down"></i>
		</a>
		<div id="productItem" class="w3-bar-block w3-hide w3-padding w3-text-deep-orange ">
			<a href="eventForm" class="w3-bar-item w3-button"><i class="fa fa-caret-right w3-margin-right"></i>행사 상품 등록</a>
			<a href="#" class="w3-bar-item w3-button"><i class="fa fa-caret-right w3-margin-right"></i>행사 상품 목록</a>
    	</div>
    	
    	<a onclick="reportConfirm()" href="javascript:void(0)" class="w3-bar-item w3-button" id="confirmBtn">
		보고서 검토<i class="fa fa-caret-down"></i>
		</a>
		<div id="confirmItem" class="w3-bar-block w3-hide w3-padding w3-text-deep-orange ">
			<a href="#" class="w3-bar-item w3-button"><i class="fa fa-caret-right w3-margin-right"></i>개선점 보고서 검토</a>
			<a href="#" class="w3-bar-item w3-button"><i class="fa fa-caret-right w3-margin-right"></i>개선 결과 보고서 검토</a>
    	</div>
	</div>
	</nav>
<!-- PAGE CONTENT -->
<div class="main">
	<div class="w3-container" style="padding-left:340px; padding-top:60px; width:100%;">
		<jsp:include page="${pageName}"></jsp:include>
	</div>
</div>
</div>
</body>
</html>