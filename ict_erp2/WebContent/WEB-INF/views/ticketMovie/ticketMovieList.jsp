<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp"%>
<body>
	<div id="wrapper">
		<jsp:include page="/WEB-INF/views/menu/left.jsp" />
		<div id="page-content-wrapper">
			<table class="table table-bordered">
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
				<c:forEach items="${tList}" var="tt">
					<tr>	
						<td>${tt.tmNum}</td>
						<td>${tt.tmName}</td>
						<td>${tt.tmPrice}</td>
						<td>${tt.tmStartDat}</td>
						<td>${tt.tmEndDat}</td>
						<td>${tt.tmCredat}</td>
						<td>${tt.tmDesc}</td>
						<td>${tt.tmCnt}</td>
						<td><img src="${tt.tmImg}" width="100"></td>
					</tr>
					
				</c:forEach>
				<c:if test="${empty tList}">
					<tr>
						<td colspan="8">다시 등록바람</td>
					</tr>
				</c:if>
				<tr>
					<td colspan="8"><button data-page="/ticketMovie/ticketMovieInsert">영화 등록</button></td> 
				</tr>
			</table>
		</div>
	</div>
	<jsp:include page="/WEB-INF/views/menu/bottom.jsp" />