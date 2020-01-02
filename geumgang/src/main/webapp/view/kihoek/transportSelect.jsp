<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript" src="js/jquery.form.js"></script>
<script type="text/javascript">
$(function(){
	$("#transport").click(function(){
		$.ajax({
			type:"POST",
			url : "transport",
			datatype : "html",
			success : function(data1){
				$("#kihoek").html(data1);
			}
		});
	});
});
</script>
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
</head>
<body>
<!-- PAGE CONTENT -->
<h3><b>이동수단 업체 선정</b></h3>
<form action="#">
<div class="container">
  <div class="row">
    <div class="col-30">
      <label><b>진행중인 컨셉 기획서 선택</b></label>
    </div>
    <div class="col-70">
    	<select id="conceptSelect" name="conceptSelect">
        <option value=""></option>
      </select>
    </div>
  </div>
  <div class="row">
   <div class="col-30">
    </div>
    <div class="col-70">
    	<textarea id="conceptSelectContent" name="conceptSelectContent" style="height:100px"></textarea>
    </div>
  </div>
  <div class="row">
    <div class="col-30">
     <label><b>이용 가능한 날짜 선택</b></label>
    </div>
    <div class="col-70">
    	<input type="date" id="availableDate" name="availableDate">
      	&nbsp;&nbsp;부터&nbsp;&nbsp;
      	<input type="date" id="availableDate" name="availableDate">
    	<input type="button" id="transport" value="검색">
    </div>
  </div>
  <div class="row">
    <div class="col-30">
      <label><b>이용 가능 이동수단 업체 선택</b></label>
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