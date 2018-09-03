<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp" %>
<body>
<div id="wrapper"> 
<jsp:include page="/WEB-INF/views/menu/left.jsp" />
	<div id="page-content-wrapper">
			<table class="table table-bordered">
				<tr>
					<td><input type="text" name="meiNum" value="${mei.meiNum}"></td>
				</tr>
				<tr>
					<td><input type="text" name="meiName" value="${mei.meiName}"></td>
				</tr>
				<tr>
					<td><input type="text" name="meiPrice" value="${mei.meiPrice}"></td>
				</tr>
				<tr>
					<td><input type="text" name="meiDesc" value="${mei.meiDesc}"></td>
				</tr>
			</table>
	</div>
</div>
<jsp:include page="/WEB-INF/views/menu/bottom.jsp" /> 