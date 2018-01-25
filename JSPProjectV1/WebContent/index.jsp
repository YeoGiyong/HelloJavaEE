<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
	<head>
		<meta charset="UTF-8">
		<title>JSP 프로젝트 V1</title>
		<link href="./css/normalize.css" rel="stylesheet">
		<link href="./css/yeogiyong.css" rel="stylesheet">
		
		<style>
			img{margin: 10px 200px;}
		</style>
		
	</head>
	
	<body>
		<jsp:include page="layout/header.jsp"/>	
		
		<div id="contents"> <!-- 본문 시작 -->

		<div>
			<img src="./images/gorapaduk.jpg">
		</div>

		</div>	<!-- 본문 끝 -->
		
		<jsp:include page="layout/footer.jsp"/>
	</body>
</html>