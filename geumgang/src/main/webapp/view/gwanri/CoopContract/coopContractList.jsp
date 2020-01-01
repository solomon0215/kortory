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
						<c:forEach var="budget" items="${budget}" varStatus="status">
							<tr>
								<td>${status.count }</td>
								<td><a
									href='<c:url value='/gwanri/budgetBillView?num=${budget.budgetBillNum }'/>'${budget.budgetBillNum}'>${budget.budgetBillSubject }</a></td>
								<td>${authName}</td>
								<td>${budget.budgetBillDate }</td>

							</tr>
						</c:forEach>
					</tbody>
  </table>
  </dvi>
  <div class="w3-container" align="center">
   <a href="budgetBillWrite" class="w3-btn w3-green">작성</a>
</div>
  
</div>
</body>
</html>