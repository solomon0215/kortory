<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>Insert title here</title>
</head>
<body>
<!-- Page Content -->
	<div class =" w3-container" style="margin-left:250px" >
		<center><h2>이력서 목록</h2></center><br/>
			<table class="w3-table-all">
    <thead>
     <table class="w3-table-all w3-centered">
      <tr class="w3-light-blue">
        <th>번호</th>
        <th>이름</th>
        <th>아이디</th>
      </tr>
    </thead>
    <c:forEach var="resume"  items="${resume}"  varStatus="status">
    <tr>
      <td>${status.count}</td>
     <!-- <td>${resume.userDTO.userName}</td> -->
     <td><a href='<c:url value='/insa/resumeDetailView?num=${resume.resumeDTO.resumeNum}'/>'${resume.resumeDTO.resumeNum}'>${resume.userDTO.userName}</a></td>
      <td>${resume.userDTO.userId}</td>
    </tr>
    </c:forEach>
  </table>
  </div>
</body>
</html>