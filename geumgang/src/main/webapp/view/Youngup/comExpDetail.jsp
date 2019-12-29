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
<title>Insert title here</title>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link href="https://fonts.googleapis.com/css?family=Single+Day&display=swap" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Gugi|Yeon+Sung&display=swap" rel="stylesheet">
<style>
.w3-myfont {
  font-family: 'Single Day', cursive;
}
.w3-min{
	font-family: 'Yeon Sung', cursive;
	font-family: 'Gugi', cursive;
}
h2{
	color:  #696463;
}
</style>
<script src="https://code.jquery.com/jquery-latest.js"></script>
</head>
<body>
<div class="w3-container" style="margin-top: 10%;">
	<div class="w3-container w3-margin">
		<table class="w3-table-all w3-tiny w3-centered">
			<thead>
			    <tr class="w3-dark-gray">
			      <th style="width:20%;">항목</th><th>내용</th>
			    </tr>
		    </thead>
		    <tbody>
		    	<tr class="w3-gray">
		    		<td>보고서 번호</td><td class="w3-light-gray">${detail.explorationNum}</td>
		    	</tr>
		    	<tr class="w3-gray">
			      <td>사업자 번호</td><td class="w3-light-gray">${detail.companyRegNum}</td>
			    </tr>
			    <tr class="w3-gray">
			      <td>업체 이름</td><td class="w3-light-gray">${detail.companyName}</td>
			    </tr>
			    <tr class="w3-gray">
			      <td>업체 주소</td><td class="w3-light-gray">${detail.companyAddr}</td>
			    </tr>
			    <tr class="w3-gray">
			      <td>공기업 여부</td><td class="w3-light-gray">${detail.companyType}</td>
			    </tr>
				<tr class="w3-gray">
					<td>업체유형</td><td class="w3-light-gray">${detail.explorationType}</td>
				</tr>
				<tr class="w3-gray">
					<td>방문예정일</td><td class="w3-light-gray">${detail.explorationSchedule}</td>
				</tr>
				<tr class="w3-gray">
					<td>방문실시일</td><td class="w3-light-gray">${detail.explorationEffect}</td>
				</tr>
				<tr class="w3-gray">
					<td>업체 담당자 이름</td><td class="w3-light-gray">${detail.explorationManaName}</td>
				</tr>
				<tr class="w3-gray">
					<td>업체 방문 가능시간</td><td class="w3-light-gray">${detail.explorationAvailTime}</td>
				</tr>
				<tr class="w3-gray">
					<td>업체 사용가능 날짜</td><td class="w3-light-gray">${detail.explorationAvailDate}</td>
				</tr>
				<tr class="w3-gray">
					<td>공휴일 사용 가능 여부</td><td class="w3-light-gray">${detail.explorationAvailHoli}</td>
				</tr>
				<tr class="w3-gray">
					<td>업체 방문 제한 나이</td><td class="w3-light-gray">${detail.explorationLimitAge}</td>
				</tr>
				<tr class="w3-gray">
					<td>업체 방무문 제한 인원</td><td class="w3-light-gray">${detail.explorationLimitPer}</td>
				</tr>
				<tr class="w3-gray">
					<td>업체 방문 제한 조건</td><td class="w3-light-gray">${detail.explorationCondition}</td>
				</tr>
				<tr class="w3-gray">
					<td>증빙자료</td>
					<td class="w3-light-gray">
						<c:if test="${images != null}">
							<div class="w3-content w3-display-container">
							<c:forEach items="${images}" var="image" >
								  <img class="mySlides" src="../view/Youngup/upload/${image}" style="width:100%;height:20;">
							</c:forEach>
							  <button class="w3-button w3-black w3-display-left" onclick="plusDivs(-1)">&#10094;</button>
							  <button class="w3-button w3-black w3-display-right" onclick="plusDivs(1)">&#10095;</button>
							</div>
							
							<script>
							var slideIndex = 1;
							showDivs(slideIndex);
							
							function plusDivs(n) {
							  showDivs(slideIndex += n);
							}
							
							function showDivs(n) {
							  var i;
							  var x = document.getElementsByClassName("mySlides");
							  if (n > x.length) {slideIndex = 1}
							  if (n < 1) {slideIndex = x.length}
							  for (i = 0; i < x.length; i++) {
							    x[i].style.display = "none";  
							  }
							  x[slideIndex-1].style.display = "block";  
							}
							</script>
						</c:if>
						<c:if test="${images == null }">
							증빙자료가 없습니다.
						</c:if>
					</td>
				</tr>
		    </tbody>
		</table>
	</div>
	<br>
	<br>
	<br>
</div>
</body>
</html>