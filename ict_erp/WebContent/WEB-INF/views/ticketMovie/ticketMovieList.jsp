<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp" %>
<body>
<div id="wrapper">
<jsp:include page="/WEB-INF/views/menu/left.jsp" />
	<div id="page-content-wrapper">
	<div class = "container">
		<table class = "table table-bordered">
			<thead>
				<tr>
					<th>번호</th>
					<th>이름</th>
					<th>가격</th>
					<th>시작시간</th>
					<th>끝나는시간</th>
					<th>흐음</th>
					<th>설명</th>
					<th>뭔가번호</th>
					<th>영화포스터</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${ticketList}" var="ti">
				<tr>
					<td>${ti.tmNum}</td>
					<td>${ti.tmName}</td>
					<td>${ti.tmPrice}</td>
					<td>${ti.tmStartDat}</td>
					<td>${ti.tmEndDat}</td>
					<td>${ti.tmCredat}</td>
					<td>${ti.tmDesc}</td>
					<td>${ti.tmCnt}</td>
					<td>${ti.tmImg}</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	</div>
</div>
<jsp:include page="/WEB-INF/views/menu/bottom.jsp" />