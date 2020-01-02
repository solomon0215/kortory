<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>
	<dvi class =" w3-container">
		<center><h2>협력업체 계약서 목록</h2></center><br/>
			
			<table class="w3-table-all">
    <thead>
     <table class="w3-table-all w3-centered">
      <tr class="w3-green">
        <th>번호</th>
         <th>제목</th>
          <th>작성자</th>
        <th>작성일</th>
      </tr>
    </thead>
   <tbody>
						<c:forEach var="coop" items="${coop}" varStatus="status">
							<tr>
								<td>${status.count }</td>
								<td><a href='<c:url value='/gwanri/coopDetail?num=${coop.coopContractNum }'/>'${coop.coopContractNum}'>${coop.coopContractSubject }</a></td>
								<td>${authName}</td>
								<td>${coop.coopContractDate }</td>

							</tr>
						</c:forEach>
					</tbody>
  </table>
  </dvi>
 
</div>
</body>
</html>