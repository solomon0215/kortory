<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<title>Insert title here</title>
<script>
	function myFunction() {
		var x = document.getElementById("myFile");
		x.disabled = true;
	}
</script>
</head>
<body>
<form:form class="w3-table w3-bordered" commandName="resumeInsertCommand" id="frm" action="resumeInsert" method="POST" >
		<!-- <table class="w3-table w3-bordered"> -->
		<tr>
			<td class="w3-border-right w3-light-gray" style="width: 15%">사진
				이미지 선택</td>
			<td class="w3-border-right" colspan="4"><input type="file"
				id="myFile">
				<p>
					*주의사항<br /> -사진이미지 형식은 jpg, jpeg, gif형식만 등록 가능합니다.<br /> -사진이미지
					파일명은 파일명 중간에 공백없이, 영문자, 숫자로만 등록 가능합니다. <br /> -파일을 재전송하기를 원하시면 다시
					사진등록 버튼을 눌러 파일을 선택해 주십시오.
				</p></td>
		</tr>
		<tr>
			<td class="w3-border-right w3-light-gray" style="width: 15%">국적</td>
			<td class="w3-border-right" colspan="4"><select
				class="w3-select w3-border" name="option" style="width: 15%">
					<option value="" disabled selected>국가선택</option>
					<option value="1">대한민국</option>
					<option value="2">중국</option>
					<option value="3">일본</option>
					<option value="4">미국</option>
			</select></td>
		</tr>
		<tr>
			<td class="w3-border-right w3-light-gray" style="width: 15%">보훈대상여부</td>
			<td class="w3-border-right" colspan="4"><input class="w3-radio"
				type="radio" name="bohun" value="Y"> <label>예</label> <input
				class="w3-radio" type="radio" name="bohun" value="N" checked>
				<label>아니요</label></td>
		</tr>
		<tr>
			<td class="w3-border-right w3-light-gray" style="width: 15%">장애대상여부</td>
			<td class="w3-border-right" colspan="4"><input class="w3-radio"
				type="radio" name="disorder" value="Y"> <label>예</label> <input
				class="w3-radio" type="radio" name="disorder" value="N" checked>
				<label>아니요</label></td>
		</tr>
		<tr>
			<td class="w3-border-right w3-light-gray" style="width: 15%">병역사항</td>
			<td class="w3-border-right" colspan="4"><input class="w3-radio"
				type="radio" name="army" value="Y"> <label>군필</label> <input
				class="w3-radio" type="radio" name="army" value="E"> <label>면제</label>
				<input class="w3-radio" type="radio" name="army" value="N" checked>
				<label>미필</label></td>
		</tr>
		<tr>
			<td class="w3-border-right w3-light-gray" style="width: 15%"
				rowspan="4">최종학력</td>
			<td class="w3-row-padding" rowspan="2">고등학교명: <input
				class="w3-input w3-border" type="text" placeholder=""
				style="width: 50%">
			<td class="w3-border w3-light-gray" style="width: 15%">입학년월</td>
			<td class="w3-row-padding"><input
				class="w3-input w3-border w3-white" type="date"></td>
		</tr>
		<tr>
			<td class="w3-border w3-light-gray" style="width: 15%">졸업년월</td>
			<td class="w3-row-padding"><input
				class="w3-input w3-border w3-white" type="date"></td>
		</tr>
		<tr>
			<td class="w3-row-padding">대학교명: <input
				class="w3-input w3-border" type="text" placeholder=""
				style="width: 50%">
			<td class="w3-border w3-light-gray" style="width: 15%">입학년월</td>
			<td class="w3-row-padding"><input
				class="w3-input w3-border w3-white" type="date"></td>
		</tr>
		<tr>
		<td class="w3-margin-20">전공: <input
				class="w3-input w3-border" type="text" placeholder=""
				style="width: 35%"></td>
				<td class="w3-margin-30">학점: <input
				class="w3-input w3-border" type="text" placeholder=""
				style="width: 35%"></td>
			<td class="w3-border w3-light-gray" style="width: 15%">졸업년월</td>
			<td class="w3-row-padding"><input
				class="w3-input w3-border w3-white" type="date"></td>
		</tr>
	</table>
<br />
		<div class="w3-center">
			<div class="w3-bar">
			    <button class="w3-button w3-teal" id="save">저장</button>
			    <button class="w3-button w3-green" id="next">다음</button>
			</div>
		</div>
</form:form>		
</body>
</html>
