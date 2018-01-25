<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- 로그인 하지 않았다면 = 세션 데이터가 없다면 -->
<c:if test="${empty myuid }">
	<c:redirect url="login.jsp"/>
</c:if>

<!DOCTYPE html>
<html lang="ko">
	<head>
		<meta charset="UTF-8">
		<title>JSP 프로젝트 V1</title>
		<link href="./css/normalize.css" rel="stylesheet">
		<link href="./css/yeogiyong.css" rel="stylesheet">	
	
	<style>
		#myinfo{width:350px; margin:0 auto; padding-top: 125px;}
		#myinfo label{width:120px;display:inline-block;text-align:right;
					  font-weight:bold;padding-right:15px}
		#myinfo div{margin:7px 0;}
		
	</style>
	

	</head>
		<body>
			<jsp:include page="layout/header.jsp"/>
		
				<div id="contents">  <!-- 본문 시작 -->
				
				<h1>회원정보</h1>
					
				<div id="myinfo">
					<div>
						<label>아이디</label>
						<span>${myuid }</span>
					</div>
					<div>
						<label>이름</label>
						<span>${myname }</span>
					</div>
					<div>
						<label>가입일</label>
						<span>${mydate }</span>
					</div>
				</div>	
				</div> <!-- 본문 끝 -->
				
				<jsp:include page="layout/footer.jsp"/>
		</body>
	
</html>