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
				<th>Number</th>
				<th>노래제목이</th>
				<th>가수이름</th>
				<th>밴드</th>
				<th>좋아요</th>
				<th>싫어요</th>
				<th>곡 날짜</th>
				<th>어떤 음악인지</th>
			</tr>
			</thead>
			<tbody>
			<c:forEach items="${chartList}" var="mch">
			<tr>
				<td><a href= "/mMusic/mMusicView?mcNum=${mch.mcNum}">${mch.mcNum}</a></td>
				<td>${mch.mcName}</td>
				<td>${mch.mcSinger}</td>
				<td>${mch.mcVendor}</td>
				<td>${mch.mcLike}</td>
				<td>${mch.mcDislike}</td>
				<td>${mch.mcCredat}</td>
				<td>${mch.mcDesc}</td>
			</tr>
			</c:forEach>
			</tbody>
		</table>
		<button data-page = "/views/mMusic/mMusicInsert">추가버튼</button>
	</div>
</div>
<jsp:include page="/WEB-INF/views/menu/bottom.jsp" /> 