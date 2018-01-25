<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>    
    
<jsp:useBean id="mi" scope="page" class="yeogiyong.jspv1.Userinfo"/>
<jsp:setProperty property="*" name="mi" />   
    
<sql:update dataSource="jdbc/oracle" 
	sql="insert into member(userid,pwd,name) values (?,?,?)">
	<sql:param value="${mi.uid }"/>
	<sql:param value="${mi.pwd }"/>
	<sql:param value="${mi.name }"/>	
</sql:update>    
    
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
			<h2>회원가입 처리결과</h2>
			<div>아이디 : <jsp:getProperty property="uid" name="mi"/> </div>	
			<div>이름 : <jsp:getProperty property="name" name="mi"/></div>
			<hr>
			<div><button type="button">로그인 하러 가기</button></div>
	
		</div>	<!-- 본문 끝 -->
		
		<jsp:include page="layout/footer.jsp"/>
	</body>
</html>