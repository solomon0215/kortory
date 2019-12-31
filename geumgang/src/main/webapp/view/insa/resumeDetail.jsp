<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>채용공고 상세보기</title>
<style>
body,h1,h2,h3,h4,h5 {font-family: "Raleway", sans-serif}

* {
  box-sizing: border-box; width: 92%;
}
.container {
  border-radius: 5px;
  background-color: #f2f2f2;
  width: 100%;
  padding: 20px;
}
.row:after {
  content: "";
  display: table;
  clear: both;
}
.col-30 {
  float: left;
  width: 30%;
  margin-top: 6px;
}

.col-70 {
  float: left;
  width: 70%;
  margin-top: 8px;
}

.col-rg {
  float: right;
  width: 20%;
  margin-top: 6px;
}

label {
  padding: 12px 12px 12px 0;
  display: inline-block;
}

input[type=text], select, textarea {
  width: 100%;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 4px;
  resize: vertical;
}

input[type=checkbox] {
margin-top: 10px;
  width: 5%;
   display: inline-block;
}

input[type=date] {
margin-top: 10px;
  width: 42%;
   display: inline-block;
}

input:focus {
  border: 2px solid #555;
}

textarea:focus {
border: 2px solid #555;
}


input[type=submit] {
  background-color: #ff4500;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  float: right;
}

input[type=submit]:hover {
  background-color: #45a049;
}

ul{
   list-style:none;
   }
</style>
</head>
<body>
<!-- PAGE CONTENT -->
<form action="#">
<div class="container" style="margin-left:17.1%">
  <div class="row">
    <div class="col-30">
      <label for="recruitNum"><b>국적</b></label>
    </div>
    <div class="col-70">
    <textarea style="height:50px; resize:none;" readonly>${detail.resumeNational}</textarea>
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="recruitTitle"><b>보훈대상여부</b></label>
    </div>
    <div class="col-70">
     <textarea style="height:50px; resize:none;" readonly>${detail.resumeBohun}</textarea>
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="recruitTitle"><b>장애여부</b></label>
    </div>
    <div class="col-70">
     <textarea style="height:50px; resize:none;" readonly>${detail.resumeDisorder}</textarea>
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="recruitTitle"><b>병역여부</b></label>
    </div>
    <div class="col-70">
     <textarea style="height:50px; resize:none;" readonly>${detail.resumeArmy}</textarea>
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="recruitTitle"><b>고등학교</b></label>
    </div>
    <div class="col-70">
     <textarea style="height:50px; resize:none;" readonly>${detail.resumeHighschool}</textarea>
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="recruitTitle"><b>입학일자</b></label>
    </div>
    <div class="col-70">
     <textarea style="height:50px; resize:none;" readonly>${detail.schoolStart1}</textarea>
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="recruitTitle"><b>졸업일자</b></label>
    </div>
    <div class="col-70">
     <textarea style="height:50px; resize:none;" readonly>${detail.schoolEnd1}</textarea>
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="recruitTitle"><b>대학교</b></label>
    </div>
    <div class="col-70">
     <textarea style="height:50px; resize:none;" readonly>${detail.resumeUnivercity}</textarea>
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="recruitTitle"><b>전공</b></label>
    </div>
    <div class="col-70">
     <textarea style="height:50px; resize:none;" readonly>${detail.resumeMajor}</textarea>
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="recruitTitle"><b>학점</b></label>
    </div>
    <div class="col-70">
     <textarea style="height:50px; resize:none;" readonly>${detail.resumePoint}</textarea>
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="recruitTitle"><b>입학일자</b></label>
    </div>
    <div class="col-70">
     <textarea style="height:50px; resize:none;" readonly>${detail.schoolStart2}</textarea>
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="recruitTitle"><b>졸업일자</b></label>
    </div>
    <div class="col-70">
     <textarea style="height:50px; resize:none;" readonly>${detail.schoolEnd2}</textarea>
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="recruitTitle"><b>해외거주경험</b></label>
    </div>
    <div class="col-70">
     <textarea style="height:50px; resize:none;" readonly>${detail.resumeExpOver}</textarea>
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="recruitTitle"><b>어학시험종목</b></label>
    </div>
    <div class="col-70">
     <textarea style="height:50px; resize:none;" readonly>${detail.resumeLanguage}</textarea>
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="recruitTitle"><b>어학시험점수</b></label>
    </div>
    <div class="col-70">
     <textarea style="height:50px; resize:none;" readonly>${detail.resumeGrade}</textarea>
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="recruitTitle"><b>자격면허사항</b></label>
    </div>
    <div class="col-70">
     <textarea style="height:50px; resize:none;" readonly>${detail.resumeLicense}</textarea>
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="recruitTitle"><b>전 근무처</b></label>
    </div>
    <div class="col-70">
     <textarea style="height:50px; resize:none;" readonly>${detail.formerWork}</textarea>
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="recruitTitle"><b>직위</b></label>
    </div>
    <div class="col-70">
     <textarea style="height:50px; resize:none;" readonly>${detail.formerPosition}</textarea>
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="recruitTitle"><b>입사일</b></label>
    </div>
    <div class="col-70">
     <textarea style="height:50px; resize:none;" readonly>${detail.formerStart}</textarea>
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="recruitTitle"><b>퇴사일</b></label>
    </div>
    <div class="col-70">
     <textarea style="height:50px; resize:none;" readonly>${detail.formerEnd}</textarea>
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="recruitTitle"><b>연봉</b></label>
    </div>
    <div class="col-70">
     <textarea style="height:50px; resize:none;" readonly>${detail.formerSalary}</textarea>
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="recruitTitle"><b>담당업무</b></label>
    </div>
    <div class="col-70">
     <textarea style="height:50px; resize:none;" readonly>${detail.formerTask}</textarea>
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="recruitTitle"><b>경력소개</b></label>
    </div>
    <div class="col-70">
     <textarea style="height:50px; resize:none;" readonly>${detail.formerIntro}</textarea>
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="egExp"><b>성장과정</b></label>
    </div>
    <div class="col-70">
      <textarea style="height:200px" readonly>${detail.resumeGrow}</textarea>
    </div>
  </div>
 <div class="row">
    <div class="col-30">
      <label for="egExp"><b>장점</b></label>
    </div>
    <div class="col-70">
      <textarea style="height:200px" readonly>${detail.resumeGood}</textarea>
    </div>
  </div>
	<div class="row">
    <div class="col-30">
      <label for="egExp"><b>단점</b></label>
    </div>
    <div class="col-70">
      <textarea style="height:200px" readonly>${detail.resumeBad}</textarea>
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="recruitTitle"><b>개인정보수집 동의여부</b></label>
    </div>
    <div class="col-70">
     <textarea style="height:50px; resize:none;" readonly>${detail.resumePerInfo}</textarea>
    </div>
  </div>
 <div class="w3-center">
			<div class="w3-bar" style="margin-top: 20px">
				<a href="sendEmail">
					<button class="w3-bar-item w3-button w3-teal" id="email" style="margin-right: 10px">합격 통보</button>
				</a>
			</div>	
		</div>
		
</form>
</body>
</html>