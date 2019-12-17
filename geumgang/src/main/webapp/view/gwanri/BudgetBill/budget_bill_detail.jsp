<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<body><body>
<dvi class =" w3-container">
		<center><h2>예산안 보고서 상세내역</h2></center><br/>
    <div class="big_title">공지사항 수정/삭제/추가</div>
    <div class="big_contents">
    <form id="notice_form">
    <input type="hidden" id="notice_id" name="notice_id" value="${notice.notice_id }">
        <div class="title">
            <div>
                제목
            </div>
            <div>
                <input type="text" id="notice_title" name="notice_title" value="${notice.notice_title}">
            </div>
        </div>
         
        <div class="contents">
            <div>
                내용
            </div>
            <div>
                <textarea id="notice_coments" name="notice_coments">${notice.notice_coments}</textarea>
            </div>
        </div>
    </form>
         
        <div class="footer">
             
            <c:if test="${null eq notice }">
                <input type="button" id="notice_regist" value="등록">
            </c:if>
            <c:if test="${null ne notice }">
                <input type="button" id="notice_edit" value="수정">
            </c:if>       
            <input type="button" id="notice_backPage" value="뒤로">
            <input type="button" id="notice_delete" value="삭제">
        </div>
         
    </div>
     
     
</body>
<dvi class =" w3-container">
		<center><h2>예산안 보고서 상세내역</h2></center><br/>
			
<form:form name ="frm" id ="frm" method = "post" 
	commandName = "memberCommand" action ="memberModifyPro">
<table border = 1  width = 600 align = "center" cellpadding = 3 >
		<tr><td >번호<spring:message code="userId.userPw" /></td>
		<td >&nbsp;</td></tr>
	<tr><td>총 예산금액<spring:message code="userModify" /></td>
		<td >&nbsp;</td></tr>
		 
	<tr><td>인건비 비율<spring:message code="password" /></td>
		<td >&nbsp;</td></tr>
		 
	
	<tr><td >인건비 금액<spring:message code="defaultInfo" /></td>
	<td >&nbsp;</td></tr>
		 
	<tr><td>희망상품 금액<spring:message code="name" /></td>
		<td >&nbsp;</td></tr>
		 

	<tr><td>작성일<spring:message code="birth.gender" /></td>
		<td >&nbsp;</td></tr>
</table>
<br />
  <div class="w3-container" align="center">
   <a href="#" class="w3-btn w3-blue">수정</a>
    <a href="#" class="w3-btn w3-blue">삭제</a>
</div>
</form:form>
</dvi>
</body>
</html>