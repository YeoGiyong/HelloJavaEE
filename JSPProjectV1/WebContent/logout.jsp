<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- 세션변수 제거 -->
<c:remove var="myuid" scope="session"/>
<c:remove var="myname" scope="session" />
<c:remove var="mydate" scope="session"/>


<!-- index 페이지로 이동 -->
<c:redirect url="index.jsp"/>