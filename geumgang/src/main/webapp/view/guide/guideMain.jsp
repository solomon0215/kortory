<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
    x.previousElementSibling.className += " w3-pink";
  } else { 
    x.className = x.className.replace(" w3-show", "");
    x.previousElementSibling.className = 
    x.previousElementSibling.className.replace(" w3-pink", "");
  }
}

</script>

<body>
<!-- Navigation bar -->
<div class="w3-bar w3-pale-red">
  <a href="#" class="w3-bar-item w3-button"><i class="fa fa-home"></i></a>
  <a href="#" class="w3-bar-item w3-button">ㅇㅅㅇ</a>
  <a href="guideLogout" class="w3-bar-item w3-button w3-right">로그아웃</a>
</div>
<!-- Sidebar -->
<div class="w3-sidebar w3-light-grey w3-bar-block" style="width:10%">

  <h3 class="w3-bar-item">업무목록</h3>
   <button class="w3-button w3-block w3-left-align" onclick="myAccFunc()">
  행사일정 <i class="fa fa-caret-down"></i>
  </button>
  <div id="demoAcc" class="w3-hide w3-white w3-card">
    <a href="#" class="w3-bar-item w3-button">참여 행사 목록</a>
      <a href="#" class="w3-bar-item w3-button">예정 행사 일정</a>
  </div>
  <button class="w3-button w3-block w3-left-align" onclick="myAccFunc()">
  교육일정<i class="fa fa-caret-down"></i>
  </button>
  <div id="demoAcc" class="w3-hide w3-white w3-card">
    <a href="#" class="w3-bar-item w3-button">완료 교육 목록</a>
    <a href="#" class="w3-bar-item w3-button">예정 교육 일정</a>
  </div>
  <button class="w3-button w3-block w3-left-align" onclick="myAccFunc()">
  서류관련 <i class="fa fa-caret-down"></i>
  </button>
  <div id="demoAcc" class="w3-hide w3-white w3-card">
    <a href="#" class="w3-bar-item w3-button">지출 내역 전송</a>
  </div>
  <div class="w3-button w3-block w3-left-align">
  <!-- <button class="w3-button w3-block w3-left-align" onclick="myAccFunc()">
  설문조사<i class="fa fa-caret-down"></i>
  </button>
  <div id="demoAcc" class="w3-hide w3-white w3-card"> -->
    <a href="#" class="w3-bar-item w3-button">설문조사</a>
  </div>
 </div> 
<!-- Page Content -->
<div style="margin-left:15%">
<div class="w3-container w3-white">
  <h2>가이드 메인</h2>
</div>
</div>

</body>
</html>