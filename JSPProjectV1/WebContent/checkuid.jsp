<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>


<c:set var="uid" value ="${param.uid}"/>

<sql:query var="rs" dataSource="jdbc/oracle" 
	sql="select userid from member where userid = ?">
	<sql:param value="${uid}"/>
</sql:query>

<c:forEach var="row" items="${rs.rows}">
	<c:if test="${not empty row.userid }">
		<c:out value="${row.userid}"/>
	</c:if>
</c:forEach>