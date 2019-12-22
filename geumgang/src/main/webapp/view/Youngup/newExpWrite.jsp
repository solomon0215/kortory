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
</head>
<body>
<div class="w3-container">
	<div class="w3-container w3-center">
		<h2>아래의 정보를 확인하고 방문 일정을 등록하세요</h2>
		<p>방문 일정을 등록하시면 업체의 이메일로 일정이 정해졌음을 전달합니다.</p>
		${detail.companyRegNum}
	</div>
	<form:form mthod="POST" commandName="explorNewWriteCommand">
		<input type="text" disabled="disabled" value="${detail.companyRegNum}">
		<input type="text" disabled="disabled" value="${detail.companyName}">
		<input type="text" disabled="disabled" value="${detail.companyAddr}">
		<input type="text" disabled="disabled" value="${detail.companyPh}">
		<input type="text" disabled="disabled" value="${detail.companyType}">
		<input type="text" disabled="disabled" value="${detail.companyEmail}">
		<form:input path="explorationNum" value="${detail.explorationNum}" disabled="disabled"/>
		<form:input path="companyId" value="${detail.companyId}" disabled="disabled"/>
		<input type="date" name="explorationSchedule">
		<form:input path="youngUpNum" value="${detail.youngUpNum}" disabled="disabled"/>
		<button class="w3-button w3-white w3-border w3-hover-amber" type="submit">방문 일정 등록 하기</button>
	</form:form>
</div>
</body>
</html>