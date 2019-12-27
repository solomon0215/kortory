<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<title>Insert title here</title>
</head>
<body>
<form:form class="w3-table w3-bordered" commandName="resumeInsertCommand" id="frm" action="resumeInsert3" method="POST" >
<tr>
	<td class="w3-border-right w3-light-gray" style="width: 15%" >성장과정</td>
	<td class="w3-row-padding">
	   <form:textarea path="grow" class="w3-input w3-border" cols="50" rows="5"/></td>	
</tr>	
<tr>
	<td class="w3-border-right w3-light-gray" style="width: 15%" >장점</td>
	<td class="w3-row-padding">
	   <form:textarea path="grow" class="w3-input w3-border" cols="50" rows="5"/></td>	
</tr>
<tr>
	<td class="w3-border-right w3-light-gray" style="width: 15%" >단점</td>
	<td class="w3-row-padding">
	   <form:textarea path="grow" class="w3-input w3-border" cols="50" rows="5"/></td>	
</tr>
<br />
		<div class="w3-center">
			<div class="w3-bar">
			    <button class="w3-button w3-teal" id="save">저장</button>
			</div>
		</div>
</form:form>		
</body>
</html>