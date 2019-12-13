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
<h2>행사 상품</h2>
<form action="#">
<div class="container">
  <div class="row">
    <div class="col-30">
      <label for="egName"><b>상품 이름</b></label>
    </div>
    <div class="col-70">
      <input type="text" id="egName" name="egName" placeholder="행사 상품의 이름을 적어주세요">
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="egPlanNum"><b>일정 번호</b></label>
    </div>
    <div class="col-70">
    
    
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="egExp"><b>상품 설명</b></label>
    </div>
    <div class="col-70">
      <textarea id="egExp" name="egExp" style="height:200px" placeholder="행사 상품의 설명을 적어주세요 "></textarea>
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="egSchedule"><b>행사 일정</b></label>
    </div>
    <div class="col-70">
    <input type="date" id="egDate" name="egDate">
    
    
    </div>
  </div>
   <div class="row">
    <div class="col-30">
      <label for="egDate"><b>행사 날짜</b></label>
    </div>
    <div class="col-70">
      <input type="date" id="egDate" name="egDate">
      &nbsp;&nbsp;부터&nbsp;&nbsp;
      <input type="date" id="egDate" name="egDate">
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="egPrice"><b>행사 가격</b></label>
    </div>
    <div class="col-70">
      <input type="text" id="egPrice" name="egPrice" placeholder="행사 상품의 가격을 적어주세요 ">
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="egStartDate"><b>행사 참여 모집 시작일</b></label>
    </div>
    <div class="col-70">
      <input type="date" id="egStartDate" name="egStartDate">
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="egEndDate"><b>행사 참여 모집 종료일</b></label>
    </div>
    <div class="col-70">
      <input type="date" id="egEndDate" name="egEndDate">
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="egMin"><b>최소 참여 인원</b></label>
    </div>
    <div class="col-70">
      <input type="text" id="egMin" name="egMin" placeholder="행사 상품의 최소 참여 인원을 적어주세요 ">
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="egMax"><b>최대 참여 인원</b></label>
    </div>
    <div class="col-70">
      <input type="text" id="egMax" name="egMax" placeholder="행사 상품의 최대 참여 인원을 적어주세요 ">
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="egAge"><b>참여 가능 연령</b></label>
    </div>
    <div class="col-70">
      <input type="text" id="egAge" name="egAge" placeholder="최소 00세 이상 ">
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="egCaution"><b>상품 이용 유의 사항</b></label>
    </div>
    <div class="col-70">
      <textarea id="egCaution" name="egCaution" style="height:100px" placeholder="행사 상품의 이용 유의 사항을 적어주세요 "></textarea>
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