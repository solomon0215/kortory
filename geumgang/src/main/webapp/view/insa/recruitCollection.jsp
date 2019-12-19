<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:if test = "${recult != null}" >
	번호 : ${recruitDTO.recruitNum}<br />
	제목 : ${recruitDTO.recruitTitle}<br />
	작성자 : ${authLog.name}<br />
	등록일 : ${recruitDTO.recruitRegiDate}<br />
</c:if>
</body>
</html>