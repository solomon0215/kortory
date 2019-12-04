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
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<title>Insert title here</title>
</head>
<body>
<form:form class="w3-container w3-card-4 w3-light-grey">
  <h2>관리부 로그인</h2>
  <p><label>아이디</label>
  <form:input path="first" type="text" class="w3-input w3-border"/></p>

  <p><label>비밀번호</label>
  <form:input class="w3-input w3-border" path="last" type="text"/></p>
</form:form>
<form:form class="w3-container w3-card-4 w3-light-grey">
  <h2>인사부</h2>
  <p><label>아이디</label>
  <form:input path="first" type="text" class="w3-input w3-border"/></p>

  <p><label>비밀번호</label>
  <form:input class="w3-input w3-border" path="last" type="text"/></p>
</form:form>
</body>
</html>