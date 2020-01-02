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
		<center><h2>협력업체 계약서 상세내역</h2></center>
</dvi>	
<thead> 
<div class="w3-container" >
    <table class="w3-table-all w3-half w3-centered" style="margin-left: 24%;">
    
    <tr><th>업체 아이디</th> <td>${coop.companyId}</td></tr>
     <tr><th>계약서 제목</th> <td>${coop.coopContractSubject}</td></tr>
       <tr><th>계약체결 일자</th><td>${coop.coopContractDate }</td></tr>
       <tr> <th>업체 분류날짜</th> <td>${coop.companySelectDate }</td></tr>
       <tr> <th>공급률</th><td>${coop.coopContractSuppRatio }%</td></tr>
       <tr> <th>마진률</th> <td>${coop.coopContractMarRatio}%</td></tr>
        <tr> <th>정산일자</th> <td>${coop.coopContractCalDate}</td></tr>
         <tr> <th>사용 날짜</th> <td>${coop.coopConditionAvailDate }일</td></tr>
          <tr> <th>사용 시간</th> <td>${coop.coopConditionAvailTime }시간</td></tr>
           <tr> <th>사용 인원</th> <td>${coop.coopConditionLimitPer}명</td></tr>
            <tr> <th>업체희망 정산비율</th> <td>${coop.coopContractRatio }%</td></tr>
             <tr> <th>정산기준시간</th> <td>${coop.coopContractSett }시</td></tr>
              <tr> <th>정산방법</th> <td>${coop.coopContractMethod }</td></tr>
                <tr> <th>계약종료 일자</th> <td>${coop.coopContractEndDate }</td></tr>
              <tr> <th>분류유형</th> <td>${coop.coopKind }</td></tr>
                <tr> <th>계약서 상태</th> <td>${coop.coopContractState }</td></tr>
                <tr> <th>작성일</th> <td>${coop.coopContractWrite }</td></tr>
              


  </table>
  </div>
  </thead>
  <br/><div>
   <center>
    <input type="button" value="뒤로" onclick="javascript:history.back();" class="w3-btn w3-green"></a>
</div></center>
</div>

</body>
</html>