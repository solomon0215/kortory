<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<script type="text/javascript" 
	src="http://code.jquery.com/jquery-latest.js" ></script>
<script type="text/javascript" >

</script>	
</head>
<body>
<dvi class =" w3-container">
		<center><h2>예산안 보고서 상세내역</h2></center><br/>
			
<form:form name ="frm" id ="frm" method = "post" 
	commandName = "memberCommand" action ="memberModifyPro">
<table border = 1  width = 600 align = "center" cellpadding = 3 >
		<tr><td >번호<spring:message code="userId.userPw" /></td>
		<td >&nbsp;</td></tr>
	<tr><td>총 예산금액<spring:message code="userModify" /></td>
		<td >&nbsp;</td></tr>
		 
	<tr><td>인건비 비율<spring:message code="password" /></td>
		<td >&nbsp;</td></tr>
		 
	
	<tr><td >인건비 금액<spring:message code="defaultInfo" /></td>
	<td >&nbsp;</td></tr>
		 
	<tr><td>희망상품 금액<spring:message code="name" /></td>
		<td >&nbsp;</td></tr>
		 

	<tr><td>작성일<spring:message code="birth.gender" /></td>
		<td >&nbsp;</td></tr>
</table>
<br />
  <div class="w3-container" align="center">
   <a href="#" class="w3-btn w3-blue">수정</a>
    <a href="#" class="w3-btn w3-blue">삭제</a>
</div>
</form:form>
</dvi>
</body>
</html>