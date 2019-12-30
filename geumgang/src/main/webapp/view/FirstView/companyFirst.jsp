<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-latest.js"></script>
</head>
<body>

<div class="w3-content w3-section" style="max-width:100%;max-height:20%">
  <img class="mySlides w3-round  w3-animate-opacity" src="../images/1.jpg" alt="mainImage" style="width:100%;height: 50%;">
  <img class="mySlides w3-round  w3-animate-opacity" src="../images/5.jpg" alt="mainImage" style="width:100%;height: 50%;">
  <img class="mySlides w3-round  w3-animate-opacity" src="../images/2.jpg" alt="mainImage" style="width:100%;height: 50%;">
  <img class="mySlides w3-round  w3-animate-opacity" src="../images/6.jpg" alt="mainImage" style="width:100%;height: 50%;">
  <img class="mySlides w3-round  w3-animate-opacity" src="../images/3.jpg" alt="mainImage" style="width:100%;height: 50%;">
  <img class="mySlides w3-round  w3-animate-opacity" src="../images/7.jpg" alt="mainImage" style="width:100%;height: 50%;">
  <img class="mySlides w3-round  w3-animate-opacity" src="../images/4.jpg" alt="mainImage" style="width:100%;height: 50%;">
  <img class="mySlides w3-round  w3-animate-opacity" src="../images/8.jpg" alt="mainImage" style="width:100%;height: 50%;">
</div>
<script>
var myIndex = 0;
carousel();

function carousel() {
  var i;
  var x = document.getElementsByClassName("mySlides");
  for (i = 0; i < x.length; i++) {
    x[i].style.display = "none";  
  }
  myIndex++;
  if (myIndex > x.length) {myIndex = 1}    
  x[myIndex-1].style.display = "block";  
  setTimeout(carousel, 2500); // Change image every 2 seconds
}
</script>
</body>
</html>