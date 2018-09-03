<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp" %>
<body>
<div id="wrapper"> 
<jsp:include page="/WEB-INF/views/menu/left.jsp" />
	<div id="page-content-wrapper">
		<table class = "table table-bordered">
			<thead>
			<tr>
				<th>번호</th>
				<th>메뉴이름을입력</th>
				<th>메뉴가격히</th>
				<th>설명부탁</th>
			</tr>
			</thead>
			<tbody>
			<tr>
				<c:forEach  items="${tl}" var="tt">
					<td><a href = "/tMenu/TmenuView?meiNum=${tt.meiNum}"></a>${tt.meiNum}</td>
					<td>${tt.meiName}</td>
					<td>${tt.meiPrice}</td>
					<td>${tt.meiDesc}</td>
				
				</c:forEach>
			</tr>
			</tbody>
		</table>
	</div>
</div>
<jsp:include page="/WEB-INF/views/menu/bottom.jsp" /> 