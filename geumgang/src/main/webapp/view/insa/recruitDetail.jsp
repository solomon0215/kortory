<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body,h1,h2,h3,h4,h5 {font-family: "Raleway", sans-serif}

* {
  box-sizing: border-box; width: 92%;
}
.container {
  border-radius: 5px;
  background-color: #f2f2f2;
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
<div class="container">
  <div class="row">
    <div class="col-30">
      <label for="egName"><b>채용공고 번호</b></label>
    </div>
    <div class="col-70">
      <input type="text" id="egName" name="egName" placeholder="채용공고 번호">
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="egPlanNum"><b>제목</b></label>
    </div>
    <div class="col-70">
     <input type="text" id="egName" name="egName" placeholder="제목">
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="egExp"><b>업무내용</b></label>
    </div>
    <div class="col-70">
      <textarea id="egExp" name="egExp" style="height:200px" placeholder="업무내용"></textarea>
    </div>
  </div>
 <div class="row">
    <div class="col-30">
      <label for="egExp"><b>우대사항</b></label>
    </div>
    <div class="col-70">
      <textarea id="egExp" name="egExp" style="height:200px" placeholder="우대사항"></textarea>
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="egName"><b>모집인원</b></label>
    </div>
    <div class="col-70">
      <input type="text" id="egName" name="egName" placeholder="모집인원">
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="egExp"><b>지원자격</b></label>
    </div>
    <div class="col-70">
      <textarea id="egExp" name="egExp" style="height:200px" placeholder="지원자격"></textarea>
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="egName"><b>등록일자</b></label>
    </div>
    <div class="col-70">
      <input type="text" id="egName" name="egName" placeholder="등록일자">
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="egName"><b>마감일자</b></label>
    </div>
    <div class="col-70">
      <input type="text" id="egName" name="egName" placeholder="마감일자">
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="egName"><b>연봉</b></label>
    </div>
    <div class="col-70">
      <input type="text" id="egName" name="egName" placeholder="연봉">
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="egName"><b>직원번호</b></label>
    </div>
    <div class="col-70">
      <input type="text" id="egName" name="egName" placeholder="직원번호">
    </div>
  </div>
  <div class="row">
  <div class="col-rg">
    <input type="submit" value="등록">
    </div>
  </div>
  </div>
</form>
</body>
</html>