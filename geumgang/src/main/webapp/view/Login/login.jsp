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
	$("#user").click(function(){
		$.ajax({
			type: "POST", //보내는 방식
			url : "userLogin", //요청하는  url
			datatype : "html", //받아오는 타임 
			success : function(data1){ //성공시
				$("#logFrm").html(data1);
			}
		});
	});
	$("#guide").click(function(){
		$.ajax({
			type:"POST",
			url : "guideLogin",
			datatype : "html",
			success : function(data1){
				$("#logFrm").html(data1);
			}
		});
	});
	$("#company").click(function(){
		$.ajax({
			type:"POST",
			url : "companyLogin",
			datatype : "html",
			success : function(data1){
				$("#logFrm").html(data1);
			}
		});
	});
	
});
</script>
</head>
<body>
	<div class="w3-container" style="margin: 0px auto; width:80%;">
		<div id="logFrm" class="w3-margin">
			<div class="w3-center w3-margin">
				<div class="w3-margin">
					<span class="w3-tag w3-xxlarge w3-padding w3-green w3-round-small" style="transform:rotate(-2deg)">
				 		What Kind of Login? :)
					</span>	
				</div>
				<div >
					&nbsp;&nbsp;&nbsp;<span class="w3-tag w3-xxlarge w3-padding w3-indigo w3-round-small" style="transform:rotate(+5deg)">
					Please Select Button :3
					</span>
				</div>
				<br>
				<br>
			</div>
		</div>
		<div class="w3-center w3-margin">
		<button class="w3-button w3-white w3-border w3-border-yellow" id="user">일반회원 로그인</button>
		<button class="w3-button w3-white w3-border w3-border-red" id="guide">가이드 로그인</button>
		<button class="w3-button w3-white w3-border w3-border-blue" id="company">업체 로그인</button>
		</div>
	</div>
</body>
</html>