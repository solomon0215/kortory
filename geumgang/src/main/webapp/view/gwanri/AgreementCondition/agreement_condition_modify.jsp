<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/icon?family=Material+Icons">
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript" src="js/jquery.form.js"></script>
<script type="text/javascript">
$(function(){
	$("#frm").submit(function(){	
		if($("#agreementConditionRatio").val() == ""){
			alert("업체희망 정산비율을 입력하세요");
			$("#agreementConditionRatio").focus();
			return false;
			}				
		if($("#agreementConditionSett").val()==""){
			alert("정산기준시간을 입력하세요");
			$("#agreementConditionSett").focus();				
			return false;
			}	
	});
	});
	</script>
</head>
<body>
<form action="agreementConditionModifyPro" name="frm" id="frm" method="post" >
<dvi class =" w3-container" >
		<center><h2>협약조건안 수정</h2></center>
</dvi>	
<thead> 
<div class="w3-container" style="margin-left: 30%;">
    <table class="w3-table-all w3-half w3-centered" >
     <tr><th>번호</th> <td>${detail.agreementConditionNum}</td></tr>
       <tr><th>제목</th><td><input type="text" name="agreementConditionSubject" id="agreementConditionSubject" class="w3-input w3-center" placeholder="제목" ></td></tr>
       <tr> <th>업체 희망 정산 비율</th><td><input type="text" name="agreementConditionRatio" id="agreementConditionRatio" class="w3-input w3-center" placeholder="업체희망정산비율" > </td></tr>
       <tr> <th>정산기준 시간</th><td><input type="text" name="agreementConditionSett" id="agreementConditionSett" class="w3-input w3-center" placeholder="정산 기준 시간" ></td></tr>
       <tr> <th>작성일</th> <td>${detail.agreementConditionDate }</td></tr>
  </table>
  
  </div>
  </thead>
  <br/>
  <div class="w3-container " style="margin-left: 43%;">
  <input type="submit" class="w3-btn w3-green" value="수정">
    <a href="#" class="w3-btn w3-green">삭제</a>
</div>
</form>
</body>
</html>