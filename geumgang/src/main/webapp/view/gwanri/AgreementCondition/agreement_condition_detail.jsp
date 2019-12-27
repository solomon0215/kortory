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

<dvi class =" w3-container">
		<center><h2>협약조건안 상세내역</h2></center><br/>
	
<thead>
     <table class="w3-table-all w3-half w3-centered">
       <tr><th>번호</th> <td>${detail.agreementConditionNum}</td></tr>
        <tr><th>제목</th><td>${detail.agreementConditionSubject }</td></tr>
       <tr> <th>업체 희망 정산 비율</th> <td>${detail.agreementConditionRatio }</td></tr>
       <tr> <th>정산기준 시간</th><td>${detail.agreementConditionSett }</td></tr>
       <tr> <th>작성일</th> <td>${detail.agreementConditionDate }</td></tr>
     

  </table>
  </thead>
<br />
  <div class="w3-container" align="center">
   <a href="#" class="w3-btn w3-blue">수정</a>
    <a href="#" class="w3-btn w3-blue">삭제</a>
</div>
</form>
</dvi>
</body>
</html>