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
function goToNewWrite(expNum){
	location.href="explorNewWirte?expNum="+expNum;
}
function goToIncomWrite(expNum){
	location.href="explorIncomDetail?expNum="+expNum;
}
function goToCompleDetail(expNum){
	location.href="explorCompleDetail?expNum="+expNum;
}
</script>
</head>
<body>
	<div class="w3-container" style="margin-top: 10%;">
		<div class="w3-container w3-center w3-dark-grey">
			<div class="w3-bar w3-dark-grey">
				<button
					class="w3-bar-item w3-button w3-margin-left w3-margin-right w3-large w3-min"
					onclick="openWork('new')">사전답사 보고서(미확인)</button>
				<button
					class="w3-bar-item w3-button w3-margin-left w3-margin-right w3-large w3-min"
					onclick="openWork('complete')">사전답사 보고서(확인)</button>
			</div>
		</div>

		<div id="new" class="w3-container w3-display-container explor">
			<br>
			<h2 class="w3-myfont w3-center">사전답사 보고서 목록(미확인)</h2>
			<br>
			<thead>
				<table class="w3-table-all w3-centered">

					<thead>
						<tr class="w3-pale-red">
							<th>번호</th>
							<th>업체 이름</th>
							<th>업체유형</th>
							<th>업체담당자</th>
						</tr>
					</thead>
					<tbody>
						<c:if test="${complete !=null}">
						<c:forEach var="complete" items="${complete}" varStatus="status"> <!--영업부에서 받아온 complete -->
							<tr>
								<td>${status.count }</td>
								<td><a href='<c:url value='/gwanri/expDetail?num=${complete.explorationNum }'/>'${complete.explorationNum}')">${complete.companyName }</a></td>
								<td>${complete.explorationType }</td>
								<td>${complete.explorationManaName}</td>
							</tr>
						</c:forEach>
						</c:if>
									</tbody>
				</table>
		</div>
		<div id="complete" class="w3-container w3-display-container explor"
			style="display: none">
			<br>
			<h2 class="w3-myfont w3-center">사전답사 보고서 목록(확인)</h2>
			<br>
			<table class="w3-table-all w3-centered">
				<thead>
					<tr class="w3-pale-blue">
							<th>번호</th>
							<th>업체 이름</th>
							<th>업체유형</th>
							<th>업체담당자</th>
						</tr>
				</thead>
				<tbody>
					
				</tbody>
			</table>
		</div>
	</div>
</body>