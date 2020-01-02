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
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>conceptForm</title>
</head>
<style>
body,h1,h2,h3,h4,h5 {font-family: "Raleway", sans-serif}

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
padding-top: 100px;
width: 20px;
   display: inline-block;
    resize: vertical;
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

input[type=button] {
  background-color: gray;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  float: right;
}

input[type=submit]:hover {
  background-color: #005580;
}

input[type=button]:hover {
  background-color: #005580;
}

ul{
   list-style:none;
   }
</style>
<body>
<!-- PAGE CONTENT -->
<form action="conceptModify" id="frm" name="frm" method="POST">
<h3><b>컨셉 기획서</b></h3>
<div class="container" >
  <div class="row">
    <div class="col-30">
      <label><b>작성자 이름</b></label>
    </div>
    <div class="col-70">
    <input type="hidden" name="kiHoekNum" value='<c:out value="${kihoek.kiHoekNum }"/>'>
    <input type="hidden" name="kiHoekName" value='<c:out value="${kihoek.kiHoekName }"/>'>
      ${kihoek.kiHoekName }
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label><b>행사 컨셉 주제</b></label>
    </div>
    <div class="col-70">
    ${concept.conceptSubject }
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label><b>행사 컨셉 관련 역사</b></label>
    </div>
    <div class="col-70">
      ${concept.conceptHistory }
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label><b>행사 예정 시기</b></label>
    </div>
    <div class="col-70">
      ${concept.conceptQuarter }
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label><b>행사 컨셉 관련 유적지</b></label>
    </div>
    <div class="col-70">
    ${concept.conceptPlace }
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label><b>모집 예정 인원 규모</b></label>
    </div>
    <div class="col-70">
     ${concept.conceptScale }
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label><b>행사 컨셉 타겟 연령</b></label>
    </div>
    <div class="col-70">
      ${concept.conceptTargetAge }
    </div>
  </div>
  <div class="row">
  <div class="col-rg">
    <input type="submit" value="수정">
    <input type="button" value="목록" onclick="javascript:history.back();" class="w3-btn">&nbsp;&nbsp;
    </div>
  </div>
  </div>
  </form>
</body>
</html>