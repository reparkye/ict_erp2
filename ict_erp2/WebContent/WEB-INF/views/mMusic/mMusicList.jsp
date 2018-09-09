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
					<td><a href ="/mMusic/mMusicView?mcNum=${ti.mcNum}">${ti.mcNum}</a></td>
					<td>${ti.mcName }</td>
					<td>${ti.mcSinger }</td>				
					<td>${ti.mcVendor }</td>			
					<td>${ti.mcLike }</td>		
					<td>${ti.mcDisLike }</td>	
					<td>${ti.mcCredate }</td>	
					<td>${ti.mcDesc }</td>
				</tr>			
				</c:forEach>
		</table>
	</div>
</div>
<jsp:include page="/WEB-INF/views/menu/bottom.jsp" /> 