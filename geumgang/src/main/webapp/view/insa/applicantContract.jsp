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
<title>근로계약서 상세보기</title>
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
<div class="container" style="margin-left:18%">
  <div class="row">
    <div class="col-30">
      <label for="recruitNum"><b>근로계약서 번호</b></label>
    </div>
    <div class="col-70">
    <textarea style="height:50px; resize:none;" readonly>${con.conNum}</textarea>
    </div>
  </div>
   <div class="row">
    <div class="col-30">
      <label for="recruitNum"><b>회사명</b></label>
    </div>
    <div class="col-70">
    <textarea style="height:50px; resize:none;" readonly>${con.conCompany}</textarea>
    </div>
  </div>
   <div class="row">
    <div class="col-30">
      <label for="recruitNum"><b>회사 전화번호</b></label>
    </div>
    <div class="col-70">
    <textarea style="height:50px; resize:none;" readonly>${con.conPh}</textarea>
    </div>
  </div>
   <div class="row">
    <div class="col-30">
      <label for="recruitNum"><b>회사 소재지</b></label>
    </div>
    <div class="col-70">
    <textarea style="height:50px; resize:none;" readonly>${con.conLocation}</textarea>
    </div>
  </div>
   <div class="row">
    <div class="col-30">
      <label for="recruitNum"><b>대표자명</b></label>
    </div>
    <div class="col-70">
    <textarea style="height:50px; resize:none;" readonly>${con.conCeo}</textarea>
    </div>
  </div>
   <div class="row">
    <div class="col-30">
      <label for="recruitNum"><b>사업자 등록번호</b></label>
    </div>
    <div class="col-70">
    <textarea style="height:50px; resize:none;" readonly>${con.conRegiNum}</textarea>
    </div>
  </div>
   <div class="row">
    <div class="col-30">
      <label for="recruitNum"><b>근로계약 시작일</b></label>
    </div>
    <div class="col-70">
    <textarea style="height:50px; resize:none;" readonly>${con.conStart}</textarea>
    </div>
  </div>
   <div class="row">
    <div class="col-30">
      <label for="recruitNum"><b>근로계약 만료일</b></label>
    </div>
    <div class="col-70">
    <textarea style="height:50px; resize:none;" readonly>${con.conEnd}</textarea>
    </div>
  </div>
   <div class="row">
    <div class="col-30">
      <label for="recruitNum"><b>연봉</b></label>
    </div>
    <div class="col-70">
    <textarea style="height:50px; resize:none;" readonly>${con.conSalary}</textarea>
    </div>
  </div>
   <div class="row">
    <div class="col-30">
      <label for="recruitNum"><b>인센티브</b></label>
    </div>
    <div class="col-70">
    <textarea style="height:50px; resize:none;" readonly>${con.conIncentive}</textarea>
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="egExp"><b>업무내용</b></label>
    </div>
    <div class="col-70">
      <textarea style="height:200px" readonly>${con.conDetail}</textarea>
    </div>
  </div>
    <div class="row">
    <div class="col-30">
      <label for="recruitNum"><b>이력서 번호</b></label>
    </div>
    <div class="col-70">
    <textarea style="height:50px; resize:none;" readonly>${resumeNum}</textarea>
    </div>
  </div>
    <div class="row">
    <div class="col-30">
      <label for="recruitNum"><b>회원 아이디</b></label>
    </div>
    <div class="col-70">
    <textarea style="height:50px; resize:none;" readonly>${UserId}</textarea>
    </div>
  </div>
 <div class="w3-center">
			<div class="w3-bar" style="margin-top: 20px">
				<a href="#">
					<button class="w3-bar-item w3-button w3-teal" id="confirm" style="margin-right: 10px">확인</button>
				</a>
				<button class="w3-bar-item w3-button w3-red" id="refuse">거절</button>
			</div>
		</div>
</form>
</body>
</html>