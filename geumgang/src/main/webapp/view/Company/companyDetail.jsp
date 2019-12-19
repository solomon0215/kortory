<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<dvi class =" w3-container">
		<center><h2>업체 정보</h2></center><br/>			
<form:form name ="frm" id ="frm" method = "post" 
	commandName = "" action ="">
<table border = 1  width = 600 align = "center" cellpadding = 3 >
	<tr><td>업체 아이디</td>
		<td >${command.companyId }</td></tr>
	<tr><td>사업자 번호<spring:message code="" /></td>
		<td >&nbsp;</td></tr>		 
	<tr><td>업체 이름<spring:message code="" /></td>
		<td >&nbsp;</td></tr>
	<tr><td>업체 주소<spring:message code="" /></td>
		<td >&nbsp;</td></tr>
	<tr><td>업체 연략처<spring:message code="" /></td>
		<td >&nbsp;</td></tr>
	<tr><td>업체 전자메일 주소<spring:message code="" /></td>
		<td >&nbsp;</td></tr>
	<tr><td>공기업 여부<spring:message code="" /></td>
		<td >&nbsp;</td></tr>
</table>
<br />
  <div class="w3-container" align="center">
   <a href="#" class="w3-btn w3-blue">수정</a>
    <a href="#" class="w3-btn w3-blue">삭제</a>
</div>
</form:form>
</html>