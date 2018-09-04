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
				<th>제목</th>
				<th>가수</th>
				<th>밴드</th>
				<th>좋아요</th>
				<th>싫어요</th>
				<th>시간</th>
				<th>설명</th>
			</tr>
				<c:forEach items ="${tList}" var = "ti">
				<tr>
					<td><input type="text" name="mcNum" value="${ti.mcNum }"></td>
					<td><input type="text" name="mcName" value="${ti.mcName }"></td>
					<td><input type="text" name="mcSinger" value="${ti.mcSinger }"></td>				
					<td><input type="text" name="mcVendor" value="${ti.mcVendor }"></td>			
					<td><input type="text" name="mcLike" value="${ti.mcLike }"></td>		
					<td><input type="text" name="mcDisLike" value="${ti.mcDisLike }"></td>	
					<td><input type="text" name="mcCredate" value="${ti.mcCredate }"></td>	
					<td><input type="text" name="mcDesc" value="${ti.mcDesc }"></td>
				</tr>			
				</c:forEach>
		</table>
	</div>
</div>
<jsp:include page="/WEB-INF/views/menu/bottom.jsp" /> 