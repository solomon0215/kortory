<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<style>
.menu a{cursor:pointer;}
.menu .hide{display:none;}
</style>
<html>
<head>
<meta charset="UTF-8">
<title>관리부 메인</title>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript" src="js/jquery.form.js"></script>
<script type="text/javascript">
// html dom 이 다 로딩된 후 실행된다.
$(document).ready(function(){
    // menu 클래스 바로 하위에 있는 a 태그를 클릭했을때
    $(".menu>a").click(function(){
        var submenu = $(this).next("ul");

        // submenu 가 화면상에 보일때는 위로 보드랍게 접고 아니면 아래로 보드랍게 펼치기
        if( submenu.is(":visible") ){
            submenu.slideUp();
        }else{
            submenu.slideDown();
        }
    });
});
</script>

</head>
<body>
<div class="w3-bar w3-teal")>
  <a href="aaaa" class="w3-bar-item w3-button">메인으로</a>
  <a href="#" class="w3-bar-item w3-button">인사부</a>
  <a href="#" class="w3-bar-item w3-button">영업부</a>
  <a href="#" class="w3-bar-item w3-button">기획부</a>
    <a href="logout" class="w3-bar-item w3-button">로그아웃</a>
</div>
<div class="w3-row">
<!-- Sidebar -->
<div class="w3-sidebar w3-sand w3-bar-block" style="width:15%">
    <h2 class="w3-bar-item">관리부 메뉴</h2>
	<div>
	    <ul>
	        <li class="menu">
	             <a href="#tabContent01" style="text-decoration:none" ><h3>협력업체 관련 업무</h3></a>
	            <ul class="hide">
	                <li><a href="http://localhost:8080/geumgang/gwanri/agreementConditionList">협약조건안 목록</a></li>
	                <li>협약조건보고서 목록</li>
	                <li>계약 위반처리</li>
	                <li>협력업체계약서 목록</li>
	            </ul>
	        </li> 
	        <li class="menu">
	            <a href="#tabContent02" style="text-decoration:none" ><h3>기획안 관련 업무</h3></a>
	            <ul class="hide">
	                <li><a href="http://localhost:8080/geumgang/gwanri/budgetBillList">예산안보고서 목록</a></li>
	            </ul>
	        </li>
	         <li class="menu">
	             <a href="#tabContent03" style="text-decoration:none"  ><h3>정산 관련 업무</h3></a>
	            <ul class="hide">
	                <li>정산</li>
	            </ul>
	        </li>
	         <li class="menu">
	             <a href="#tabContent04" style="text-decoration:none" ><h3>영수처리 관련업무</h3></a>
	            <ul class="hide">
	                <li>신청서 목록</li>
	            </ul>
	        </li>
	         <li class="menu">
	             <a href="#tabContent05" style="text-decoration:none" ><h3>세금 관련 업무</h3></a>
	            <ul class="hide">
	                <li>세금 신고서 목록
	            </ul>
	        </li>
	    </ul>
	</div>
</div>
<div class="w3-container" style="margin-left:15%">
	<jsp:include page="${pageName}"></jsp:include>
</div>

</div>

</body>
</html>