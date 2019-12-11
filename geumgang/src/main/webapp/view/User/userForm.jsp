<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<style>
li{list-style:none;} 

</style>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<script src="https://ssl.daumcdn.net/dmaps/map_js_init/postcode.v2.js"></script>
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript" src="js/jquery.form.js"></script>
<script type="text/javascript">
	$(function(){
		$("#userId").keyup(function(){
			$.ajax({
				type: "POST",
				url : "userIdConfirm",
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
			});				
		});		
		</script>
		<script>
		function openZipSearch() {
			new daum.Postcode({
				oncomplete: function(data) {
					$('[commandName=zip]').val(data.zonecode); // 우편번호 (5자리)
					$('[commandName=addr1]').val(data.address);
					$('[commandName=addr2]').val(data.buildingName);
				}
			}).open();
		}
</script>
</head>
<body>
<!-- 회원 등록 작성 페이지 -->
	<div class="w3-container w3-display-middle w3-col m8" style="max-height:80%;">
	<form:form class="w3-container w3-light-grey w3-text-dark-gray w3-margin" commandName="userFormCommand" id="frm" action="userInsert" method="POST">
		<h2 class="w3-center w3-text-gray">회원가입</h2>
		<div class="w3-row w3-section w3-col m10 w3-margin">
			<div class="w3-col m9">
				<form:input path="userId" class="w3-input w3-border"  placeholder="아이디 영어 소문자/숫자 6~16자리"/>
			<form:errors class="w3-red" path="userId"/>
				<form:hidden path="confirmNum" id="confirmNum" value="3"/>				
			</div>
			<div class="w3-col m3">
				<div id="confirm" class="w3-center"></div>
			</div>
		</div>
			<div class="w3-row w3-section">
				<div class="w3-container w3-col m6">
					<form:password path="userPw" class="w3-input w3-border"  placeholder="비밀번호 영어 소문자/숫자 6~16자리"/>
					<form:errors class="w3-red" path="userPw"/>
				</div>
				<div class="w3-container w3-col m6">
					<form:password path="userPwCon" class="w3-input w3-border"  placeholder="비밀번호 확인 영어 소문자/숫자 6~16자리"/>
					<form:errors class="w3-red" path="userPwCon"/>
				</div>	
				</div>
				<div class="w3-row w3-section">
				<div class="w3-container w3-col m6">
			    <form:input path="userName" class="w3-input w3-border"  placeholder="성명"/>
			    <form:errors class="w3-red" path="userName"/>
			</div>
			<div class="w3-container w3-col m6">
			    <form:input path="userBirth" class="w3-input w3-border"  placeholder="생년월일"/>
			    <form:errors class="w3-red" path="userBirth"/>
			</div>
		</div>
		<div class="w3-container w3-col m3">
		  <form:input path="userAddr" commandName="zip" class="w3-input w3-border"  placeholder="우편번호" />
		  </div>		  
		  <button type="button" style="width:60px; height:40px;" onclick="openZipSearch()">검색</button><br>
		<div class="w3-row w3-section">
		 <div class="w3-container w3-col m6">
		  <form:input path="userAddr" commandName="addr1" class="w3-input w3-border" placeholder="주소" />
			</div>
			<div class="w3-container w3-col m6">
		  <form:input path="userAddr" commandName="addr2" class="w3-input w3-border" placeholder="상세주소" />
			</div>		
		</div>
		
		<div class="w3-container w3-col m6">
		    	<form:input path="userPh" class="w3-input w3-border"  placeholder="전화번호"/>
		    	<form:errors class="w3-red" path="userPh"/>
			</div>
		    <div class="w3-container w3-col m6">
			    <form:input path="userEmail" class="w3-input w3-border"  placeholder="이메일주소"/>
			    <form:errors class="w3-red" path="userEmail"/>
		    </div>
		    <br />
		    	<div class="w3-row w3-section">
			<div class="w3-row w3-section w3-center">
		    	<label>성별</label>
		    	<label>남</label><form:radiobutton class="w3-radio" path="userGender" value="M" checked="checked"/>
				<label>여</label><form:radiobutton class="w3-radio" path="userGender" id="userGender" value="F" />
						<br/><br/>
						 <div class="panel-body" style="border: 1px solid #ccc">
			<div style="overflow:scroll; width:1150px; height:300px; ">
							<div class="step_box box_agree" id="tab_list1">
					
					<div class="txt_agree" id="box_agree_internet" >
						<div class="wrap_agree" >
							
    <h4 class="tit_skip">인터넷 회원규정</h4>  
    <h5 class="tit">제1장 총 칙</h5>
    <h6 class="tit_sub">제1조(목적)</h6>
    <p>본 규정은 주식회사 "Kortory"가 운영하는 인터넷 웹사이트(이하 "kortory.co.kr"라 함)에서 제공하는 서비스를 이용자가 이용함에 있어 "Kortory"와 이용자간 권리·의무 및 기타 책임사항 등에 대하여 규정함을 목적으로 합니다.</p>
    <h6 class="tit_sub">제2조(용어의 정의)</h6>
    <p>본 규정에서 사용하는 용어의 정의는 다음 각 호와 같습니다.</p>
    <ol class="list_number">
        <li>"kortory.co.kr"라 함은"Kortory"의 판매상품 또는 서비스를 이용자에게 제공하기 위하여 컴퓨터 등 정보통신설비를 이용하여 상품 등을 거래할 수 있도록 설정한 가상의 영업장을 말합니다.</li>
        <li>"이용자"라 함은 "kortory.co.kr"에 접속하여 본 규정에 따라 "Kortory"가 제공하는 서비스를 이용하는 "회원"을 말합니다.</li>
        <li>"회원"이라 함은 "kortory.co.kr"에 개인정보를 제공하고 회원등록을 한 자로 "kortory.co.kr" 을 통해 지속적으로 제공하는 정보 및 서비스를 계속적으로 이용할 수 있는 자를 말합니다.</li>
        <li>"개인정보"라 함은 성명, 생년월일, 전자우편, 휴대전화번호 등 특정 개인을 식별할 수 있는 정보를 말합니다.</li>
    </ol>
    <h5 class="tit">제2장 서비스 이용</h5>
    <h6 class="tit_sub">제3조(서비스의 제공)</h6>
    <ol class="list_circle">
        <li><span>①</span> "Kortory"는 "kortory.co.kr"을 통해 다음의 서비스를 제공합니다.
            <ol class="list_number">
                <li>국내의 역사투어 판매 서비스 </li>
                <li>역사정보·역사상품 관련 정보 제공 서비스</li>
                <li>기타 "Kortory"가 정하는 업무</li>
            </ol>
            </li>
        <li><span>②</span> "Kortory"는 필요한 경우 전항의 서비스의 내용을 임의로 추가, 조정 등 변경하여 적용할 수 있습니다.</li>
    </ol>
    <h6 class="tit_sub">제4조(서비스의 이용 및 제한)</h6>
    <ol class="list_circle">
        <li><span>①</span> 서비스의 이용은 "Kortory"의 업무상 또는 기술상 특별한 지장이 없는 한 연중무휴 1일 24시간을 원칙으로 합니다.</li>
        <li><span>②</span> "Kortory"는 전항의 이용시간에 관련하여 정기점검 등의 필요로 인하여 임의로 날짜와 시간을 정해 서비스를 중단할 수 있습니다.</li>
        <li><span>③</span> 서비스의 이용신청은 "kortory.co.kr"에 이용등록 절차를 거쳐(각 규정을 포함하여 개인정보 수집, 제공, 이용에 동의) 회원등록을 할 수 있습니다.</li>
        <li><span>④</span> "Kortory"는 다음 각 호에 해당하는 경우 서비스 제공을 중지 또는 제한할 수 있습니다.
            <ol class="list_number">
                <li>설비의 보수 등 공사로 인한 부득이한 경우</li>
                <li>전기통신사업법에 규정된 통신사업자가 전기통신서비스를 중지 했을 경우</li>
                <li>국가 비상사태, 정전, 서비스 설비의 장애 또는 서비스 이용의 폭주 등으로 정상적인 서비스 이용에 지장이 있는 경우</li>
            </ol>
        </li>
    </ol>
    <h6 class="tit_sub">제5조(회원의 이용제한 및 해제절차)</h6>
    <ol class="list_circle">
        <li><span>①</span> "Kortory"는 본 규정 제8조에 의하여 "회원"에 대한 서비스이용을 제한하고자 하는 경우에는 그 사유, 일시 및 기타사항을 정하여 본 규정 제17조에 따라 "회원"에게 통지합니다. 다만, "Kortory"가 긴급하게 이용을 정지할 필요가 있다고 하는 경우에는 그러하지 아니 합니다.</li>
        <li><span>②</span> 전항에 의하여 이용제한의 통지를 받은 "회원"은 그 이용제한 통지에 대하여 이의신청을 할 수 있습니다.</li>
        <li><span>③</span> "회원"의 이의신청에 대하여 그 확인기간까지 이용 정지를 일시 연기할 수 있으며, 그 결과를 "회원"에게 통지합니다.</li>
        <li><span>④</span> "회원"의 이용정지 사유가 해소 된 경우 그 즉시 이용정지를 해제 합니다.</li>
    </ol>
    <h6 class="tit_sub">제6조(회원의 가입)</h6>
    <ol class="list_circle">
        <li><span>①</span> "회원"은 "Kortory"가 정한 가입양식에 따라 개인정보를 기재 후 각 규정에 동의 등의 등록절차를 거쳐 회원가입은 완료됩니다.</li>
        <li><span>②</span> "회원"이 가입화면 내 동의란에 체크하는 것은 "Kortory"가 정하는 규정에 합법적으로 동의하는 것으로 간주됩니다. 
        <li><span>④</span> 다음 각 호에 해당하는 자는 "회원"으로 등록할 수 없습니다.
            <ol class="list_number">	
                <li>타인 또는 허무인 명의로 가입을 신청한 경우</li>
                <li>회원가입 신청서 내용의 일부 또는 전부를 허위로 기재한 경우</li>
            </ol>
        </li>
        <li><span>⑤</span> "회원"은 등록사항에 대하여 변동이 발생한 경우 "kortory.co.kr" 내 회원정보변경을 통해 직접 변동사항을 수정, 등록함으로써 최신의 정보가 유지되도록 하여야 합니다.</li>
        <li><span>⑥</span> 회원가입신청서에 기입한 모든 정보는 실제정보와 동일한 것으로 간주되며 정보를 입력하지 않거나 수정하지 않음으로 인해 발생하는 불이익은 "회원"이 부담하게 됩니다.</li>
    </ol>
    <h6 class="tit_sub">제7조(회원 ID·Password)</h6>	
    <ol class="list_circle">
        <li><span>①</span> "kortory.co.kr" 서비스를 이용하고자 하는 "회원"은 "Kortory"가 정하는 바에 따라 회원 ID 및 Password를 등록하여야 합니다.</li>
        <li><span>②</span> "회원"에게 부여된 ID·Password의 관리 소홀, 부정사용에 의하여 발생하는 모든 결과에 대한 책임은 "회원"에게 있습니다.</li>
        <li><span>③</span> 타인이 자신의 회원 ID·Password를 부정하게 사용한 경우 "회원"은 즉시 "Kortory"에 그 사실을 통보해야 하며 "Kortory"의 별도 안내가 있는 경우에는 그에 따라야 합니다.</li>
    </ol>
    <h6 class="tit_sub">제8조(회원탈퇴 및 자격의 상실)</h6>		
    <ol class="list_circle">
        <li><span>①</span> 탈퇴를 희망하는 "회원"은 "kortory.co.kr"의 마이페이지에서 회원탈퇴 기능을 통해 언제든지 용이하게 탈퇴할 수 있습니다.</li>
        <li><span>②</span> "Kortory"는 12개월간 이용내역이 없는 회원의 개인정보를 다른 회원의 개인정보와 분리하여 휴면회원으로 저장·관리합니다.</li>
        <li><span>③</span> "Kortory"는 "회원"이 다음 각 호에 해당하는 행위를 한 경우 사전통지 없이 이용 계약을 해지 하거나 기간을 정하여 서비스 이용을 중지할 수 있습니다.
            <ol class="list_number">
                <li>타인의 회원정보를 도용한 경우</li>
                <li>서비스 운영을 고의로 방해한 경우</li>
                <li>등록한 정보가 실제정보와 상이한 경우</li>
                <li>공공질서 및 미풍양속에 저해되는 내용을 고의로 유포시킨 경우</li>
                <li>국익 또는 사회적 공익을 저해할 목적으로 서비스를 이용하는 경우</li>
                <li>"Kortory" 또는 타인의 명예를 손상시키거나 불이익을 주는 행위를 한 경우</li>
                <li>사망한 경우</li>
                <li>본 규정 제13조의 의무를 이행하지 않은 경우</li>
                <li>본 조 제2항에 따라 휴면회원이 된 후 4년이 경과할 때까지 “회원” 자격을 활성화하지 아니하는 경우</li>
            </ol>
        </li>
        <li><span>④</span> 전항에 의한 회원탈퇴 또는 자격상실 효력발생일은 아래 각 호와 같습니다.
            <ol class="list_number">
                <li>회원탈퇴일 또는 "Kortory"의 회원자격상실 통보일</li>
                <li>사망으로 인한 자격상실의 경우에는 그 사망일</li>
            </ol>
        </li>
    </ol>
    <h6 class="tit_sub">제9조(판매상품 등에 대한 구입)</h6>		
    <ol class="list_circle">
        <li><span>①</span> 이용자는 "kortory.co.kr"에서 정한 방식에 따라 판매상품을 구매 할 수 있습니다.</li>
        <li><span>②</span> "Kortory"는 전항의 구매에 대하여 다음 각 호에 해당하는 경우에는 "회원"의 구매에 대하여 승인을 취소할 수 있습니다.
            <ol class="list_number">
                <li>신청내용 상 허위·기재누락·오기가 있는 경우</li>
                <li>구매신청 내용이 현행법령이나 "Kortory"의 규정에 부적합한 경우</li>
            </ol>
        </li>
        <li><span>③</span> 이용자는 구매한 상품에 대하여 구매를 취소하거나 변경을 요청할 수 있으며, 이 경우 별도의 수수료가 발생할 수 있습니다.</li>
    </ol>
    <h6 class="tit_sub">제10조(결제방식)</h6>		
    <p>"kortory.co.kr"에서 판매되는 상품을 구입한 이용자는 "Kortory"가 정한 다음 각 호의 방식중 하나를 선택하여 대금을 결제할 수 있습니다.</p>
    <ol class="list_number">	
        <li>신용카드 결제</li>
        <li>계좌이체</li>
        <li>기타 "Kortory"가 정한 결제방식</li>
    </ol>
    <h6 class="tit_sub">제11조(정보의 제공)</h6>		
    <p>"Kortory"는 "회원"이 서비스 이용 중 필요가 있다고 인정되는 다양한 정보에 대하여 전자우편, 유선매체, 서신우편 등의 방법으로 "회원"에게 제공할 수 있습니다.</p>
    <h5 class="tit">제3장 책임과 의무</h5>
    <h6 class="tit_sub">제12조(Kortory의 의무)</h6>		
    <ol class="list_circle">	
        <li><span>①</span> "Kortory"는 법령과 본 규정이 금지한 행위를 하지 아니하며, 본 규정이 정하는 바에 따라 지속적이고, 안정적인 서비스를 제공하는 데 최선을 다하도록 하겠습니다.</li>
        <li><span>②</span> "Kortory"는 "kortory.co.kr"를 통해 제공하는 상품이나 서비스에 대하여 표시·광고의 공정화에 관한 법률 제3조에서 정한 부당한 표시, 광고행위를 하지 않겠습니다.</li>
        <li><span>③</span> "Kortory"는 "kortory.co.kr"에 대한 공정하고 건전한 운영을 통하여 전자상거래질서를 유지하고, 지속적인 연구·개발을 통하여 양질의 서비스를 제공하도록 노력하겠습니다.</li>
    </ol>
    <h6 class="tit_sub">제13조(회원의 의무)</h6>	
    <ol class="list_circle">	
        <li><span>①</span> "회원"은 관련 법령, "Kortory"가 규정에서 정한 사항 및 주의사항으로서 고지한 내용을 준수하여야 하며, "Kortory"의 정상적 업무를 방해하는 행위를 하여서는 아니 됩니다.</li>
        <li><span>②</span> "회원"은 가입신청 시 사실에 입각하여 정직하고 성실하게 가입신청서를 작성하여야 하며, 기재한 사항에 대한 변경사유가 발생하는 경우 사실에 맞게 변경해야 합니다. 만일 변경사유가 발생하였음에도 불구하고 변경하지 않아 발생하게 되는 모든 문제에 대해서는 "회원"이 책임을 부담하게 됩니다.</li>
        <li><span>③</span> "회원"은 서비스의 이용과정에서 습득한 정보를 "Kortory"의 사전동의 없이 임의로 복사·복제·변경해서는 아니 되며, 기타 영리목적으로 활용하여서도 아니 됩니다.</li>
        <li><span>④</span> "회원"은 전항의 행위 외에도 다음 각 호의 행위를 하여서는 아니 됩니다.
            <ol class="list_number">
                <li>타 회원 또는 제3자를 비방하여 명예를 손상시키는 경우</li>
                <li>타 회원의 계정 및 개인정보를 부정하게 사용하는 경우</li>
                <li>제3자의 저작권 등 기타 권리를 침해하는 경우</li>
                <li>공공질서 및 미풍양속에 위반되는 내용을 타인에게 유포하는 경우</li>
                <li>범죄와 결부되거나 주제에 관계없는 광고성 내용을 기재한 경우</li>
                <li>마일리지의 부정 적립·사용 등 마일리지 서비스를 부정한 방법·목적으로 이용한 경우</li>
                <li>기타 관계법령에 위반 된다고 판단되는 경우</li>
            </ol>
        </li>
        <li><span>⑤</span> "Kortory"는 본조에 해당하는 행위를 한 "회원"에게 사전통지 없이 이용을 제한할 수 있습니다.</li>
    </ol>
    <h5 class="tit">제4장 정보의 보호</h5>
    <h6 class="tit_sub">제14조(개인정보의 보호)</h6>
    <ol class="list_circle">
        <li><span>①</span> "Kortory"는 이용자로부터 정보를 수집할 경우 서비스의 제공 및 계약이행에 필요한 최소한의 정보만을 수집합니다.</li>
        <li><span>②</span> 개인정보 처리에 관한 상세한 내용은 "Kortory" 홈페이지에 게시된 “개인정보 처리방침”에 따릅니다.</li>
    </ol>
    <h5 class="tit">제5장 기 타</h5>
    <h6 class="tit_sub">제15조(규정의 게시 및 개정)</h6>
    <ol class="list_circle">
        <li><span>①</span> "Kortory"는 "Kortory"가 정하는 규정의 내용을 "회원"이 쉽게 알 수 있도록 "kortory.co.kr" 초기 화면에 게시합니다.</li>
        <li><span>②</span> "Kortory"는 규정을 개정할 수 있으며, 개정규정은 본 규정 제17조에 따라 공시합니다.</li>
        <li><span>③</span> "Kortory"는 규정을 개정하는 경우 개정사유 및 시행일자를 명시하여 현행규정과 함께 시행일로부터 최소 7일전에 공지합니다. 단, "회원"의 권리 또는 의무에 관한 중요한 규정의 변경은 변경일로부터 30일 전에 본 규정 제17조에 따라 통지합니다.</li>
        <li><span>④</span> "Kortory"의 본 조 제3항에 따른 개정규정 공지 또는 통지 후 "회원"이 규정 변경 적용일까지 명시적으로 거부의사를 표명하지 않은 경우 "회원"이 개정규정에 동의한 것으로 봅니다. </li>
        <li><span>⑤</span> "회원"은 규정개정에 대하여 주의의무를 다하여야 하며, 변경된 규정의 부지로 인한 "회원"의 피해는 "Kortory"가 책임지지 않습니다.</li>
    </ol>
    <h6 class="tit_sub">제16조(지식재산권의 귀속)</h6>
   <ol class="list_circle">
        <li><span>①</span> "Kortory"가 작성한 저작물에 대한 지식재산권은 "Kortory"에 귀속됩니다.</li>
        <li><span>②</span> "회원"은 "kortory.co.kr"을 통하여 얻은 정보를 가공, 판매하는 행위 또는 서비스에 기재된 자료를 상업적으로 사용할 수 없습니다.</li>
    </ol>
    <h6 class="tit_sub">제17조(회원에 대한 통지)</h6>
   <ol class="list_circle">
        <li><span>①</span> "Kortory"가 "회원"에 대하여 통지하는 경우 "회원"이 제출한 전자우편 또는 이동통신으로 할 수 있습니다.</li>
        <li><span>②</span> "Kortory"는 불특정다수의 "회원"에게 통지하는 경우, "kortory.co.kr" 초기화면에 7일 이상 공시함으로써 개별통지에 갈음할 수 있습니다. 다만, "회원" 본인의 거래와 관련하여 중대한 영향을 미치는 사항에 대하여는 개별통지를 합니다.</li>
        <li><span>③</span> 전항의 사유로 통지하는 경우, 부득이한 사정에 의해 사전 공시기간이 감축되거나 생략될 수 있습니다.</li>
    </ol>
    <h6 class="tit_sub">제18조(분쟁해결)</h6>
   <ol class="list_circle">
        <li><span>①</span> "Kortory"는 이용자가 제기하는 정당한 의견이나 불만을 반영하고 그 피해를 보상처리하기 위하여 피해보상처리기구를 설치․운영합니다.</li>
        <li><span>②</span> "Kortory"는 이용자로부터 제출되는 불만사항 및 의견은 우선적으로 그 사항을 처리합니다. 다만, 신속한 처리가 곤란한 경우에는 이용자에게 그 사유와 처리일정을 즉시 통보해 드립니다.</li>
        <li><span>③</span> "Kortory"와 이용자 간에 발생한 전자상거래 분쟁과 관련하여 이용자의 피해구제신청이 있는 경우에는 공정거래위원회 또는 시·도지사가 의뢰하는 분쟁조정기관의 조정에 따를 수 있습니다.</li>
    </ol>
    <h6 class="tit_sub">제19조(관할 법원)</h6>
   <ol class="list_circle">
        <li><span>①</span> "Kortory"에서 정하는 규정에서 정하지 않은 사항과 본 규정의 해석은 관계법령 및 상관례에 따릅니다.</li>
        <li><span>②</span> "Kortory"에서 정하는 규정과 관련된 모든 분쟁은 제소 당시 이용자의 주소에 의하고, 주소가 없는 경우에는 거소를 관할하는 지방법원의 전속관할로 합니다. 다만, 제소 당시 이용자의 주소 또는 거소가 분명하지 않거나 외국 거주자의 경우에는 민사소송법상의 관할법원에 제기합니다. 동 소송에는 대한민국법을 적용하도록 합니다.</li>
    </ol>
    <h6 class="tit_sub">제20조(규정의 효력)</h6>
   <ol class="list_circle">
        <li><span>①</span> 본 규정은 2019년 12월 1일부터 시행합니다.</li>
        <li><span>②</span> 개정규정은 그 개정일로부터 효력이 발생하며 개정된 규정은 그 적용일자 이후에 체결되는 계약에만 적용되고 그 이전에 이미 체결된 계약에 대해서는 개정 전의 규정조항이 그대로 적용됨을 원칙으로 합니다. 다만 이미 계약을 체결한 이용자가 개정약관 조항의 적용을 받기를 원하는 뜻을 개정규정의 효력발생일 전에 "Kortory"에 송신하여 "Kortory"의 동의를 받은 경우에는 개정규정조항이 적용됩니다.</li>
    </ol>

							</div>
						</div>
					</div>
					</div>
					</div>
					<div class="box_check">
					
						<input type="checkbox" name="privacy_check" id="privacy_check1" value="2" class="chk_step"><label for="privacy_check1"><span></span>
									
									인터넷 회원약관에 동의합니다.
								
						</label>
					</div>
				
					
			</div>
			</div>
		 <button class="w3-button w3-block w3-section w3-yellow w3-ripple w3-padding" id="send">가입</button>
		 </form:form>
		</div>
		 
</body>
</html>