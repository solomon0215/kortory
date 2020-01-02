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
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript">
$(function(){
	if(${over != null && over.size() != 0}){
		var list = new Array(); 
		<c:forEach items="${over}" var="item"> 
			$("#${item}").attr("class","w3-red");
		</c:forEach>
		alert("다른 사람이 담당중인 업체가 있습니다.");
	}
	if($("#msg").html() != ""){
		$("#welcome").hide();	
	}
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
</style>
</head>
<body>
<div class="w3-container w3-display-container" style="margin-top: 5%;">
  <br>
  <h2 class="w3-myfont w3-center" id="welcome">오늘도 이렇게 많은 업체들이 있어요!</h2>
  <h2 class="w3-myfont w3-center w3-red" id="msg">${msg}</h2>
  <br>
	<table class="w3-table-all w3-tiny w3-centered">
		<thead>
		    <tr>
		      <th>업체명</th><th>업체유형</th><th>주소</th><th>사업자번호</th><th>이메일주소</th><th>선택</th>
		    </tr>
	    </thead>
	    <tbody>
	    	<c:if test="${newComList != null }">
	    	<form:form action="newCompanyPro" commandName="newComListCommand" method="POST">
		    	<c:forEach items="${newComList}" var="list">
		    	<tr class="w3-pale-blue" id="${list.companyId}">
			      <td>${list.companyId}</td>
			      <td>${list.companyType}</td>
			      <td>${list.companyAddr}</td>
			      <td>${list.companyRegNum}</td>
			      <td>${list.companyEmail}</td>
			      <td><form:checkbox path="check" value="${list.companyId}"/></td>
			    </tr>
		    	</c:forEach>
		    	<tr>
		    		<td colspan="6">
		    			<button class="w3-button w3-white w3-border w3-hover-amber" type="submit" >업무 가져오기</button>
		    		</td>
		    	</tr>
		    </form:form>
		    
	    	</c:if>
	    	<c:if test="${newComList == null }">
		    	<tr class="w3-pale-blue">
			      <td colspan="6"><h2>오늘은 여기까지가  끝이네요</h2></td>
			    </tr>
	    	</c:if>
	    </tbody>
	</table>
</div>
</body>
</html>