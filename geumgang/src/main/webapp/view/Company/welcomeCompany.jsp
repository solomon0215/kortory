<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lobster">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Allerta+Stencil">
<style>
.w3-lobster {
  font-family: "Lobster", serif;
}
.w3-allerta {
  font-family: "Allerta Stencil", Sans-serif;
}
</style>
</head>
<body>
<div class="w3-container w3-center w3-display-middle w3-half">
	<div class="w3-container w3-lobster">
	  <p class="w3-xxxlarge">Kortory를 선택해주셔서<br> 감사합니다. </p>
	</div>
	<br>
	<br>
	<div class="w3-container w3-black w3-center w3-allerta">
	  <p class="w3-xlarge">${command.companyName}님의 이메일인 ${command.companyEmail}로 저희 Kortory에서의 서비스와 절차 안내를 보내드리겠습니다.</p>
	</div>
	<br>
	<br>	
	<div class="w3-container w3-lobster">
	  <p class="w3-xlarge">언제나 더 좋은 파트너가 되기 위해<br> 노력하는 Kortory가 되겠습니다. </p>
	</div>
</div>
</body>
</html>