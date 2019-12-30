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
	<body>
<form:form class="w3-container w3-card-4 w3-white" style="margin-left:12%"
commandName="recruitRegiCommand" id="frm" action="recruitRegiPro" method="POST" >
		<h2 class="w3-center">채용공고 작성</h2>
		<p>
			<label class="w3-text-grey">제목</label>
			<form:input path="regiTitle" class="w3-input w3-border w3-white"   type="text" />
		</p>
		<p>
			<label class="w3-text-grey">업무내용</label>
			<form:textarea path="regiContent" class="w3-input w3-border" cols="50" rows="5"/>
		</p>
		<p>
			<label class="w3-text-grey">우대사항</label>
			<form:textarea path="regiPrefer" class="w3-input w3-border" cols="50" rows="5"/>
		</p>
		<p>
			<label class="w3-text-grey">모집인원(숫자만 입력)</label>
			 <form:input path="regiPersonnel"
				class="w3-input w3-border w3-white"  value="1" type="text"
				onKeyup="this.value=this.value.replace(/[^0-9]/g,'');" />
		</p>
		<p>
			<label class="w3-text-grey">지원자격</label>
			<form:textarea path="regiQual" class="w3-input w3-border" cols="50" rows="5"/>
		</p>
		<p>
			<label class="w3-text-grey">등록일자</label> 
			<form:input path="regiDate" class="w3-input w3-border w3-white"  style="width: 30%" type="text" />
		    &nbsp;&nbsp;&nbsp;&nbsp;
			<label class="w3-text-grey">마감일자</label>
			<form:input path="endDate" class="w3-input w3-border w3-white"   style="width: 30%"  type="text" />
		</p>
		<p>
			<label class="w3-text-grey">연봉(숫자만 입력)</label>
			 <form:input path="regiCost"
				class="w3-input w3-border w3-white" type="text"
				onKeyup="this.value=this.value.replace(/[^0-9]/g,'');" />
		</p>
		<p>
			<label class="w3-text-grey">직원번호</label> 
			<form:input path="inSaNum" class="w3-input w3-border w3-white"  value="${authLog.inSaNum}" type="text"/>
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

