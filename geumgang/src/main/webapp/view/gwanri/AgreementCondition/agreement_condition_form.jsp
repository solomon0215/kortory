<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/icon?family=Material+Icons">
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript" src="js/jquery.form.js"></script>
<script type="text/javascript">
$(function(){
	$("#frm").submit(function(){	
		if($("#agreementConditionRatio").val() == ""){
			alert("업체희망 정산비율을 입력하세요");
			$("#agreementConditionRatio").focus();
			return false;
			}				
		if($("#agreementConditionSett").val()==""){
			alert("정산기준시간을 입력하세요");
			$("#agreementConditionSett").focus();				
			return false;
			}	
		if($("#agreementConditionDate").val()==""){
			alert("작성일을 입력하세요");
			$("#agreementConditionDate").focus();				
			return false;
		}
			
	});
});
</script>
</head>
<body>
<form action="agreementConditionWritePro" name="frm" id="frm" method="post" >
     <table cellpadding="0" cellspacing="0" > 
		<div class="w3-center">
		<h2><p>협력업체 계약서</p></h2><br /><br />
		<div>
			<center>
				<input type="text" name="agreementConditionSubject" id="agreementConditionSubject" class="w3-input w3-center" style="width: 800px" placeholder="제목" ></center><br/>
			<p>"Kortory"(이하 "갑"이라 한다)는 협약업체(이하 "을"이라 한다)에게 다음과 같이 협약 조건을 신청한다.<br /> <br /> 제1조(목적)<br /> 본
				협약은 "갑"과 "을"이 본 사업을 진행함에 있어서 "갑"과 "을"의 역할과 조건 등 상호협력이 필요한 사항을 정한다.<br />
				<br /> 제2조(조건)<br /> ① "을"은 협약 기간 동안 "본사업"이 원활하게 게첩 되도록 하여야 한다.<br />
				② "을" 은 계약중 사정에 의하여 변수가 생긴 경우, 이를 즉시 "갑"에게 알려야할 의무가 있으며,<br />이 계약이
				정한 기준과 내용에 최대한 부합하도록 "갑"과 협의하여야 한다.<br /> <br /> 제3조(정산)<br /> ①
				"갑"은 "을"에게 행사의 수익에 대해 "을"의 희망가격에서</p>		
				<center>
				<input type="text" name="agreementConditionRatio" id="agreementConditionRatio" class="w3-input w3-center" style="width: 200px" placeholder="업체희망정산비율" ></center>
				<p>퍼센트를 지급하고 나머지 퍼센트는 "갑"이 갖는 것으로 한다. <br /> ② "갑"은 정산 진행 시 "을"이 이용한</p>
				
				<center>
				<input type="text" name="agreementConditionSett" id="agreementConditionSett" class="w3-input w3-center" style="width: 200px" placeholder="정산 기준 시간" ></center>
				<p>시간에 대해 정산 기준 시간에 따라 금액을 계산하여 정산하는 것으로 한다. <br /> <br /> 제4조(지도·감독)<br />
				① "갑"은 이 사업과 관련한 "을"의 업무를 지도·감독한다.<br /> ② "갑은 사업과 관련한 "을"의 사무처리가
				관계법규 등에 위배되거나 부당하다고 인정되는 때에는<br />이에 대한 시정을 요구하거나 직접 시정조치 할 수 있다.<br />
				이 경우 "을"은 정당한 사유가 없는 한 이에 응하여야 한다.<br /> <br /> 제5조(합의관례 및 소송의 관할)<br />
				① 기타 본 약정에 명시되지 않은 사항은 쌍방의 합의나 관련법령에 맞는 관례에 따른다.<br /> ② 본 협약에 의하여
				발생되는 권리나 의무에 관한 소송은 "갑"의 소재지 관할 법원으로 한다.<br /> <br /> 제6조(효력발생)<br />
				본 약정의 유효기간은 협약 체결일로부터 행사종료 후 정산완료 시점까지로 한다. <br /> <br /></p>				
				<center>
				<input type="text" onfocus="(this.type='date')" name="agreementConditionDate" id="agreementConditionDate" class="w3-input w3-center" style="width: 200px" placeholder="작성일"></center>
				<div class="w3-container w3-center">
				<br /> 
				<input type="submit" class="w3-btn w3-green" value="등록">
				<input type="button" class="w3-btn w3-green" value="뒤로"
					onclick="javascript:history.back();">
					</div>
			</div>
	</div>
	</table>
	</form>
</body>
</html>