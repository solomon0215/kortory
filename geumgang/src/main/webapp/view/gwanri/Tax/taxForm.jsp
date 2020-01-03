<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/icon?family=Material+Icons">
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript" src="js/jquery.form.js"></script>
<script type="text/javascript">
</script>
</head>
<body>
<div class="w3-container" style="margin-top: 5%;">
	<form:form action="taxWritePro" method="POST" commandName="tc" enctype="multipart/form-data">
		
		<table class="w3-table-all w3-centered">
			<thead>
			    <tr class="w3-dark-gray">
			      <th style="width:20%;">항목</th><th>내용</th>
			    </tr>
		    </thead>
		    <tbody>
		    	<tr class="w3-white">
					<td>납부신고 제목</td>
					<td>
						<form:input path="taxSubject" style="width:500px;" type="text"/>
					</td>
				</tr>
				<tr class="w3-white">
					<td>납부 산정기간</td>
					<td>
						<form:input path="taxPeriod" type="number"/>일
					</td>
				</tr>
				<tr class="w3-white">
					<td>확인일</td>
					<td>
						<form:input path="taxProofDate" type="date"/>
					</td>
				</tr>
				
				<tr class="w3-white">
					<td>신고일자</td>
					<td>
						<form:input path="taxDate" type="date"/>
					</td>
				</tr>
				<tr class="w3-white">
					<td>납부금액</td>
					<td>
						<form:input path="taxCost" type="number"/>원
					</td>
				</tr>
				
		    </tbody>
		</table><br/>
		<div class="w3-center">
			<button class="w3-button w3-white w3-border w3-hover-amber" type="submit">작성</button>
		</div>
		</form:form></div>
</body>
</html>