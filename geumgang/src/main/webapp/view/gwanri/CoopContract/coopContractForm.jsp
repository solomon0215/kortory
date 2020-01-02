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
<h2 class="w3-myfont w3-center">계약서 작성</h2>
	<form:form action="coopWritePro" method="POST" commandName="ccc">
		
		<table class="w3-table-all w3-centered">
			<thead>
			    <tr class="w3-dark-gray">
			      <th style="width:20%;">항목</th><th>내용</th>
			    </tr>
		    </thead>
		    <tbody>
		     
		    	<tr class="w3-white">
					<td>계약서 제목</td>
					<td>
						<form:input path="coopContractSubject" style="width:500px;" type="text"/>
					</td>
				</tr>
				<tr class="w3-white">
					<td>계약체결 일자</td>
					<td>
						<form:input path="coopContractDate" type="date"/>
					</td>
				</tr>
				<tr class="w3-white">
					<td>업체 분류날짜</td>
					<td>
						<form:input path="companySelectDate" type="date"/>
					</td>
				</tr>
				<tr class="w3-white">
					<td>공급률</td>
					<td>
						<form:input path="coopContractSuppRatio" type="float"/>
					</td>
				</tr>
				<tr class="w3-white">
					<td>마진률</td>
					<td>
						<form:input path="coopContractMarRatio" type="float"/>
					</td>
				</tr>
				<tr class="w3-white">
					<td>정산일자</td>
					<td>
						<form:input path="coopContractCalDate" type="date"/>
					</td>
				</tr>
				<tr class="w3-white">
					<td>사용 날짜</td>
					<td>
						<form:input path="coopConditionAvailDate" type="text"/>
					</td>
				</tr>
				<tr class="w3-white">
					<td>사용 시간</td>
					<td>
						<form:input path="coopConditionAvailTime" type="text"/>
					</td>
				</tr>
				<tr class="w3-white">
					<td>사용 인원</td>
					<td>
						<form:input path="coopConditionLimitPer" type="number"/>
					</td>
				</tr>
				<tr class="w3-white">
					<td>업체희망 정산비율</td>
					<td>
						<form:input path="coopContractRatio" type="float"/>
					</td>
				</tr>
				<tr class="w3-white">
					<td>정신기준시간</td>
					<td>
						<form:input path="coopContractSett" type="number"/>
					</td>
				</tr>
				<tr class="w3-white">
					<td>정산방법</td>
					<td>
						<form:input path="coopContractMethod" type="text"/>
					</td>
				</tr>
				<tr class="w3-white">
					<td>계약종료 일자</td>
					<td>
						<form:input path="coopContractEndDate" type="date"/>
					</td>
				</tr>
				<tr class="w3-white">
					<td>분류 유형</td>
					<td>
						<form:select path="coopKind">
							<form:option value="0" label="------업체 유형 선택------"/>
							<form:option value="관광" label="관광업체"/>
							<form:option value="숙박" label="숙박업체"/>
							<form:option value="이동" label="이동업체"/>
						</form:select>						
					</td>
					
				</tr>
				<tr class="w3-white">
					<td>계약서 상태</td>
					<td>
						<form:input path="coopContractState" type="text"/>
					</td>
				</tr>
				<tr class="w3-white">
					<td>작성일</td>
					<td>
						<form:input path="coopContractWrite" type="date"/>
					</td>
				</tr>
			    <form:hidden path="companyId" />
		    </tbody>
		</table><br/>
		<div class="w3-center">
			<button class="w3-button w3-white w3-border w3-hover-amber" type="submit">작성</button>
		</div>
		</form:form></div>
</body>
</html>