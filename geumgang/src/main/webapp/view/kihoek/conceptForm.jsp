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

input[type=submit]:hover {
  background-color: #45a049;
}

ul{
   list-style:none;
   }
</style>
<body>
<!-- PAGE CONTENT -->
<form action="conceptWritePro" id="frm" name="frm" method="POST">
<h3><b>컨셉 기획서</b></h3>
<div class="container" >
  <div class="row">
    <div class="col-30">
      <label for="kiHoekName"><b>작성자 이름</b></label>
    </div>
    <div class="col-70">
    <input type="hidden" name="kiHoekNum" value='<c:out value="${kihoek.kiHoekNum }"/>'>
      ${kihoek.kiHoekName }
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label><b>행사 컨셉 주제</b></label>
    </div>
    <div class="col-70">
      <input type="text" id="conceptSubject" name="conceptSubject" placeholder="행사 컨셉 주제를 적어주세요">
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label><b>행사 컨셉 관련 역사</b></label>
    </div>
    <div class="col-70">
      <textarea id="conceptHistory" name="conceptHistory" style="height:200px" placeholder="행사 컨셉 관련 역사를 적어주세요 "></textarea>
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label><b>행사 예정 시기</b></label>
    </div>
    <div class="checkbox">
    <ul>
     <li class="check">
        <input type="checkbox" value="allQ" name="conceptQuarter">사계절
        <input type="checkbox" value="spring" name="conceptQuarter">봄
        <input type="checkbox" value="summer" name="conceptQuarter">여름
        <input type="checkbox" value="fail" name="conceptQuarter">가을
        <input type="checkbox" value="winter" name="conceptQuarter">겨울
      </li>
      </ul>
	</div>  
  </div>
  <div class="row">
    <div class="col-30">
      <label><b>행사 컨셉 관련 유적지</b></label>
    </div>
    <div class="col-70">
      <textarea id="conceptPlace" name="conceptPlace" style="height:100px" placeholder="행사 컨셉 관련 유적지를 적어주세요"></textarea>
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label><b>모집 예정 인원 규모</b></label>
    </div>
    <div class="col-70">
      <input type="text" id="conceptScale" name="conceptScale" placeholder="최대 00명">
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label><b>행사 컨셉 타겟 연령</b></label>
    </div>
    <div class="col-70">
      <select id="conceptTargetAge" name="conceptTargetAge">
        <option value="ageAll">전연령</option>
        <option value="age10s">10대</option>
        <option value="age20s">20대</option>
        <option value="age30s">30대</option>
        <option value="age40s">40대</option>
        <option value="age50s">50대 이상</option>
      </select>
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