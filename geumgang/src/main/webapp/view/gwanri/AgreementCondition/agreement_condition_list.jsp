<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script>
	function openWork(work) {
		var i;
		var x = document.getElementsByClassName("explor");
		for (i = 0; i < x.length; i++) {
			x[i].style.display = "none";
		}
		document.getElementById(work).style.display = "block";
	}
	function goToNewWrite(expNum) {
		location.href = "explorNewWirte?expNum=" + expNum;
	}
	function goToIncomWrite(expNum) {
		location.href = "explorIncomDetail?expNum=" + expNum;
	}
	function goToCompleDetail(expNum) {
		location.href = "explorCompleDetail?expNum=" + expNum;
	}
</script>
</head>
<body>
	<div class="w3-container" style="margin-top: 10%;">
		<div class="w3-container w3-center w3-dark-grey">
			<div class="w3-bar w3-dark-grey">
				<button
					class="w3-bar-item w3-button w3-margin-left w3-margin-right w3-large w3-min"
					onclick="openWork('new')">이관된 조건안</button>
				<button
					class="w3-bar-item w3-button w3-margin-left w3-margin-right w3-large w3-min"
					onclick="openWork('complete')">수정가능 조건안</button>
			</div>
		</div>

		<div id="new" class="w3-container w3-display-container explor">
			<br>
			<h2 class="w3-myfont w3-center">이관된 조건안 목록</h2>
			<br>
			<thead>
				<table class="w3-table-all w3-centered">

					<thead>
						<tr class="w3-green">
							<th>번호</th>
							<th>제목</th>
							<th>작성자</th>
							<th>작성일</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="agree" items="${agree}" varStatus="status">
							<tr>
								<td>${status.count }</td>
								<td><a
									href='<c:url value='/gwanri/agreementConditionView?num=${agree.agreementConditionNum }'/>'${agree.agreementConditionNum}'>${agree.agreementConditionSubject }</a></td>
								<td>${authName}</td>
								<td>${agree.agreementConditionDate }</td>

							</tr>
						</c:forEach>
					</tbody>
				</table>
		</div>
		<div id="complete" class="w3-container w3-display-container explor"
			style="display: none">
			<br>
			<h2 class="w3-myfont w3-center">수정가능 조건안 목록</h2>
			<br>
			<table class="w3-table-all w3-centered">
				<thead>
					<tr class="w3-green">
						<th>번호</th>
						<th>제목</th>
						<th>작성자</th>
						<th>작성일</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="complete" items="${complete}" varStatus="status">
						<tr>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>