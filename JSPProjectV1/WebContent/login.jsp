<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
	<head>
		<meta charset="UTF-8">
		<title>JSP 프로젝트 V1</title>
		<link href="./css/normalize.css" rel="stylesheet">
		<link href="./css/yeogiyong.css" rel="stylesheet">
	
	<style>
		#loginfrm{width:400px;margin:0 auto;
				  padding-top:150px }
		#loginfrm label{width:120px;
						display:inline-block;
						text-align:right;
						font-weight:bold;}
		#loginfrm div{margin: 7px 0;}
		
	</style>
		
	
	
	</head>
	<body>
		<jsp:include page="layout/header.jsp"/>
		
		<div id="contents"> <!-- 본문시작 -->
		
		<h1>로그인</h1>
		
		<form id="loginfrm" method="post" action="loginok.jsp">
			<div>
				<label for="uid">아이디</label>
				<input type="text" name="uid" id="uid">
			</div>
		
			<div>
				<label for="pwd">비밀번호</label>
				<input type="password" name="pwd" id="pwd">
			</div>
			
			<div>
				<label></label>
				<button type="submit">로그인</button>
			</div>
		
		</form>
		
		</div>			<!-- 본문 -->
		
		<jsp:include page="layout/footer.jsp"/>
	</body>
</html>