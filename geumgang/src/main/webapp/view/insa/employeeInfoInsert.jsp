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
function myAccFunc1() {
  var x = document.getElementById("demoAcc1");
  if (x.className.indexOf("w3-show") == -1) {
    x.className += " w3-show";
    x.previousElementSibling.className += " w3-light-blue";
  } else { 
    x.className = x.className.replace(" w3-show", "");
    x.previousElementSibling.className = 
    x.previousElementSibling.className.replace(" w3-light-blue", "");
  }
}
function myAccFunc2() {
	  var x = document.getElementById("demoAcc2");
	  if (x.className.indexOf("w3-show") == -1) {
	    x.className += " w3-show";
	    x.previousElementSibling.className += " w3-light-blue";
	  } else { 
	    x.className = x.className.replace(" w3-show", "");
	    x.previousElementSibling.className = 
	    x.previousElementSibling.className.replace(" w3-light-blue", "");
	  }
	}
function myAccFunc3() {
	  var x = document.getElementById("demoAcc3");
	  if (x.className.indexOf("w3-show") == -1) {
	    x.className += " w3-show";
	    x.previousElementSibling.className += " w3-light-blue";
	  } else { 
	    x.className = x.className.replace(" w3-show", "");
	    x.previousElementSibling.className = 
	    x.previousElementSibling.className.replace(" w3-light-blue", "");
	  }
	}
function myAccFunc4() {
	  var x = document.getElementById("demoAcc4");
	  if (x.className.indexOf("w3-show") == -1) {
	    x.className += " w3-show";
	    x.previousElementSibling.className += " w3-light-blue";
	  } else { 
	    x.className = x.className.replace(" w3-show", "");
	    x.previousElementSibling.className = 
	    x.previousElementSibling.className.replace(" w3-light-blue", "");
	  }
	}
function myAccFunc5() {
	  var x = document.getElementById("demoAcc5");
	  if (x.className.indexOf("w3-show") == -1) {
	    x.className += " w3-show";
	    x.previousElementSibling.className += " w3-light-blue";
	  } else { 
	    x.className = x.className.replace(" w3-show", "");
	    x.previousElementSibling.className = 
	    x.previousElementSibling.className.replace(" w3-light-blue", "");
	  }
	}
function myAccFunc6() {
	  var x = document.getElementById("demoAcc6");
	  if (x.className.indexOf("w3-show") == -1) {
	    x.className += " w3-show";
	    x.previousElementSibling.className += " w3-light-blue";
	  } else { 
	    x.className = x.className.replace(" w3-show", "");
	    x.previousElementSibling.className = 
	    x.previousElementSibling.className.replace(" w3-light-blue", "");
	  }
	}
</script>

<body>
<!-- Navigation bar -->
<div class="w3-bar w3-cyan">
  <a href="#" class="w3-bar-item w3-button"><i class="fa fa-home"></i></a>
  <a href="#" class="w3-bar-item w3-button">기획부</a>
  <a href="#" class="w3-bar-item w3-button">영업부</a>
  <a href="#" class="w3-bar-item w3-button">관리부</a>
  <a href="logout" class="w3-bar-item w3-button w3-right">로그아웃</a>
</div>
<!-- Sidebar -->
<div class="w3-sidebar w3-light-grey w3-bar-block" style="width:13%">

  <h3 class="w3-bar-item">업무목록</h3>
   <button class="w3-button w3-block w3-left-align" onclick="myAccFunc1()">
  사원채용 <i class="fa fa-caret-down"></i>
  </button>
  <div id="demoAcc1" class="w3-hide w3-white w3-card">
    <a href="recruitReg" class="w3-bar-item w3-button">채용공고 작성</a>
  </div>
  <button class="w3-button w3-block w3-left-align" onclick="myAccFunc2()">
  사원정보 <i class="fa fa-caret-down"></i>
  </button>
  <div id="demoAcc2" class="w3-hide w3-white w3-card">
    <a href="#" class="w3-bar-item w3-button">사원정보 등록</a>
    <a href="#" class="w3-bar-item w3-button">근로계약서 열람</a>
    <a href="#" class="w3-bar-item w3-button">인사고과 열람</a>
  </div>
  <button class="w3-button w3-block w3-left-align" onclick="myAccFunc3()">
  사원교육 <i class="fa fa-caret-down"></i>
  </button>
  <div id="demoAcc3" class="w3-hide w3-white w3-card">
    <a href="#" class="w3-bar-item w3-button">기초교육안 작성</a>
    <a href="#" class="w3-bar-item w3-button">행사교육안 작성</a>
  </div>
  <button class="w3-button w3-block w3-left-align" onclick="myAccFunc4()">
  사원배치 <i class="fa fa-caret-down"></i>
  </button>
  <div id="demoAcc4" class="w3-hide w3-white w3-card">
    <a href="#" class="w3-bar-item w3-button">행사일정 확인 및 배치</a>
  </div>
  <button class="w3-button w3-block w3-left-align" onclick="myAccFunc5()">
  사원평가 <i class="fa fa-caret-down"></i>
  </button>
  <div id="demoAcc5" class="w3-hide w3-white w3-card">
    <a href="#" class="w3-bar-item w3-button">인사고과 작성</a>
    <a href="#" class="w3-bar-item w3-button">사원 평가서 열람</a>
  </div>
  <button class="w3-button w3-block w3-left-align" onclick="myAccFunc6()">
  고객평가 <i class="fa fa-caret-down"></i>
  </button>
  <div id="demoAcc6" class="w3-hide w3-white w3-card">
    <a href="#" class="w3-bar-item w3-button">고객평가서 작성</a>
    <a href="#" class="w3-bar-item w3-button">고객평가서 열람</a>
  </div>
</div>
<!-- Page Content -->
<form:form class="w3-container w3-card-4 w3-white" style="margin-left:175px"
commandName="employeeCommand" id="frm" action="employeeRegiPro" method="POST" >
		<h2 class="w3-center">사원 등록</h2>
		<p>
			<label class="w3-text-grey">직원번호</label>
			<form:input path="employeeNum" class="w3-input w3-border w3-white"  type="text" />
		</p>
		<p>
			<label class="w3-text-grey">아이디</label>
			<form:input path="employeeId" class="w3-input w3-border w3-white"  type="text" />
		</p>
		<p>
			<label class="w3-text-grey">비밀번호</label>
			 <form:input path="employeePw" class="w3-input w3-border w3-white"  type="text" />
		</p>
		<p>
			<label class="w3-text-grey">비밀번호 확인</label>
			<form:input path="employeePwCon" class="w3-input w3-border w3-white"  type="text" />
		</p>
		<p>
			<label class="w3-text-grey">입사일</label> 
			<form:input path="employeeRegist" class="w3-input w3-border w3-white"  type="text" />
		</p>
		<p>
			<label class="w3-text-grey">이름</label>
			<form:input path="employeeName" class="w3-input w3-border w3-white" type="text" />
		</p>
		<p>
			<label class="w3-text-grey">생년월일</label>
			<form:input path="employeeBirth" class="w3-input w3-border w3-white" type="text" />
		</p>
		<p>
			<label class="w3-text-grey">전자메일</label> 
			<form:input path="employeeEmail" class="w3-input w3-border w3-white" type="text" />
		</p>
		<p>
			<label class="w3-text-grey">성별</label> 
			<form:input path="employeeGender" class="w3-input w3-border w3-white" type="text" />
		</p>
		<p>
			<label class="w3-text-grey">전화번호</label> 
			<form:input path="employeePh" class="w3-input w3-border w3-white" type="text" />
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