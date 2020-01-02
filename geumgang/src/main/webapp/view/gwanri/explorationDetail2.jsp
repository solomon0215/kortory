<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<script type="text/javascript"
	src="http://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript">
	
</script>
</head>
<body>

	<dvi class=" w3-container">
	<center>
		<h2>계약서/사전답사보고서 상세내역</h2>
	</center>
	</dvi>
	<thead>
		<div class="w3-container">
			<table class="w3-table-all w3-centered">
				<tr>
					<th>계약서 제목</th>
					<td>${detail3.coopContractSubject}</td>
				</tr>
				<tr>
					<th>계약체결 일자</th>
					<td>${detail3.coopContractDate }</td>
				</tr>
				<tr>
					<th>업체 분류날짜</th>
					<td>${detail3.companySelectDate }</td>
				</tr>
				<tr>
					<th>공급률</th>
					<td>${detail3.coopContractSuppRatio }</td>
				</tr>
				<tr>
					<th>마진률</th>
					<td>${detail3.coopContractMarRatio}</td>
				</tr>
				<tr>
					<th>정산일자</th>
					<td>${detail3.coopContractCalDate}</td>
				</tr>
				<tr>
					<th>사용 날짜</th>
					<td>${detail3.coopConditionAvailDate }</td>
				</tr>
				<tr>
					<th>사용 시간</th>
					<td>${detail3.coopConditionAvailTime }</td>
				</tr>
				<tr>
					<th>사용 인원</th>
					<td>${detail3.coopConditionLimitPer}</td>
				</tr>
				<tr>
					<th>업체희망 정산비율</th>
					<td>${detail3.coopContractRatio }</td>
				</tr>
				<tr>
					<th>정산기준시간</th>
					<td>${detail3.coopContractSett }</td>
				</tr>
				<tr>
					<th>정산방법</th>
					<td>${detail3.coopContractMethod }</td>
				</tr>
				<tr>
					<th>계약종료 일자</th>
					<td>${detail3.coopContractEndDate }</td>
				</tr>
				<tr>
					<th>분류유형</th>
					<td>${detail3.coopKind }</td>
				</tr>
				<tr>
					<th>계약서 상태</th>
					<td>${detail3.coopContractState }</td>
				</tr>
				<tr>
					<th>작성일</th>
					<td>${detail3.coopContractWrite }</td>
				</tr>
				
				<tr>
					<th>업체 아이디</th>
					<td>${detail2.companyId }</td>
				</tr>
				<tr>
					<th>업체 사업자번호</th>
					<td>${detail2.companyRegNum }</td>
				</tr>
				<tr>
					<th>업체명</th>
					<td>${detail2.companyName }</td>
				</tr>
				<tr>
					<th>업체 주소</th>
					<td>${detail2.companyAddr}</td>
				</tr>
				<tr>
					<th>업체 번호</th>
					<td>${detail2.companyPh}</td>
				</tr>
				<tr>
					<th>업체 유형(공기업/민간)</th>
					<td>${detail2.companyType }</td>
				</tr>
				<tr>
					<th>업체 이메일</th>
					<td>${detail2.companyEmail }</td>
				</tr>
				<tr>
					<th>업체 유형</th>
					<td>${detail2.explorationType}</td>
				</tr>
				<tr>
					<th>사전답사 예정일</th>
					<td>${detail2.explorationSchedule }</td>
				</tr>
				<tr>
					<th>사전답사 실시일</th>
					<td>${detail2.explorationEffect }</td>
				</tr>
				<tr>
					<th>업체 담당자 이름</th>
					<td>${detail2.explorationManaName }</td>
				</tr>
				<tr>
					<th>업체 방문 가능시간</th>
					<td>${detail2.explorationAvailTime }시</td>
				</tr>
				<tr>
					<th>업체 사용가능 날짜</th>
					<td>${detail2.explorationAvailDate }</td>
				</tr>
				<tr>
					<th>공휴일 사용 가능 여부</th>
					<td>${detail2.explorationAvailHoli }</td>
				</tr>
				<tr>
					<th>업체 방문 제한 나이</th>
					<td>${detail2.explorationLimitAge }세</td>
				</tr>
				<tr>
					<th>업체 방문 제한 인원</th>
					<td>${detail2.explorationLimitPer }명</td>
				</tr>
				<tr>
					<th>업체 방문 제한 조건</th>
					<td>${detail2.explorationCondition }</td>
				</tr>
				<tr>
					<th>증빙자료</th>
					<td>${detail2.explorationFile }</td>
				</tr>
				<tr>
					<th>제출여부</th>
					<td>${detail2.explorationSubmit }</td>
				</tr>


			</table>
		</div>
	</thead>
	<br />
	<div class="w3-container " style="margin-left: 43%;">
		<a
			href="http://localhost:8080/geumgang/gwanri/agreementConditionWrite"
			class="w3-btn w3-green">계약서 작성</a>
	</div>

</body>
</html>