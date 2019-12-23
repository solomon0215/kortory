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
<link href="https://fonts.googleapis.com/css?family=Single+Day&display=swap" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Gugi|Yeon+Sung&display=swap" rel="stylesheet">
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript">
$(function() {
		$("#frm").submit(function(){
			if($("#schedule").val() == ""){
				alert("날짜를 정해주세요");
				return false;
			}
		});
});
</script>
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
tr{}

</style>
</head>
<body>
<div class="w3-container">
	<div class="w3-container w3-center">
		
	</div>
	<form:form mthod="POST" action="explorNewWirtePro" id="frm" commandName="explorNewWriteCommand">
	<div id="new" class="w3-container w3-display-container explor">
	  <br>
	  <h2 class="w3-myfont w3-center">아래의 정보를 확인하고 방문 일정을 등록하세요</h2>
	  <p class="w3-center">방문 일정을 등록하시면 업체의 이메일로 일정이 정해졌음을 전달합니다.</p>
	  <br>
  		<table class="w3-table-all w3-tiny w3-centered">
			<thead>
			    <tr class="w3-dark-gray">
			      <th style="width:20%;">항목</th><th>내용</th>
			    </tr>
		    </thead>
		    <tbody>
		    	<tr  class="w3-gray">
			      <td>보고서 번호</td>
			      <td class="w3-light-gray">
			      	${detail.explorationNum}
			      	<form:hidden  path="explorationNum" value="${detail.explorationNum}"/>
			      </td>
			    </tr>
			    <tr class="w3-gray">
			      <td>사업자 번호</td><td class="w3-light-gray">${detail.companyRegNum}</td>
			    </tr>
			    <tr class="w3-gray">
			      <td>업체 이름</td><td class="w3-light-gray">${detail.companyName}</td>
			    </tr>
			    <tr class="w3-gray">
			      <td>업체 주소</td><td class="w3-light-gray">${detail.companyAddr}</td>
			    </tr>
			    <tr class="w3-gray">
			      <td>업체 연락처</td><td class="w3-light-gray">${detail.companyPh}</td>
			    </tr>
			    <tr class="w3-gray">
			      <td>공기업 여부</td><td class="w3-light-gray">${detail.companyType}</td>
			    </tr>
			    <tr class="w3-gray">
			      <td>업체 이메일</td><td class="w3-light-gray">${detail.companyEmail}</td>
			    </tr>
			    <tr class="w3-gray">
			      <td>방문 일정</td>
			      <td class="w3-white" style="padding:0;margin:0;">
			      	<input class="w3-white"  style="height:40px;width:100%;text-align:center;"  
			      	type="date" name="explorationSchedule" id="schedule">
			      </td>
			    </tr>
			    <form:hidden  path="youngUpNum" value="${detail.youngUpNum}" />
			    <form:hidden path="companyId" value="${detail.companyId}" />
		    </tbody>
		</table>
		<div class="w3-container w3-margin w3-center">
			<form:errors path="explorationNum" class="w3-red"/>
		</div>
		<div class="w3-container w3-margin w3-center">
			<button class="w3-button w3-white w3-border w3-hover-gray" type="submit" id="btn">방문 일정 등록 하기</button>
		</div>
	</div>		
	</form:form>
</div>
</body>
</html>