<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://fonts.googleapis.com/css?family=Single+Day&display=swap" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Gugi|Yeon+Sung&display=swap" rel="stylesheet">
<style>
.w3-myfont {
  font-family: 'Single Day', cursive;
}
.w3-min{
	font-family: 'Yeon Sung', cursive;
	font-family: 'Gugi', cursive;
}
h2{
	color:  #696463;
}
</style>
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript">
	$(function(){
		if(${msg != null}){
			$("#fileWarning").html('${msg}');
			$("#fileWarning").focus();
		}
		
	});
</script>
</head>
<body>
<div class="w3-container" style="margin-top: 5%;">
	<h2 class="w3-myfont w3-center">작성 해보도록 할까요?</h2>
	<br>
	<div class="w3-container w3-margin">
		<form:form action="incomExpWritePro" method="POST" 
		commandName="explorIncomWriteCommand" enctype="multipart/form-data">
		
		<table class="w3-table-all w3-tiny w3-centered">
			<thead>
			    <tr class="w3-dark-gray">
			      <th style="width:20%;">항목</th><th>내용</th>
			    </tr>
		    </thead>
		    <tbody>
		    	<tr class="w3-gray">
		    		<td>보고서 번호</td>
		    		<td class="w3-light-gray">
		    			${detail.explorationNum}
		    			<form:hidden path="explorationNum" value="${detail.explorationNum}"/>
		    		</td>
		    	</tr>
		    	<tr class="w3-gray">
			      <td>사업자 번호</td><td class="w3-light-gray">${detail.companyRegNum}</td>
			    </tr>
			    <tr class="w3-gray">
			      <td>업체 이름</td><td class="w3-light-gray">${detail.companyName}</td>
			    </tr>
			    <tr class="w3-gray">
			      <td>업체 주소</td><td class="w3-light-gray">${detail.companyAddr}</td>
			    </tr>
			    <tr class="w3-gray">
			      <td>공기업 여부</td><td class="w3-light-gray">${detail.companyType}</td>
			    </tr>
				<tr class="w3-gray">
					<td>업체유형</td>
					<td>
						<form:select path="explorationType" style="width:100%;">
							<form:option value="0" label="------업체 유형 선택------"/>
							<form:option value="관광" label="관광업체"/>
							<form:option value="숙박" label="숙박업체"/>
							<form:option value="이동" label="이동업체"/>
						</form:select>
						<form:errors path="explorationType" class="w3-text-red"/>
					</td>
					
				</tr>
				<tr class="w3-gray">
					<td>방문예정일</td><td class="w3-light-gray">${detail.explorationSchedule}</td>
				</tr>
				<tr class="w3-gray">
					<td>방문실시일</td>
					<td>
						<form:input path="explorationEffect" style="width:100%" type="date"/>
						<form:errors path="explorationEffect" class="w3-text-red"/>
					</td>
				</tr>
				<tr class="w3-gray">
					<td>업체 담당자 이름</td>
					<td>
						<form:input path="explorationManaName" style="width:100%;"/>
						<form:errors path="explorationManaName" class="w3-text-red"/>
					</td>
				</tr>
				<tr class="w3-gray">
					<td>업체 방문 가능시간</td>
					<td>
						<form:input path="startTime" style="width:46%;" type="number"/>시 ~ <form:input path="endTime" style="width:46%;" type="number"/>시
						<form:errors path="startTime" class="w3-text-red"/>
						<form:errors path="endTime" class="w3-text-red"/>
					</td>
				</tr>
				<tr class="w3-gray">
					<td>업체 사용가능 날짜</td>
					<td>
						<form:input path="startDate" style="width:48%;" type="date"/> ~ <form:input path="endDate" style="width:48%;" type="date"/>
						<form:errors path="startDate" class="w3-text-red"/>
						<form:errors path="endDate" class="w3-text-red"/>
					</td>
				</tr>
				<tr class="w3-gray">
					<td>공휴일 사용 가능 여부</td>
					<td>
						<div>
							<label>YES</label>
							<form:radiobutton path="explorationAvailHoli" value="YES" checked="checked"/>
						</div>
						<div>
							<label>NO</label>
							<form:radiobutton path="explorationAvailHoli" value="NO"/>
						</div>
					</td>
				</tr>
				<tr class="w3-gray">
					<td>업체 방문 제한 나이<br>(없으면 '0'으로)</td>
					<td>
						만 <form:input path="explorationLimitAge" style="width:80%;"  type="number"/>세 이상
						<form:errors path="explorationLimitAge" class="w3-text-red"/>
					</td>
				</tr>
				<tr class="w3-gray">
					<td>업체 방문 제한 인원</td>
					<td>
						<form:input path="explorationLimitPer" style="width:90%;" type="number"/>명 이하
						<form:errors path="explorationLimitPer" class="w3-text-red"/>
					</td>
				</tr>
				<tr class="w3-gray">
					<td>업체 방문 제한 조건</td>
					<td>
						<form:textarea path="explorationCondition" style="width:100%;" cols="15" rows="30"/>
						<form:errors path="explorationCondition" class="w3-text-red"/>
					</td>
				</tr>
				<tr class="w3-gray">
					<td>증빙자료 </td>
					<td>
						<label class="w3-left">증빙자료 파일은 jpg/png 파일로 제한 됩니다.</label>
						<input type="file" name="picture" multiple = "multiple" style="width:100%;" />
						<div class="w3-text-red" id="fileWarning"></div>
					</td>
				</tr>
				<tr class="w3-gray">
					<td>제출/임시보관 선택</td>
					<td>
						<form:select path="choise" value="1" style="width:100%;">
							<form:option value="0" label="------저장 종류 선택------"/>
							<form:option value="1" label="제출"/>
							<form:option value="2" label="임시보관"/>
						</form:select>
						<form:errors path="choise" class="w3-text-red"/>
					</td>
				</tr>
		    </tbody>
		</table>
		<div class="w3-center">
			<button class="w3-button w3-white w3-border w3-hover-amber" type="submit">제출하기</button>
		</div>
		</form:form>
	</div>
	<br>
	<br>
	<br>
</div>
</body>
</html>