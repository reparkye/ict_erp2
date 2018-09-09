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
					<th>영화제목</th>
					<th>표 가격</th>
					<th>영화 상영일</th>
					<th>영화 종료일</th>
					<th>모르겠음</th>
					<th>설명</th>
					<th>두번쨰맞나</th>
					<th>이미지</th>
			</tr>
			<c:forEach items="${tList}" var="two">
				<tr>
					<td>${two.tmNum}</td>
					<td>${two.tmName}</td>
					<td>${two.tmPrice}</td>
					<td>${two.tmStartDat}</td>
					<td>${two.tmEndDat}</td>
					<td>${two.tmCredat}</td>
					<td>${two.tmDesc}</td>
					<td>${two.tmCnt}</td>
					<td><img src="${two.tmImg}" width="50"></td>
				</tr>
			</c:forEach>
			<c:if test="${empty tList}">
				<tr>
					<td colspan="8">다시등록바람</td>
				</tr>
			</c:if>
		</table>
		
		
	</div>
</div>
<jsp:include page="/WEB-INF/views/menu/bottom.jsp" /> 