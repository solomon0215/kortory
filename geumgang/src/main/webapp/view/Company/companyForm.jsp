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
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript" src="js/jquery.form.js"></script>
<script type="text/javascript">
	$(function(){
		$("#companyId").keyup(function(){
			$.ajax({
				type: "POST",
				url : "companyIdConfirm",
				data: "userId="+$("#companyId").val(),
				datatype : "text",
				success : function(data1){
					$("#confirmNum").val(data1);
					if(data1 == 0){
						$("#confirm").attr('class','w3-center w3-text-green');
						$("#confirm").html("YES!");
					}else if(data1 == 1){
						$("#confirm").attr('class','w3-center w3-text-red');
						$("#confirm").html("Already Have");
					}else{
						$("#confirm").attr('class','w3-center w3-text-yellow');
						$("#confirm").html("Pattern Bad");
					}
				}
			});
		});
		$("#send").click(function(){
			$("#frm").submit(function(){
				if($("input:radio[id='aggApp']").is(":checked") == false){
					alert("업체의 정보 제공에 동의 하셔야 합니다.")
					return false;
				}
				if($("input:radio[id='perApp']").is(":checked") == false){
					alert("개인 정보 수집 절차에 동의 하셔야 합니다.")
					return false;
				}
			});
		});
	});
</script>
</head>
<body>
	<!-- 업체등록 신청서 작성 페이지 -->
	<div class="w3-container w3-display-middle w3-col m8" style="max-height:80%;">
		<form:form class="w3-container w3-light-grey w3-text-dark-gray w3-margin" commandName="companyFormCommand" id="frm" action="companyInsert" method="POST">
		<h2 class="w3-center w3-text-gray">업체등록 신청서</h2>
		 
		<div class="w3-row w3-section w3-col m10 w3-margin">
			<div class="w3-col m9">
				<form:input path="companyId" id="companyId" class="w3-input w3-border"  placeholder="아이디 영어 소문자/숫자 6~16자리"/>
				<form:errors class="w3-red" path="companyId"/>
				<form:hidden path="confirmNum" id="confirmNum" value="3"/>				
			</div>
			<div class="w3-col m3">
				<div id="confirm" class="w3-center"></div>
			</div>
		</div>
		<div class="w3-row w3-section">
				<div class="w3-container w3-col m6">
					<form:input path="companyPw" class="w3-input w3-border"  placeholder="비밀번호 영어 소문자/숫자 6~16자리"/>
					<form:errors class="w3-red" path="companyPw"/>
				</div>
				<div class="w3-container w3-col m6">
					<form:input path="companyPwCon" class="w3-input w3-border"  placeholder="비밀번호 확인 영어 소문자/숫자 6~16자리"/>
					<form:errors class="w3-red" path="companyPwCon"/>
				</div>	
		</div>
		<div class="w3-row w3-section">
			<div class="w3-container w3-col m6">
			    <form:input path="companyRegNum" class="w3-input w3-border"  placeholder="사업자 번호"/>
			    <form:errors class="w3-red" path="companyRegNum"/>
			</div>
			<div class="w3-container w3-col m6">
			    <form:input path="companyName" class="w3-input w3-border"  placeholder="업체  이름"/>
			    <form:errors class="w3-red" path="companyName"/>
			</div>
		</div>
		<div class="w3-row w3-section w3-col m10 w3-margin">
	      	<form:input path="companyAddr" class="w3-input w3-border"  placeholder="업체  주소지"/>
	      	<form:errors class="w3-red" path="companyAddr"/>
		</div>
		<div class="w3-row w3-section">
			<div class="w3-container w3-col m6">
		    	<form:input path="companyPh" class="w3-input w3-border"  placeholder="업체 전화번호"/>
		    	<form:errors class="w3-red" path="companyPh"/>
			</div>
		    <div class="w3-container w3-col m6">
			    <form:input path="companyEmail" class="w3-input w3-border"  placeholder="업체  이메일주소"/>
			    <form:errors class="w3-red" path="companyEmail"/>
		    </div>
		    
		</div>
		<br>
		<div class="w3-row w3-section w3-center">
		    	<label>공기업 이신가요?</label><br>
		    	<label>NO</label><form:radiobutton class="w3-radio" path="companyType" value="N" checked="checked"/>
				<label>YES</label><form:radiobutton class="w3-radio" path="companyType" value="Y" />
		</div>
		<div class="w3-row w3-section w3-center">
			<label>개인정보 보호법의 시행에 따라 정보수집의 절차에 동의 하십니까?</label><br>
		    <label>NO</label><form:radiobutton class="w3-radio" path="companyPerApp" value="N" checked="checked"/>
			<label>YES</label><form:radiobutton class="w3-radio" path="companyPerApp" id="perApp" value="Y" />
			<form:errors class="w3-red" path="companyPerApp"/>
		</div>
		<div class="w3-row w3-section w3-center">
			<label>업체의 정보제공에 동의 하십니까?</label><br>
		    <label>NO</label><form:radiobutton class="w3-radio" path="companyAggApp"  value="N" checked="checked"/>
			<label>YES</label><form:radiobutton class="w3-radio" path="companyAggApp" id="aggApp" value="Y" />
			<form:errors class="w3-red" path="companyAggApp"/>
		</div>
		<br>
		<button class="w3-button w3-block w3-section w3-blue w3-ripple w3-padding" id="send">Send</button>
		</form:form>		
	</div>
</body>
</html>