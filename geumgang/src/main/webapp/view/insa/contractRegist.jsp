<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>Insert title here</title>
<script type="text/javascript">
function showPopup() { window.open("#", "a", "width=400, height=300, left=100, top=50"); }
</script>
</head>
	<body>
<form:form class="w3-container w3-card-4 w3-white" style="margin-left:182.5px"
commandName="cc" id="frm" action="contractRegiPro" method="POST" >
		<h2 class="w3-center">근로계약서 작성</h2>
		<p>
			<label class="w3-text-grey">회사명</label>
			<form:input path="conCompany" class="w3-input w3-border w3-white" />
		</p>
		<p>
			<label class="w3-text-grey">회사 전화번호</label>
			<form:input path="conPh" class="w3-input w3-border w3-white"/>
		</p>
		<p>
			<label class="w3-text-grey">회사 소재지</label>
			<form:input path="conLocation" class="w3-input w3-border w3-white"/>
		</p>
		<p>
			<label class="w3-text-grey">대표자명</label>
			<form:input path="conCeo" class="w3-input w3-border w3-white"/>
		</p>
		<p>
			<label class="w3-text-grey">사업자 등록번호</label>
			<form:input path="conRegiNum" class="w3-input w3-border w3-white" />
		</p>
		<p>
			<label class="w3-text-grey">근로계약 시작일</label> 
			<input type="date" name="conStart" class="w3-input w3-border w3-white" style="width: 30%" />
		    &nbsp;&nbsp;&nbsp;&nbsp;
			<label class="w3-text-grey">근로계약 만료일</label>
			<input type="date" name="conEnd" class="w3-input w3-border w3-white" style="width: 30%" />
		</p>
		<p>
			<label class="w3-text-grey">연봉(숫자만 입력)</label>
			 <form:input path="conSalary"
				class="w3-input w3-border w3-white"  value=""
				onKeyup="this.value=this.value.replace(/[^0-9]/g,'');" />
		</p>
		<p>
			<label class="w3-text-grey">인센티브(숫자만 입력)</label>
			 <form:input path="conIncentive"
				class="w3-input w3-border w3-white"  value=""
				onKeyup="this.value=this.value.replace(/[^0-9]/g,'');" />
		</p>
		<p>
			<label class="w3-text-grey">업무내용</label>
			<form:textarea path="conDetail" class="w3-input w3-border" cols="50" rows="5"/>
		</p>
		<p>
			<label class="w3-text-grey">이력서 번호(숫자만 입력)</label>
			 <form:input path="resumeNum"
				class="w3-input w3-border w3-white"  value="1"
				onKeyup="this.value=this.value.replace(/[^0-9]/g,'');" />
		</p>
		<p>
			<label class="w3-text-grey">회원 아이디</label>
			<form:input path="userId" class="w3-input w3-border w3-white" />
		</p>
		<br />
		<div class="w3-center">
			<div class="w3-bar">
				<input  class="w3-button w3-yellow" type="reset" value="다시 작성" />
			    <button class="w3-button w3-teal" id="regist">등록</button>
			</div>
		</div>
</form:form>
</body>
</html>

