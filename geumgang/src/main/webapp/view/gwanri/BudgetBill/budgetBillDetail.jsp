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
<script type="text/javascript" 
	src="http://code.jquery.com/jquery-latest.js" ></script>
<script type="text/javascript" >

</script>	
</head>
<body>

<dvi class =" w3-container" >
		<center><h2>예산안보고서 상세내역</h2></center>
</dvi>	
<thead> 
<div class="w3-container" style="margin-left: 30%;">
    <table class="w3-table-all w3-half w3-centered" >
     <tr><th>번호</th> <td>${detail.budgetBillNum}</td></tr>
     <tr><th>제목</th><td>${detail.budgetBillSubject }</td></tr>
     <tr><th>총 예산금액</th> <td>${detail.budgetBillPriceSum }원</td></tr>
     <tr><th>인건비 비율</th><td>${detail.budgetBillLaborRatio }%</td></tr>
     <tr><th>인건비 금액</th> <td>${detail.budgetBillLaborPrice }원</td></tr>
     <tr><th>희망상품 금액</th> <td>${detail.budgetBillGoodsPrice }원</td></tr>
     <tr><th>작성일</th> <td>${detail.budgetBillDate }</td></tr>


  </table>
  </div>
  </thead>
  <br/>
  <div class="w3-container " style="margin-left: 43%;">
   <a href="http://localhost:8080/geumgang/gwanri/agreementConditionModify" class="w3-btn w3-green">수정</a>
    <a href="#" class="w3-btn w3-green">삭제</a>
</div>

</body>
</html>