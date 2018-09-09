<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp" %>
<body>
<div id="wrapper"> 
<jsp:include page="/WEB-INF/views/menu/left.jsp" />
	<div id="page-content-wrapper">
		<table class = "table table-bordered">
			<tr>
				<th>번호</th>
				<td><input type= "text" name="mcNum" value="${mu.mcNum}"></td>
			</tr>
			<tr>
				<th>노래제목</th>
				<td><input type="text" name="mcName" value="${mu.mcName}"></td>
			</tr>
			<tr>
				<th>가수이름</th>
				<td><input type= "text" name="mcSinger" value="${mu.mcSinger}"></td>
			</tr>
			<tr>
				<th>밴드</th>
				<td><input type="text" name="mcVendor" value="${mu.mcVendor}"></td>
			</tr>
			<tr>
				<th>좋아요</th>
				<td><input type= "text" name="mcLike" value="${mu.mcLike}"></td>
			</tr>
			<tr>
				<th>싫어요</th>
				<td><input type="text" name="mcDisLike" value="${mu.mcDisLike}"></td>
			</tr>
			<tr>
				<th>날짜입력란</th>
				<td><input type= "text" name="mcCredate" value="${mu.mcCredate}"></td>
			</tr>
			<tr>
				<th>어떤종료의 음악</th>
				<td><input type="text" name="mcDesc" value="${mu.mcDesc}"></td>
			</tr>
		</table>
		
	</div>
</div>
<jsp:include page="/WEB-INF/views/menu/bottom.jsp" /> 