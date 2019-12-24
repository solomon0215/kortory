<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>근로계약서 목록</title>
</head>
<body>
<!-- Page Content -->
	<div class =" w3-container" style="margin-left:12%" >
		<center><h2>근로계약서 목록</h2></center><br/>
			<table class="w3-table-all">
    <thead>
     <table class="w3-table-all w3-centered">
      <tr class="w3-light-blue">
        <th>번호</th>
        <th>사원명</th>
        <th>계약시작일</th>
        <th>계약만료일</th>
      </tr>
    </thead>
    <c:forEach var="contract" items="${contract}"  varStatus="status">
    <tr>
      <td>${status.count}</td>
      <td><a href="#"></a></td>
      <td>${contract.conStart}</td>
      <td>${contract.conEnd}</td>
    </tr>
    </c:forEach>
  </table>
  </div>
  <br />
   <div class="w3-container" align="right">
   <a href="contractRegist" class="w3-btn w3-light-gray w3-border">등록</a>
</div>
</body>
</html>