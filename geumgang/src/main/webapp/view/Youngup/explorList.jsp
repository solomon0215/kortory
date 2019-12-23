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
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link href="https://fonts.googleapis.com/css?family=Single+Day&display=swap" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Gugi|Yeon+Sung&display=swap" rel="stylesheet">
<style>
.w3-myfont {
  font-family: 'Single Day', cursive;
}
.w3-min{
	font-family: 'Yeon Sung', cursive;
	font-family: 'Gugi', cursive;
}
h2{
	color:  #696463;
}
</style>
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
	location.href="explorIncomWirte?expNum="+expNum;
}
function goToCompleDetail(expNum){
	location.href="explorCompleDetail?expNum="+expNum;
}
</script>
</head>
<body>
<div class="w3-container" >
	<div class="w3-container w3-center w3-dark-gray">
		<div class="w3-bar w3-dark-gray">
		  <button class="w3-bar-item w3-button w3-margin-left w3-margin-right w3-large w3-min" onclick="openWork('new')">담당 신규업체</button>
		  <button class="w3-bar-item w3-button w3-margin-left w3-margin-right w3-large w3-min" onclick="openWork('incomplete')">미완료 사전답사 보고서</button>
		  <button class="w3-bar-item w3-button w3-margin-left w3-margin-right w3-large w3-min" onclick="openWork('complete')">완료 사전답사 보고서</button>
		</div>
	</div>
	
	<div id="new" class="w3-container w3-display-container explor">
	  <br>
	  <h2 class="w3-myfont w3-center">새롭게 담당하신 업체에요!</h2>
	  <br>
  		<table class="w3-table-all w3-tiny w3-centered">
			<thead>
			    <tr>
			      <th>사전답사 보고서 번호</th><th>업체 이름</th><th>주소</th><th>전화번호</th><th>공기업여부</th><th>업무</th>
			    </tr>
		    </thead>
		    <tbody>
		    	<c:if test="${newExp !=null}">
		    	<c:forEach items="${newExp}" var="exp">
			    <tr class="w3-pale-blue">
			      <td>${exp.explorationNum}</td>
			      <td>${exp.companyName}</td>
			      <td>${exp.companyAddr}</td>
			      <td>${exp.companyPh}</td>
			      <td>${exp.companyType}</td>
			      <td><button class="w3-button w3-white w3-border w3-hover-amber" onclick="goToNewWrite('${exp.explorationNum}')">작성하러 가기</button></td>
			    </tr>
			    </c:forEach>
			    </c:if>
		    	<c:if test="${newExp ==null}">
		    	<tr class="w3-pale-blue">
			      <td colspan="5">신규담당 업무 처리를 마치셨어요!!</td>
			    </tr> 
		    	</c:if>			    
		    </tbody>
		</table>
	</div>
	
	<div id="incomplete" class="w3-container w3-display-container explor" style="display:none">
		<br>
		<h2 class="w3-myfont w3-center">바쁘게 다니셔야 겠어요!</h2>
		<br>
	  	<table class="w3-table-all w3-tiny w3-centered">
			<thead>
			    <tr>
			      <th>사전답사 보고서 번호</th><th>업체 이름</th><th>주소</th><th>전화번호</th><th>공기업여부</th><th>업무</th>
			    </tr>
		    </thead>
		    <tbody>
		    	<c:if test="${incomplete !=null}">
		    	<c:forEach items="${incomplete}" var="in">
			    <tr class="w3-pale-blue">
			      <td>${in.explorationNum}</td>
			      <td>${in.companyName}</td>
			      <td>${in.companyAddr}</td>
			      <td>${in.companyPh}</td>
			      <td>${in.companyType}</td>
			      <td><button class="w3-button w3-white w3-border w3-hover-amber" onclick="goToIncomWrite('${in.explorationNum}')">작성하러 가기</button></td>
			    </tr>
			    </c:forEach>
			    </c:if>
		    	<c:if test="${incomplete ==null}">
		    	<tr class="w3-pale-blue">
			      <td colspan="5">신규담당 업무 처리를 마치셨어요!!</td>
			    </tr> 
		    	</c:if>			    
		    </tbody>
		</table>
	</div>
	
	<div id="complete" class="w3-container w3-display-container explor" style="display:none">
	  	<br>
		<h2 class="w3-myfont w3-center">지금까지 이렇게 많은 일을 해내셨어요!</h2>
		<br>
	  	<table class="w3-table-all w3-tiny w3-centered">
			<thead>
			    <tr>
			      <th>사전답사 보고서 번호</th><th>업체 이름</th><th>주소</th><th>전화번호</th><th>공기업여부</th><th>업무</th>
			    </tr>
		    </thead>
		    <tbody>
		    	<c:if test="${incomplete !=null}">
		    	<c:forEach items="${incomplete}" var="in">
			    <tr class="w3-pale-blue">
			      <td>${in.explorationNum}</td>
			      <td>${in.companyName}</td>
			      <td>${in.companyAddr}</td>
			      <td>${in.companyPh}</td>
			      <td>${in.companyType}</td>
			      <td><button class="w3-button w3-white w3-border w3-hover-amber" onclick="goToIncomWrite('${in.explorationNum}')">작성하러 가기</button></td>
			    </tr>
			    </c:forEach>
			    </c:if>
		    	<c:if test="${incomplete ==null}">
		    	<tr class="w3-pale-blue">
			      <td colspan="5">신규담당 업무 처리를 마치셨어요!!</td>
			    </tr> 
		    	</c:if>			    
		    </tbody>
		</table>
	</div>	
</div>
</body>
</html>