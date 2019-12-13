<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>conceptForm</title>
</head>
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
<h2>컨셉 기획서</h2>
<form action="#">
<div class="container">
  <div class="row">
    <div class="col-30">
      <label for="cSubject"><b>행사 컨셉 주제</b></label>
    </div>
    <div class="col-70">
      <input type="text" id="cSubject" name="cSubject" placeholder="행사 컨셉 주제를 적어주세요">
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="cHistory"><b>행사 컨셉 관련 역사</b></label>
    </div>
    <div class="col-70">
      <textarea id="cHistory" name="cHistory" style="height:200px" placeholder="행사 컨셉 관련 역사를 적어주세요 "></textarea>
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="cQuarter"><b>행사 예정 시기</b></label>
    </div>
    <div class="checkbox">
    <ul>
     <li class="check">
        <input id="allQ" name="allQ" type="checkbox">사계절
        <input id="spring" name="spring" type="checkbox">봄
        <input id="summer" name="summer" type="checkbox">여름
        <input id="fail" name="fail" type="checkbox">가을
        <input id="winter" name="winter" type="checkbox">겨울
      </li>
      </ul>
	</div>  
  </div>
  <div class="row">
    <div class="col-30">
      <label for="subject"><b>행사 컨셉 관련 유적지</b></label>
    </div>
    <div class="col-70">
      <textarea id="subject" name="subject" style="height:100px" placeholder="행사 컨셉 관련 유적지를 적어주세요"></textarea>
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="cSubject"><b>모집 예정 인원 규모</b></label>
    </div>
    <div class="col-70">
      <input type="text" id="cSubject" name="cSubject" placeholder="최대 00명">
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label for="cSubject"><b>행사 컨셉 타겟 연령</b></label>
    </div>
    <div class="col-70">
      <select id="targetAge" name="targetAge">
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
  </form>
</div>
</body>
</html>

