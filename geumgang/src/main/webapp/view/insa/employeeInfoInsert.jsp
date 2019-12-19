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
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>Insert title here</title>
</head>
<form:form class="w3-container w3-card-4 w3-white" style="margin-left:175px"
commandName="employeeCommand" id="frm" action="employeeRegiPro" method="POST" >
		<h2 class="w3-center">사원 등록</h2>
		<p>
			<label class="w3-text-grey">직원번호</label>
			<form:input path="employeeNum" class="w3-input w3-border w3-white"  type="text" />
		</p>
		<p>
			<label class="w3-text-grey">아이디</label>
			<form:input path="employeeId" class="w3-input w3-border w3-white"  type="text" />
		</p>
		<p>
			<label class="w3-text-grey">비밀번호</label>
			 <form:input path="employeePw" class="w3-input w3-border w3-white"  type="text" />
		</p>
		<p>
			<label class="w3-text-grey">비밀번호 확인</label>
			<form:input path="employeePwCon" class="w3-input w3-border w3-white"  type="text" />
		</p>
		<p>
			<label class="w3-text-grey">입사일</label> 
			<form:input path="employeeRegist" class="w3-input w3-border w3-white"  type="text" />
		</p>
		<p>
			<label class="w3-text-grey">이름</label>
			<form:input path="employeeName" class="w3-input w3-border w3-white" type="text" />
		</p>
		<p>
			<label class="w3-text-grey">생년월일</label>
			<form:input path="employeeBirth" class="w3-input w3-border w3-white" type="text" />
		</p>
		<p>
			<label class="w3-text-grey">전자메일</label> 
			<form:input path="employeeEmail" class="w3-input w3-border w3-white" type="text" />
		</p>
		<p>
			<label class="w3-text-grey">성별</label> 
			<form:input path="employeeGender" class="w3-input w3-border w3-white" type="text" />
		</p>
		<p>
			<label class="w3-text-grey">전화번호</label> 
			<form:input path="employeePh" class="w3-input w3-border w3-white" type="text" />
		</p>
		<p>
		<label class="w3-text-gray">부서번호</label>
		<form:select path="employeeKind">
		<form:option value="301" label="관리부" />
		<form:option value="302" label="기획부" />
		<form:option value="303" label="인사부" />
		<form:option value="304" label="영업부"/>
		</form:select>
		</p>
		<br />
		<div class="w3-center">
			<div class="w3-bar">
				<input  class="w3-button w3-yellow" type="reset" value="다시 작성" />
			    <button class="w3-button w3-teal" id="regist">등록</button>
			</div>
		</div>
</form:form>

</body>
</html>