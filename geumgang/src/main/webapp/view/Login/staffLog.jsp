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
<div class="w3-container" style="margin: 0px auto; width:80%;" >
	<div id="staff" class="w3-margin">
		<div class="w3-center w3-margin">
			<div class="w3-margin">
				<span class="w3-tag w3-xxlarge w3-padding w3-pink w3-round-small" style="transform:rotate(-2deg)">
			 		오늘도 열심히 일해라 노예들아
				</span>	
			</div>
			<div >
				&nbsp;&nbsp;&nbsp;<span class="w3-tag w3-xxlarge w3-padding w3-deep-purple w3-round-small" style="transform:rotate(+5deg)">
				자기 부서도 모르는건 아니지?
				</span>
			</div>
			<br>
			<br>
		</div>
	</div>
	<div class="w3-panel w3-center w3-margin"> 
		<button class="w3-button w3-hover-green w3-border w3-white w3-border-green" id="gwan">관리부 로그인</button>
		<button class="w3-button w3-hover-amber w3-border w3-white w3-border-amber" id="young">영업부 로그인</button>
		<button class="w3-button w3-hover-light-blue w3-border w3-white w3-border-light-blue" id="in">인사부 로그인</button>
		<button class="w3-button w3-hover-red w3-border w3-white w3-border-red" id="ki">기획부 로그인</button>
	</div>
</div>
</body>
</html>