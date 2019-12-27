<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>Insert title here</title>
<script>
function myAccFunc1() {
  var x = document.getElementById("demoAcc1");
  if (x.className.indexOf("w3-show") == -1) {
    x.className += " w3-show";
    x.previousElementSibling.className += " w3-blue-gray";
  } else { 
    x.className = x.className.replace(" w3-show", "");
    x.previousElementSibling.className = 
    x.previousElementSibling.className.replace(" w3-blue-gray", "");
  }
}
function myAccFunc2() {
	  var x = document.getElementById("demoAcc2");
	  if (x.className.indexOf("w3-show") == -1) {
	    x.className += " w3-show";
	    x.previousElementSibling.className += " w3-blue-gray";
	  } else { 
	    x.className = x.className.replace(" w3-show", "");
	    x.previousElementSibling.className = 
	    x.previousElementSibling.className.replace(" w3-blue-gray", "");
	  }
	}
function myAccFunc3() {
	  var x = document.getElementById("demoAcc3");
	  if (x.className.indexOf("w3-show") == -1) {
	    x.className += " w3-show";
	    x.previousElementSibling.className += " w3-blue-gray";
	  } else { 
	    x.className = x.className.replace(" w3-show", "");
	    x.previousElementSibling.className = 
	    x.previousElementSibling.className.replace(" w3-blue-gray", "");
	  }
	}
function myAccFunc4() {
	  var x = document.getElementById("demoAcc4");
	  if (x.className.indexOf("w3-show") == -1) {
	    x.className += " w3-show";
	    x.previousElementSibling.className += " w3-blue-gray";
	  } else { 
	    x.className = x.className.replace(" w3-show", "");
	    x.previousElementSibling.className = 
	    x.previousElementSibling.className.replace(" w3-blue-gray", "");
	  }
	}
function myAccFunc5() {
	  var x = document.getElementById("demoAcc5");
	  if (x.className.indexOf("w3-show") == -1) {
	    x.className += " w3-show";
	    x.previousElementSibling.className += " w3-blue-gray";
	  } else { 
	    x.className = x.className.replace(" w3-show", "");
	    x.previousElementSibling.className = 
	    x.previousElementSibling.className.replace(" w3-blue-gray", "");
	  }
	}
function myAccFunc6() {
	  var x = document.getElementById("demoAcc6");
	  if (x.className.indexOf("w3-show") == -1) {
	    x.className += " w3-show";
	    x.previousElementSibling.className += " w3-blue-gray";
	  } else { 
	    x.className = x.className.replace(" w3-show", "");
	    x.previousElementSibling.className = 
	    x.previousElementSibling.className.replace(" w3-blue-gray", "");
	  }
	}
</script>
</head>
<body>
<div class="w3-bar w3-cyan">
  <a href="main" class="w3-bar-item w3-button"><i class="fa fa-home"></i></a>
  <a href="#" class="w3-bar-item w3-button">기획부</a>
  <a href="#" class="w3-bar-item w3-button">영업부</a>
  <a href="#" class="w3-bar-item w3-button">관리부</a>
  <a href="logout" class="w3-bar-item w3-button w3-right">로그아웃</a>
</div>
<div class="w3-sidebar w3-light-grey w3-bar-block" style="width:13%">
  <h3 class="w3-bar-item">업무목록</h3>
   <button class="w3-button w3-block w3-left-align" onclick="myAccFunc1()">
  사원채용 <i class="fa fa-caret-down"></i>
  </button>
  <div id="demoAcc1" class="w3-hide w3-white w3-card">
    <a href="recruitList" class="w3-bar-item w3-button">채용공고 목록</a>
    <a href="resumeList" class="w3-bar-item w3-button">이력서 확인</a>
    <a href="apply" class="w3-bar-item w3-button">이력서 작성(간이)</a>
  </div>
  <button class="w3-button w3-block w3-left-align" onclick="myAccFunc2()">
  사원정보 <i class="fa fa-caret-down"></i>
  </button>
  <div id="demoAcc2" class="w3-hide w3-white w3-card">
    <a href="employeeInfoInsert" class="w3-bar-item w3-button">사원정보 등록</a>
    <a href="contractList" class="w3-bar-item w3-button">근로계약서 목록</a>
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
<div style="margin-left:1%;height:90%;">
  <jsp:include page="${insaPage}" />
</div>
</body>
</html>