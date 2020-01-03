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
</script>
</head>
<body>
<div class="w3-container" style="margin-top: 10%;">
	<div class="w3-container w3-center w3-dark-gray w3-margin">
		<div class="w3-bar w3-dark-gray">
		  <button class="w3-bar-item w3-button w3-margin-left w3-margin-right w3-large w3-min" onclick="openWork('one')">${choiseDay1}</button>
		  <button class="w3-bar-item w3-button w3-margin-left w3-margin-right w3-large w3-min" onclick="openWork('two')">+1Day</button>
		  <button class="w3-bar-item w3-button w3-margin-left w3-margin-right w3-large w3-min" onclick="openWork('three')">+2Day</button>
		  <button class="w3-bar-item w3-button w3-margin-left w3-margin-right w3-large w3-min" onclick="openWork('four')">+3Day</button>
		  <button class="w3-bar-item w3-button w3-margin-left w3-margin-right w3-large w3-min" onclick="openWork('five')">+4Day</button>
		  <button class="w3-bar-item w3-button w3-margin-left w3-margin-right w3-large w3-min" onclick="openWork('six')">+5Day</button>
		  <button class="w3-bar-item w3-button w3-margin-left w3-margin-right w3-large w3-min" onclick="openWork('seven')">+6Day</button>
		</div>
	</div>
	
	<div id="one" class="w3-container w3-display-container explor">
  		<table class="w3-table-all w3-tiny w3-centered">
			<thead>
			    <tr>
			      <th>업체이름</th><th>주소</th><th>연락처</th>
			    </tr>
		    </thead>
		    <tbody>
		    	<c:if test="${workingDay0 !=null}">
		    	<c:forEach items="${workingDay0}" var="exp">
			    <tr class="w3-pale-blue">
			      <td>${exp.companyName}</td>
			      <td>${exp.companyAddr}</td>
			      <td>${exp.companyPh}</td>
			    </tr>
			    </c:forEach>
			    </c:if>
		    	<c:if test="${workingDay0==null}">
		    	<tr class="w3-pale-blue">
			      <td colspan="3">선택하신 날짜에 일정이 없습니다.</td>
			    </tr> 
		    	</c:if>			    
		    </tbody>
		</table>
	</div>
	
	<div id="two" class="w3-container w3-display-container explor" style="display:none">
	  	<table class="w3-table-all w3-tiny w3-centered">
			<thead>
			    <tr>
			      <th>업체이름</th><th>주소</th><th>연락처</th>
			    </tr>
		    </thead>
		    <tbody>
		    	<c:if test="${workingDay1 !=null}">
		    	<c:forEach items="${workingDay1}" var="exp">
			    <tr class="w3-pale-blue">
			      <td>${exp.companyName}</td>
			      <td>${exp.companyAddr}</td>
			      <td>${exp.companyPh}</td>
			    </tr>
			    </c:forEach>
			    </c:if>
		    	<c:if test="${workingDay1 ==null}">
		    	<tr class="w3-pale-blue">
			      <td colspan="3">선택하신 날짜에 일정이 없습니다.</td>
			    </tr> 
		    	</c:if>			    
		    </tbody>
		</table>
	</div>
	
	<div id="three" class="w3-container w3-display-container explor" style="display:none">
	  	<table class="w3-table-all w3-tiny w3-centered">
			<thead>
			    <tr>
			      <th>업체이름</th><th>주소</th><th>연락처</th>
			    </tr>
		    </thead>
		    <tbody>
		    	<c:if test="${workingDay2 !=null}">
		    	<c:forEach items="${workingDay2}" var="exp">
			    <tr class="w3-pale-blue">
			      <td>${exp.companyName}</td>
			      <td>${exp.companyAddr}</td>
			      <td>${exp.companyPh}</td>
			    </tr>
			    </c:forEach>
			    </c:if>
		    	<c:if test="${workingDay2 ==null}">
		    	<tr class="w3-pale-blue">
			      <td colspan="3">선택하신 날짜에 일정이 없습니다.</td>
			    </tr> 
		    	</c:if>			    
		    </tbody>
		</table>
	</div>
	
	<div id="four" class="w3-container w3-display-container explor" style="display:none">
	  	<table class="w3-table-all w3-tiny w3-centered">
			<thead>
			    <tr>
			      <th>업체이름</th><th>주소</th><th>연락처</th>
			    </tr>
		    </thead>
		    <tbody>
		    	<c:if test="${workingDay3 !=null}">
		    	<c:forEach items="${workingDay3}" var="exp">
			    <tr class="w3-pale-blue">
			      <td>${exp.companyName}</td>
			      <td>${exp.companyAddr}</td>
			      <td>${exp.companyPh}</td>
			    </tr>
			    </c:forEach>
			    </c:if>
		    	<c:if test="${workingDay3 ==null}">
		    	<tr class="w3-pale-blue">
			      <td colspan="3">선택하신 날짜에 일정이 없습니다.</td>
			    </tr> 
		    	</c:if>			    
		    </tbody>
		</table>
	</div>
	
	<div id="five" class="w3-container w3-display-container explor" style="display:none">
	  	<table class="w3-table-all w3-tiny w3-centered">
			<thead>
			    <tr>
			      <th>업체이름</th><th>주소</th><th>연락처</th>
			    </tr>
		    </thead>
		    <tbody>
		    	<c:if test="${workingDay4 !=null}">
		    	<c:forEach items="${workingDay4}" var="exp">
			    <tr class="w3-pale-blue">
			      <td>${exp.companyName}</td>
			      <td>${exp.companyAddr}</td>
			      <td>${exp.companyPh}</td>
			    </tr>
			    </c:forEach>
			    </c:if>
		    	<c:if test="${workingDay4 ==null}">
		    	<tr class="w3-pale-blue">
			      <td colspan="3">선택하신 날짜에 일정이 없습니다.</td>
			    </tr> 
		    	</c:if>			    
		    </tbody>
		</table>
	</div>
	
	<div id="six" class="w3-container w3-display-container explor" style="display:none">
	  	<table class="w3-table-all w3-tiny w3-centered">
			<thead>
			    <tr>
			      <th>업체이름</th><th>주소</th><th>연락처</th>
			    </tr>
		    </thead>
		    <tbody>
		    	<c:if test="${workingDay5 !=null}">
		    	<c:forEach items="${workingDay5}" var="exp">
			    <tr class="w3-pale-blue">
			      <td>${exp.companyName}</td>
			      <td>${exp.companyAddr}</td>
			      <td>${exp.companyPh}</td>
			    </tr>
			    </c:forEach>
			    </c:if>
		    	<c:if test="${workingDay5 ==null}">
		    	<tr class="w3-pale-blue">
			      <td colspan="3">선택하신 날짜에 일정이 없습니다.</td>
			    </tr> 
		    	</c:if>			    
		    </tbody>
		</table>
	</div>
	
	<div id="seven" class="w3-container w3-display-container explor" style="display:none">
	  	<table class="w3-table-all w3-tiny w3-centered">
			<thead>
			    <tr>
			      <th>업체이름</th><th>주소</th><th>연락처</th>
			    </tr>
		    </thead>
		    <tbody>
		    	<c:if test="${workingDay6 !=null}">
		    	<c:forEach items="${workingDay6}" var="exp">
			    <tr class="w3-pale-blue">
			      <td>${exp.companyName}</td>
			      <td>${exp.companyAddr}</td>
			      <td>${exp.companyPh}</td>
			    </tr>
			    </c:forEach>
			    </c:if>
		    	<c:if test="${workingDay6 ==null}">
		    	<tr class="w3-pale-blue">
			      <td colspan="3">선택하신 날짜에 일정이 없습니다.</td>
			    </tr> 
		    	</c:if>			    
		    </tbody>
		</table>
	</div>
	
	
</div>
</body>
</html>