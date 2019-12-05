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
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript" src="js/jquery.form.js"></script>
<script type="text/javascript">
$(function(){
	$("#user").click(function(){
		$.ajax({
			type: "POST",
			url : "userLogin",
			datatype : "html",
			success : function(data1){
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
	<div class="w3-container w3-half w3-display-middle w3-margin">
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
		<div class="w3-center">
		<button class="w3-button w3-white w3-border w3-border-yellow" id="user">일반회원 로그인</button>
		<button class="w3-button w3-white w3-border w3-border-red" id="guide">가이드 로그인</button>
		<button class="w3-button w3-white w3-border w3-border-blue" id="company">업체 로그인</button>
		</div>
	</div>
</body>
</html>