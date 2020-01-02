<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<title>이력서 작성 - 1</title>
<script>
	function myFunction() {
		var x = document.getElementById("myFile");
		x.disabled = true;
	}
</script>
</head>
<body>
	<form:form class="w3-table w3-bordered" commandName="rc" id="frm" action="resumeInsert1" method="POST">
		<table class="w3-table w3-border">
			<tr>
				<td class="w3-border-right w3-light-gray" style="width: 15%">사진
					이미지 선택</td>
				<td class="w3-border-right" colspan="4"><input type="file" name="file" />
					<p>
						*주의사항<br /> -사진이미지 형식은 jpg, jpeg, gif형식만 등록 가능합니다.<br /> -사진이미지
						파일명은 파일명 중간에 공백없이, 영문자, 숫자로만 등록 가능합니다. <br /> -파일을 재전송하기를 원하시면 다시
						사진등록 버튼을 눌러 파일을 선택해 주십시오.
					</p></td>
			</tr>
			<tr>
				<td class="w3-border-right w3-light-gray" style="width: 15%">국적</td>
				<td class="w3-border-right" colspan="4"><form:select
						class="w3-select w3-border" path="national" style="width: 15%">
						<form:option value="한국" label="대한민국" />
						<form:option value="중국" label="중국" />
						<form:option value="일본" label="일본" />
						<form:option value="미국" label="미국" />
					</form:select></td>
			</tr>
			<tr>
				<td class="w3-border-right w3-light-gray" style="width: 15%">보훈대상여부</td>
				<td class="w3-border-right" colspan="4"><form:radiobutton
						class="w3-radio" path="bohun" value="Y" /> <label>예</label> <form:radiobutton
						class="w3-radio" path="bohun" value="N" checked="checked" /> <label>아니요</label>
				</td>
			</tr>
			<tr>
				<td class="w3-border-right w3-light-gray" style="width: 15%">장애대상여부</td>
				<td class="w3-border-right" colspan="4"><form:radiobutton
						class="w3-radio" path="disorder" value="Y" /> <label>예</label> 
						<form:radiobutton class="w3-radio" path="disorder" value="N" checked="checked" /><label>아니요</label>
				</td>
			</tr>
			<tr>
				<td class="w3-border-right w3-light-gray" style="width: 15%">병역사항</td>
				<td class="w3-border-right" colspan="4">
				<form:radiobutton class="w3-radio" path="army" value="Y" /> <label>군필</label> 
				<form:radiobutton class="w3-radio" path="army" value="E" /> <label>면제</label> 
				<form:radiobutton class="w3-radio" path="army" value="N" checked="checked" /> <label>미필</label>
				</td>
			</tr>
			<tr>
				<td class="w3-border-right w3-light-gray" style="width: 15%"
					rowspan="4">최종학력</td>
				<td class="w3-row-padding" rowspan="2">고등학교명: 
				<form:input path="highschool" class="w3-input w3-border" placeholder=""
						style="width: 47%" />
				<td class="w3-border w3-light-gray" style="width: 15%">입학년월</td>
				<td class="w3-row-padding">
				<form:input type="date" path="schoolStart1" /></td>
			</tr>
			<tr>
				<td class="w3-border w3-light-gray" style="width: 15%">졸업년월</td>
				<td class="w3-row-padding">
				<form:input type="date" path="schoolEnd1" /></td>
			</tr>
			<tr>
				<td class="w3-row-padding" >대학교명: 
				<form:input path="univercity" class="w3-input w3-border" placeholder="" style="width: 47%" />
				<td class="w3-border w3-light-gray" style="width: 15%">입학년월</td>
				<td class="w3-row-padding">
				<form:input type="date" path="schoolStart2" /></td>
			</tr>
			<tr>
				<td class="w3-margin-20">
					<div style="float: left;">
						전공: 
						<form:input path="major" class="w3-input w3-border" placeholder="" style="width: 95%" />
					</div>
					<div>
						학점: 
						<form:input path="point" class="w3-input w3-border" placeholder="" style="width: 25%" />
					</div>
				</td>
				<td class="w3-border w3-light-gray" style="width: 15%">졸업년월</td>
				<td class="w3-row-padding">
				<form:input type="date" path="schoolEnd2" /></td>
			</tr>
		</table>
		<br />
		<div class="w3-center">
			<div class="w3-bar">
				<button class="w3-button w3-teal" id="save">저장</button>
				<a href="resume2" class="w3-button w3-green" id="next">다음</a>
			</div>
		</div>
	</form:form>
</body>
</html>
