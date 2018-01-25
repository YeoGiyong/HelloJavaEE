<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<header> <!-- 머릿글 시작 -->
			<h1>JSP 프로젝트 V1</h1>
			<ul>
				<li><a href="index.jsp">Home</a></li>
				<li><a href="join.jsp">회원가입</a></li>
				
				<c:if test="${empty myuid }">
				<li><a href="login.jsp">로그인</a></li>
				</c:if>
				
				<c:if test="${not empty myuid }">
				<li><a href="logout.jsp">로그아웃</a></li>
				</c:if>
				
				
				<li><a href="list.jsp">게시판</a></li>
				<li><a href="myinfo.jsp">회원정보</a></li>
			</ul>
			<hr>	<!-- 라인 삽입 -->
</header>	<!-- 머릿글 끝-->