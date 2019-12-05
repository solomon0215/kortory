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
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript" src="js/jquery.form.js"></script>
<script type="text/javascript">
$(function(){
	$("#gwan").click(function(){
		$.ajax({
			type:"POST",
			url : "gwanLog",
			datatype : "html",
			success : function(data1){
				$("#staff").html(data1);
			}
		});
	});
	$("#young").click(function(){
		$.ajax({
			type:"POST",
			url : "youngLog",
			datatype : "html",
			success : function(data1){
				$("#staff").html(data1);
			}
		});
	});
	$("#in").click(function(){
		$.ajax({
			type:"POST",
			url : "inLog",
			datatype : "html",
			success : function(data1){
				$("#staff").html(data1);
			}
		});
	});
	$("#ki").click(function(){
		$.ajax({
			type:"POST",
			url : "kiLog",
			datatype : "html",
			success : function(data1){
				$("#staff").html(data1);
			}
		});
	});
});
</script>
</head>
<body>
<div class="w3-container w3-half w3-display-middle" >
	<div class="w3-center w3-margin"> 
		<button class="w3-button w3-white w3-border w3-border-yellow" id="gwan">관리부 로그인</button>
		<button class="w3-button w3-white w3-border w3-border-red" id="young">영업부 로그인</button>
		<button class="w3-button w3-white w3-border w3-border-blue" id="in">인사부 로그인</button>
		<button class="w3-button w3-white w3-border w3-border-black" id="ki">기획부 로그인</button>
	</div>
	<div id="staff" class="w3-margin"></div>
</div>
</body>
</html>