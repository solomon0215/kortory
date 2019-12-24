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
		<center><h2>협약조건안 목록</h2></center><br/>			
			<table class="w3-table-all">
    <thead>
     <table class="w3-table-all w3-centered">
      <tr class="w3-green">
        <th>번호</th>
        <th>작성일</th>
        <th>작성자</th>
      </tr>     
    </thead>
     <c:forEach var="agree" items="${agree}" varStatus="status" >
    <tr>
      <td>${status.count }</td>
      <td>${agree.agreementConditionDate }</td>
      <td>${authName}</td>
    </tr>
    </c:forEach>
  </table>
  </dvi>
  <div class="w3-container" align="center">
   <a href="http://localhost:8080/geumgang/gwanri/agreementConditionWrite" class="w3-btn w3-green">등록</a>
</div>
  
</div>
</body>
</html>