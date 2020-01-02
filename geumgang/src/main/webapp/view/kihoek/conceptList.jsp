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
<title>conceptList</title>
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

table {
	width:100%
}
</style>
</head>
<body>
<!-- PAGE CONTENT -->
<form action="#">
<h3><b>컨셉 기획서 목록</b></h3>
<div class="container" >
	<div class="row">
    <div class="col-30">
      <label><b>컨셉 기획서 분류</b></label>
    </div>
    <div class="col-70">
      <select id="conceptState" name="conceptState">
      	<option value="">진행 상태 선택</option>
        <option value="진행">진행</option>
        <option value="미진행">미진행</option>
      </select>
    </div>
  	</div>
	<div class="row">
	<table>
	<thead>
	<tr>
  		<th>번호</th>
  		<th>컨셉 기획서 제목</th>
  		<th>작성자</th>
  		<th>진행 상태</th>
  	</tr>
  	</thead>
  	<tbody></tbody>
  	<br>
  	<c:forEach var="concept" items="${concept}" varStatus="status">
  	<tr class="w3-hoverable w3-center">
		<td>${status.count }</td>
		<td><a href='<c:url value='/kihoek/conceptDetail?num=${concept.conceptSubject }'/>'${concept.conceptSubject }'>${concept.conceptSubject }</a>
		<td>${authName }</td>
		<td>${concept.conceptState}</td>
	</tr>
	</c:forEach>
	</tbody>
	</table>
	</div>
</div>
</form>
</body>
</html>