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
<title>인사고과 작성</title>
</head>
<body>
	
		<table class="w3-table w3-border">
			<tr>
				<td class="w3-border" rowspan="4">인사고과</td>
				<td class="w3-border w3-light-gray">부서명</td>
				<td class="w3-border">인사부</td>
			</tr>
			<tr>
				<td class="w3-border w3-light-gray">작성자</td>
				<td class="w3-border">김지유</td>
			</tr>
			<tr>
				<td class="w3-border w3-light-gray">사원명</td>
				<td class="w3-border">ooo</td>
			</tr>
			<tr>
				<td class="w3-border w3-light-gray">아이디</td>
				<td class="w3-border">ooo</td>
			</tr>			
		</table>
		
		<br />
		<table class="w3-table w3-border">
		<tr>
			<td class="w3-border-right w3-light-gray" rowspan="2" colspan="2">고과요소</td>
			<td class="w3-border-right w3-light-gray" rowspan="2">착안점</td>
			<td class="w3-border-right w3-light-gray" colspan="3">고과자</td>
			<td class="w3-border-right w3-light-gray" rowspan="2">비고</td>
		</tr>
		<tr>
			<td class="w3-border-right">1차</td>
			<td class="w3-border-right">2차</td>
			<td class="w3-border-right">3차</td>
		</tr>	
		<tr>
			<td class="w3-border-right" rowspan="3">업적</td>
			<td class="w3-border-right">업무달성도	</td>
			<td class="w3-border-right"> 
			계획, 지시에 의해 부과된 업무의 달성 여부와 타 직원과의 업무량 비교 및 일정 기간 내의 달성 여부</td>
			<td class="w3-border-right"></td>
			<td class="w3-border-right"></td>
			<td class="w3-border-right"></td>
			<td class="w3-border-right"></td>
		</tr>
		<tr>	
		 	<td class="w3-border-right">업무의 질</td>
		 	<td class="w3-border-right">
		 	업무 달성 결과의 질적 수준과 착오 누락오류의 발생 빈도 및 업무 오류의 경중</td>
		 	<td class="w3-border-right"></td>
			<td class="w3-border-right"></td>
			<td class="w3-border-right"></td>
			<td class="w3-border-right"></td>
		</tr>
		<tr>
			<td class="w3-border-right">업무개선</td>
		 	<td class="w3-border-right">
		 	담당 업무 수행 시 능률 향상을 위한 구체적인 개선책 및 해결책을 꾸준히 모색하고 있는지의 여부</td>
		 	<td class="w3-border-right"></td>
			<td class="w3-border-right"></td>
			<td class="w3-border-right"></td>
			<td class="w3-border-right"></td>
		</tr>
		
		<tr>
			<td class="w3-border-right" rowspan="4">능력</td>
			<td class="w3-border-right">업무지식</td>
			<td class="w3-border-right"> 
			당사 직무 수행에 필요한 사무 지식 및 전문적 지식의 정도</td>
			<td class="w3-border-right"></td>
			<td class="w3-border-right"></td>
			<td class="w3-border-right"></td>
			<td class="w3-border-right"></td>
		</tr>
		<tr>	
		 	<td class="w3-border-right">기획창의력</td>
		 	<td class="w3-border-right">
		 	창의력을 바탕으로 주도면밀한 계획을 수립하여 이를 실천하는 능력</td>
		 	<td class="w3-border-right"></td>
			<td class="w3-border-right"></td>
			<td class="w3-border-right"></td>
			<td class="w3-border-right"></td>
		</tr>
		<tr>
			<td class="w3-border-right">분석판단력</td>
		 	<td class="w3-border-right">
		 	계획, 지시된 업무의 문제점을 파악, 분석하여 올바른 결론과 정확한 대책을 강구하는 능력</td>
		 	<td class="w3-border-right"></td>
			<td class="w3-border-right"></td>
			<td class="w3-border-right"></td>
			<td class="w3-border-right"></td>
		</tr>
		<tr>
			<td class="w3-border-right">실천력</td>
		 	<td class="w3-border-right">
		 	계획, 지시된 업무를 적극적으로 끝까지 추진하는 능력</td>
		 	<td class="w3-border-right"></td>
			<td class="w3-border-right"></td>
			<td class="w3-border-right"></td>
			<td class="w3-border-right"></td>
		</tr>
		
		<tr>
			<td class="w3-border-right" rowspan="4">태도</td>
			<td class="w3-border-right">책임감	</td>
			<td class="w3-border-right"> 
			맡은바 일을 책임감 있게 수행하고 그 결과에 대하여 책임을 지는 태도</td>
			<td class="w3-border-right"></td>
			<td class="w3-border-right"></td>
			<td class="w3-border-right"></td>
			<td class="w3-border-right"></td>
		</tr>
		<tr>	
		 	<td class="w3-border-right">협동심</td>
		 	<td class="w3-border-right">
		 	상사, 동료와의 협조 및 협동 관계가 긴밀한 정도</td>
		 	<td class="w3-border-right"></td>
			<td class="w3-border-right"></td>
			<td class="w3-border-right"></td>
			<td class="w3-border-right"></td>
		</tr>
		<tr>
			<td class="w3-border-right">근무태도</td>
		 	<td class="w3-border-right">
		 	당사 직원으로서의 기본적인 인격을 갖추고 있는지의 여부</td>
		 	<td class="w3-border-right"></td>
			<td class="w3-border-right"></td>
			<td class="w3-border-right"></td>
			<td class="w3-border-right"></td>
		</tr>
		<tr>
			<td class="w3-border-right">근면성</td>
		 	<td class="w3-border-right">
		 	성실 근면한 자세로 업무에 임하고 있는지의 여부</td>
		 	<td class="w3-border-right"></td>
			<td class="w3-border-right"></td>
			<td class="w3-border-right"></td>
			<td class="w3-border-right"></td>
		</tr>
		<tr>
			<td class="w3-border-right" colspan="3">종합점수</td>
			<td class="w3-border-right"></td>
			<td class="w3-border-right"></td>
			<td class="w3-border-right"></td>
			<td class="w3-border-right"></td>
	</table>
	<br />
		<table class="w3-table w3-border">
		<tr>
			<td class="w3-border-right" rowspan="2">고과등급
			<td class="w3-border-right">탁월</td>
			<td class="w3-border-right">우수</td>
			<td class="w3-border-right">양호</td>
			<td class="w3-border-right">보통</td>
			<td class="w3-border-right">미흡</td>
		</tr>	
		<tr>
			<td class="w3-border-right">S</td>
			<td class="w3-border-right">A</td>
			<td class="w3-border-right">B</td>
			<td class="w3-border-right">C</td>
			<td class="w3-border-right">D</td>
		</tr>
		</table>
			
</body>
</html>