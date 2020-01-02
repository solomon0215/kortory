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
		<center><h2>사전답사보고서 상세내역</h2></center>
</dvi>	
<thead> 
<div class="w3-container" >
  <table class="w3-table-all w3-half w3-centered" style="margin-left: 24%;">
    
     <tr><th>보고서 번호</th> <td>${detail.explorationNum}</td></tr>
       <tr><th>업체 아이디</th><td>${detail.companyId }</td></tr>
       <tr> <th>업체 사업자번호</th> <td>${detail.companyRegNum }</td></tr>
       <tr> <th>업체명</th><td>${detail.companyName }</td></tr>
       <tr> <th>업체 주소</th> <td>${detail.companyAddr}</td></tr>
        <tr> <th>업체 번호</th> <td>${detail.companyPh}</td></tr>
         <tr> <th>업체 유형(공기업/민간)</th> <td>${detail.companyType }</td></tr>
          <tr> <th>업체 이메일</th> <td>${detail.companyEmail }</td></tr>
           <tr> <th>업체 유형</th> <td>${detail.explorationType}</td></tr>
            <tr> <th>사전답사 예정일</th> <td>${detail.explorationSchedule }</td></tr>
             <tr> <th>사전답사 실시일</th> <td>${detail.explorationEffect }</td></tr>
              <tr> <th>업체 담당자 이름</th> <td>${detail.explorationManaName }</td></tr>
               <tr> <th>업체 방문 가능시간</th> <td>${detail.explorationAvailTime }시</td></tr>
                <tr> <th>업체 사용가능 날짜</th> <td>${detail.explorationAvailDate }</td></tr>
                <tr> <th>공휴일 사용 가능 여부</th> <td>${detail.explorationAvailHoli }</td></tr>
                <tr> <th>업체 방문 제한 나이</th> <td>${detail.explorationLimitAge }세</td></tr>
                <tr> <th>업체 방문 제한 인원</th> <td>${detail.explorationLimitPer }명</td></tr>
                <tr> <th>업체 방문 제한 조건</th> <td>${detail.explorationCondition }</td></tr>
                <tr> <th>증빙자료</th> <td>${detail.explorationFile }</td></tr>
                <tr> <th>제출여부</th> <td>${detail.explorationSubmit }</td></tr>


  </table> 
  </div>
  </thead>
  <br/>
  <div class="w3-container " style="margin-left: 44%;">
   <a href="http://localhost:8080/geumgang/gwanri/coopWrite?num=${detail.explorationNum}&companyId=${detail.companyId }" class="w3-btn w3-green">계약서 작성</a>
</div>

</body>
</html>