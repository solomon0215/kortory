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
		<center><h2>세금납부 신고서 상세내역</h2></center>
</dvi>	
<thead> 
<div class="w3-container" style="margin-left: 33%;">
    <table class="w3-table-all w3-half w3-centered" >
     <tr><th>번호</th> <td>${detail.taxNum}</td></tr>
     <tr><th>납부신고 제목</th><td>${detail.taxSubject }</td></tr>
     <tr><th>납부 산정기간</th> <td>${detail.taxPeriod }일</td></tr>
     <tr><th>확인일</th><td>${detail.taxProofDate }</td></tr>
     <tr><th>신고일자</th> <td>${detail.taxDate }</td></tr>
     <tr><th>납부금액</th> <td>${detail.taxCost }원</td></tr>
     

  </table>
  </div>
  </thead>
  <br/>
  <center>
    <input type="button" value="뒤로" onclick="javascript:history.back();" class="w3-btn w3-green"></a>
</div></center>

</body>
</html>