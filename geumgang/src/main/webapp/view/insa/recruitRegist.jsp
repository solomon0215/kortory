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
</head>
<script>
function myAccFunc() {
  var x = document.getElementById("demoAcc");
  if (x.className.indexOf("w3-show") == -1) {
    x.className += " w3-show";
    x.previousElementSibling.className += " w3-green";
  } else { 
    x.className = x.className.replace(" w3-show", "");
    x.previousElementSibling.className = 
    x.previousElementSibling.className.replace(" w3-green", "");
  }
}

</script>

<body>
<!-- Navigation bar -->
<div class="w3-bar w3-teal">
  <a href="#" class="w3-bar-item w3-button"><i class="fa fa-home"></i></a>
  <a href="#" class="w3-bar-item w3-button">기획부</a>
  <a href="#" class="w3-bar-item w3-button">영업부</a>
  <a href="#" class="w3-bar-item w3-button">관리부</a>
  <a href="logout" class="w3-bar-item w3-button w3-right">로그아웃</a>
</div>
<!-- Sidebar -->
<div class="w3-sidebar w3-light-grey w3-bar-block" style="width:10%">
  <h3 class="w3-bar-item">업무목록</h3>
   <button class="w3-button w3-block w3-left-align" onclick="myAccFunc()">
  사원채용 <i class="fa fa-caret-down"></i>
  </button>
  <div id="demoAcc" class="w3-hide w3-white w3-card">
    <a href="#" class="w3-bar-item w3-button">채용공고 작성</a>
  </div>
  <button class="w3-button w3-block w3-left-align" onclick="myAccFunc()">
  사원정보 <i class="fa fa-caret-down"></i>
  </button>
  <div id="demoAcc" class="w3-hide w3-white w3-card">
    <a href="#" class="w3-bar-item w3-button">근로계약서 열람</a>
    <a href="#" class="w3-bar-item w3-button">인사고과 열람</a>
  </div>
  <button class="w3-button w3-block w3-left-align" onclick="myAccFunc()">
  사원교육 <i class="fa fa-caret-down"></i>
  </button>
  <div id="demoAcc" class="w3-hide w3-white w3-card">
    <a href="#" class="w3-bar-item w3-button">기초교육안 작성</a>
    <a href="#" class="w3-bar-item w3-button">행사교육안 작성</a>
  </div>
  <button class="w3-button w3-block w3-left-align" onclick="myAccFunc()">
  사원배치 <i class="fa fa-caret-down"></i>
  </button>
  <div id="demoAcc" class="w3-hide w3-white w3-card">
    <a href="#" class="w3-bar-item w3-button">행사일정 확인 및 배치</a>
  </div>
  <button class="w3-button w3-block w3-left-align" onclick="myAccFunc()">
  사원평가 <i class="fa fa-caret-down"></i>
  </button>
  <div id="demoAcc" class="w3-hide w3-white w3-card">
    <a href="#" class="w3-bar-item w3-button">인사고과 작성</a>
    <a href="#" class="w3-bar-item w3-button">사원 평가서 열람</a>
  </div>
  <button class="w3-button w3-block w3-left-align" onclick="myAccFunc()">
  고객평가 <i class="fa fa-caret-down"></i>
  </button>
  <div id="demoAcc" class="w3-hide w3-white w3-card">
    <a href="#" class="w3-bar-item w3-button">고객평가서 작성</a>
    <a href="#" class="w3-bar-item w3-button">고객평가서 열람</a>
  </div>
</div>
<!-- Page Content -->
<form:form class="w3-container w3-card-4 w3-light-grey" style="margin-left:193px"
commandName="recruitRegiCommand" id="frm" action="recruitRegiPro" method="POST" >
		<h2 class="w3-center">채용공고 작성</h2>
		<p>
			<label class="w3-text-grey">업무내용</label>
			<form:textarea path="regiContent" class="w3-input w3-border" cols="50" rows="5"/>
		</p>
		<p>
			<label class="w3-text-grey">우대사항</label>
			<form:textarea path="regiPrefer" class="w3-input w3-border" cols="50" rows="5"/>
		</p>
		<p>
			<label class="w3-text-grey">모집인원</label>
			 <form:input path="regiPersonnel"
				class="w3-input w3-border w3-white" type="text"
				onKeyup="this.value=this.value.replace(/[^0-9]/g,'');" />
		</p>
		<p>
			<label class="w3-text-grey">지원자격</label>
			<form:textarea path="regiQual" class="w3-input w3-border" cols="50" rows="5"/>
		</p>
		<p>
			<label class="w3-text-grey">등록일자</label> 
			<form:input path="regiDate" class="w3-input w3-border w3-white" type="date" />
		</p>
		<p>
			<label class="w3-text-grey">마감일자</label>
			<form:input path="endDate" class="w3-input w3-border w3-white" type="date" />
		</p>
		<p>
			<label class="w3-text-grey">급여(숫자만 입력)</label>
			 <form:input path="regiCost"
				class="w3-input w3-border w3-white" type="text"
				onKeyup="this.value=this.value.replace(/[^0-9]/g,'');" />
		</p>
		<p>
			<label class="w3-text-grey">직원번호</label> 
			<form:input path="inSaNum" class="w3-input w3-border w3-white" type="text"/>
		</p>

		<br />
		<div class="w3-center">
			<div class="w3-bar">
				<input  class="w3-button w3-teal" type="reset" value="취소" />
			    <button class="w3-button w3-teal" id="regist">등록</button>
			</div>
		</div>
</form:form>
</body>
</html>

