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
ul {
z-index:99;
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: red;
  position: fixed;
  top: 0;
  width: 100%;
}

li {
  float: left;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover:not(.active) {
  background-color: red;
}

.active {
  background-color: #005580;
}
.left {padding-left:40px; overflow:hidden; height:auto;}
</style>
</head>
<body class="w3-white w3-content" style="max-width:1600px">
<ul>
  <li class="active">
  <a href="#home">Home</a></li>
  <li><a href="../kihoek/main">News</a></li>
  <li><a href="#">Contact</a></li>
  <li><a href="#about">About</a></li>
  
</ul>
<div style="background-color:#white;">
<nav class="w3-sidebar w3-bar-block w3-white w3-animate-left w3-text-blue-gray w3-collapse w3-card" style="width:320px;font-weight:bold" id="mySidebar"><br>
	<h3 class="w3-padding-48 w3-center w3-text-deep-orange"><b>KI -<br>HOEK</b></h3>
	<div class="left">
		<a onclick="conceptProject()" href="javascript:void(0)" class="w3-bar-item w3-button" id="conceptBtn">
		컨셉 기획서 <i class="fa fa-caret-down"></i>
		</a>
		<div id="projectItem" class="w3-bar-block w3-hide w3-padding w3-text-deep-orange ">
			<a href="conceptForm" class="w3-bar-item w3-button"><i class="fa fa-caret-right w3-margin-right"></i>컨셉 기획서 등록</a>
			<a href="#" class="w3-bar-item w3-button"><i class="fa fa-caret-right w3-margin-right"></i>컨셉 기획서 목록</a>
    	</div>
		
		<a onclick="companySelect()" href="javascript:void(0)" class="w3-bar-item w3-button" id="selectBtn">
		행사 업체 선정 <i class="fa fa-caret-down"></i>
		</a>
		<div id="selectItem" class="w3-bar-block w3-hide w3-padding w3-text-deep-orange ">
			<a href="#" class="w3-bar-item w3-button"><i class="fa fa-caret-right w3-margin-right"></i>관광지 업체 선정</a>
			<a href="#" class="w3-bar-item w3-button"><i class="fa fa-caret-right w3-margin-right"></i>숙소 업체 선정</a>
			<a href="#" class="w3-bar-item w3-button"><i class="fa fa-caret-right w3-margin-right"></i>이동수단 업체 선정</a>
    	</div>
    	
    	<a onclick="eventCheck()" href="javascript:void(0)" class="w3-bar-item w3-button" id="checkBtn">
		행사 준비 확인 <i class="fa fa-caret-down"></i>
		</a>
		<div id="checkItem" class="w3-bar-block w3-hide w3-padding w3-text-deep-orange ">
			<a href="#" class="w3-bar-item w3-button"><i class="fa fa-caret-right w3-margin-right"></i>가이드 배치 보고서 확인</a>
			<a href="#" class="w3-bar-item w3-button"><i class="fa fa-caret-right w3-margin-right"></i>예산안 보고서 확인</a>
    	</div>
    	
    	<a onclick="eventProduct()" href="javascript:void(0)" class="w3-bar-item w3-button" id="productBtn">
		행사 상품<i class="fa fa-caret-down"></i>
		</a>
		<div id="productItem" class="w3-bar-block w3-hide w3-padding w3-text-deep-orange ">
			<a href="#" class="w3-bar-item w3-button"><i class="fa fa-caret-right w3-margin-right"></i>행사 상품 등록</a>
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
<div class="content" style="margin-top:12px;">
	<div class="w3-container w3-display-middle" style="padding-left:340px; padding-top:150px;width:100%;">
		<jsp:include page="${pageName}"></jsp:include>
	</div>
</div>
</div>
</body>
</html>
