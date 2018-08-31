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
					<th>노래제목</th>
					<th>가수명</th>
					<th>밴드</th>
					<th>숫자</th>
					<th>숫자2</th>
					<th>날짜</th>
					<th>종류</th>
				</tr>
			</thead>
			<tbody id="musicTbody">
			<c:forEach items="${musicList}" var="music">
				<tr>
					<td><a href = "/music/musicView?mcNum=${music.mcNum}">${music.mcNum}</a></td>
					
					<td>${music.mcName}</td>
					<td>${music.mcSinger}</td>
					<td>${music.mcVendor}</td>
					<td>${music.mcLike}</td>
					<td>${music.mcDislike}</td>
					<td>${music.mcCredat}</td>
					<td>${music.mcDesc}</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
		<button data-page = "/views/music/musicInsert">추가</button>
	</div>
</div>
</div>
<jsp:include page="/WEB-INF/views/menu/bottom.jsp" /> 