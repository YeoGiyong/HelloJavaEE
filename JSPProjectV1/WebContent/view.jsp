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
			#view{width:75%;margin:0 auto;
				  padding-top:85px;}
		    #view label{width:80px;
		    	  display:inline-block;
		    	  font-weight:bold;}
			#view div{margin:10px 0;}
			#content{display:inline-block;
					border:1px solid indigo;
					width:540px;}
			.dragup{vertical-align:top;}
		
		</style>
	

	</head>
		<body>
			<jsp:include page="layout/header.jsp"/>
		
			<div id="contents">  <!-- 본문 시작 -->
				<h2>게시판 본문글</h2>
				<div id="view">
					<div>
						<label>제목</label>
						<span>시간은 금이라구, 친구! 진짜라구, 친구! 참말이라구, 친구! 정말이라구, 친구!</span>
					</div>
					
					<div>
						<label>작성자</label>
						<span>yeogiyong</span>
					</div>
					
					<div>
						<label>작성일</label>
						<span>2018-01-15 12:35:30</span>
					</div>
					
					<div>
						<label class="dragup">본문</label>
						<span id="content">시간은 금이라구, 친구! 진짜라구, 친구! 참말이라구, 친구! 정말이라구, 친구!시간은 금이라구, 친구! 진짜라구, 친구! 참말이라구, 친구! 정말이라구, 친구!시간은 금이라구, 친구! 진짜라구, 친구! 참말이라구, 친구! 정말이라구, 친구!시간은 금이라구, 친구! 진짜라구, 친구! 참말이라구, 친구! 정말이라구, 친구!시간은 금이라구, 친구! 진짜라구, 친구! 참말이라구, 친구! 정말이라구, 친구!시간은 금이라구, 친구! 진짜라구, 친구! 참말이라구, 친구! 정말이라구, 친구!시간은 금이라구, 친구! 진짜라구, 친구! 참말이라구, 친구! 정말이라구, 친구!시간은 금이라구, 친구! 진짜라구, 친구! 참말이라구, 친구! 정말이라구, 친구!</span>
					</div>
				
				
				</div>
		
		   </div> <!-- 본문 끝 -->
		   
		  <jsp:include page="layout/footer.jsp"/> 
		</body>
	
			
		
</html>