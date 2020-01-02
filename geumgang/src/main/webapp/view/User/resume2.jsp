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
<title>이력서 작성 - 2</title>
</head>
<body>
<form:form class="w3-table w3-bordered" commandName="rc" id="frm" action="resumeInsert2" method="POST" >
       <table class="w3-table w3-bordered">
		<tr>
			<td class="w3-border-right w3-light-gray" style="width: 15%">해외거주경험</td>
			<td class="w3-row-padding" colspan="4">
			<form:input path="expOver" class="w3-input w3-border" placeholder="거주경험에 대한 간략한 설명" style="width: 100%" />
			</td>
		</tr>
		<tr>
			<td class="w3-border-right w3-light-gray" style="width: 15%">공인언어시험</td>
			<td class="w3-border-right" colspan="4">
			<form:select class="w3-select w3-border" path="language" style="width: 30%">
					<form:option value="없음" label="시험선택" disabled="selected" />
					<form:option value="TOEIC" label="TOEIC" />
					<form:option value="TOFLE" label="TOFLE" />
					<form:option value="JLPT" label="JLPT" />
					<form:option value="HSK" label="HSK"/>
			</form:select></td>
			
		<td class="w3-border w3-light-gray" style="width: 15%">시험점수</td>
			<td class="w3-row-padding">
			<form:input path="languageGrade" class="w3-input w3-border w3-white" />
			</td>
		</tr>
		<tr>
		<td class="w3-border-right w3-light-gray" style="width: 15%">자격먼허사항</td>
		<td class="w3-row-padding">
		<form:input path="license" class="w3-input w3-border" placeholder="보유자격/면허" style="width: 100%"/>
			</td>
		</tr>
		<tr>
		<td class="w3-border-right w3-light-gray" style="width: 15%" rowspan="3">경력사항</td>
		<td class="w3-row-padding">직장명:
		 <form:input path="formerWork" class="w3-input w3-border" style="width: 50%"/></td>
		<td class="w3-row-padding">직위:
		 <form:input path="position" class="w3-input w3-border" style="width: 35%" /></td>	
		<td class="w3-row-padding">연봉:
		 <form:input path="salary" class="w3-input w3-border" type="text" style="width: 35%"/></td>		
		</tr>
		<tr>
		<td class="w3-row-padding">입사일: </td>
			<td class="w3-row-padding">
			<input type="date" id="formerStart" name="formerStart" class="w3-input w3-border w3-white" />
			</td>
		<td class="w3-row-padding">퇴사일: </td>
			<td class="w3-row-padding">
			<input type="date" id="formerEnd" name="formerEnd" class="w3-input w3-border w3-white" /></td>
		<tr>
			<td class="w3-row-padding">업무내용: </td>
			<td class="w3-row-padding" colspan="4">
			<form:input path="formerTask" class="w3-input w3-border" placeholder="업무내용에 대한 간략한 설명" style="width: 100%"/>
			</td>
		</tr>	
		<tr>
			<td class="w3-row-padding">업무소개 
			<form:textarea path="formerIntro" class="w3-input w3-border" cols="50" rows="5"/></td>	
		</tr>	
		</table>				

<br />
		<div class="w3-center">
			<div class="w3-bar">
			    <button class="w3-button w3-teal" id="save" type="submit">저장</button>
			    <a href="resume3" class="w3-button w3-green" id="next" >다음</a>
			</div>
		</div>
</form:form>
</body>
</html>