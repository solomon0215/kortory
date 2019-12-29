<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

</head>
<body>
	<dvi class =" w3-container">
		<center><h2>사전답사 보고서 목록</h2></center><br/>			
			<table class="w3-table-all">
    <thead>
     <table class="w3-table-all w3-centered">
      <tr class="w3-green">
        <th>번호</th>
        <th>업체명</th>
        <th>업체유형</th>
        <th>업체담당자</th>
      </tr>     
    </thead>
     <c:forEach var="complete" items="${complete}" varStatus="status" >
    <tr>
      <td>${status.count }</td>
      <td><a href='<c:url value='/gwanri/expDetail?num=${complete.explorationNum }'/>'${complete.explorationNum}')">${complete.companyName }</a></td>
       <td>${complete.explorationType }</td>
      <td>${complete.explorationManaName}</td>
     
     
    </tr>
    </c:forEach>
  </table>
  </dvi>
 
  
</div>
</body>
</html>