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
      <label for="recruitNum"><b>채용공고 번호</b></label>
    </div>
    <div class="col-70">
    <textarea style="height:50px; resize:none;" readonly>${detail.recruitNum}</textarea>
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="recruitTitle"><b>제목</b></label>
    </div>
    <div class="col-70">
     <textarea style="height:50px; resize:none;" readonly>${detail.recruitTitle}</textarea>
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="egExp"><b>업무내용</b></label>
    </div>
    <div class="col-70">
      <textarea style="height:200px" readonly>${recruitContent}</textarea>
    </div>
  </div>
 <div class="row">
    <div class="col-30">
      <label for="egExp"><b>우대사항</b></label>
    </div>
    <div class="col-70">
      <textarea style="height:200px" readonly>${detail.recruitPrefer}</textarea>
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="egName"><b>모집인원</b></label>
    </div>
    <div class="col-70">
    <textarea style="height:50px; resize:none;" readonly>${detail.recruitPersonnel}</textarea>
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="egExp"><b>지원자격</b></label>
    </div>
    <div class="col-70">
      <textarea style="height:200px" readonly>${detail.recruitQualification}</textarea>
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="egName"><b>등록일자</b></label>
    </div>
    <div class="col-70">
      <textarea style="height:50px; resize:none;" readonly>${detail.recruitRegiDate}</textarea>
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="egName"><b>마감일자</b></label>
    </div>
    <div class="col-70">
      <textarea style="height:50px; resize:none;" readonly>${detail.recruitEndDate}</textarea>
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="egName"><b>연봉</b></label>
    </div>
    <div class="col-70">
      <textarea style="height:50px; resize:none;" readonly>${detail.recruitCost}</textarea>
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="egName"><b>직원번호</b></label>
    </div>
    <div class="col-70">
      <textarea style="height:50px; resize:none;" readonly>${detail.inSaNum}</textarea>
    </div>
  </div>
 <div class="w3-center">
			<div class="w3-bar" style="margin-top: 20px">
				<a href="#">
					<button class="w3-bar-item w3-button w3-teal" id="modify" style="margin-right: 10px">수정</button>
				</a>
				<button class="w3-bar-item w3-button w3-red" id="delete">삭제</button>
			</div>
		</div>
		
</form>
</body>
</html>