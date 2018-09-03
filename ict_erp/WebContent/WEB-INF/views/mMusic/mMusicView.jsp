<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp" %>
<body>
<script>
var cnt = ${mmi};
if(cnt==1){
	alert("삭제 및 수정 성공");
	location.href = "/mMusic/mMusicList";
}else{
	alert("삭제 실패");
}
</script>
<div id="wrapper"> 
<jsp:include page="/WEB-INF/views/menu/left.jsp" />
	<div id="page-content-wrapper">
		<form action = "/mMusic/mMusicDelete" method="post">
		<table class = "table table-bordered">
				<tr>
					<th>번호</th>
					<td><input type="text" name="mcNum" value="${mu.mcNum}"></td>
				</tr>
				<tr>
					<th>노래제목</th>
					<td><input type="text" name="mcName" value="${mu.mcName}"></td>
				</tr>
				<tr>
					<th>가수이름</th>
					<td><input type="text" name="mcSinger" value="${mu.mcSinger}"></td>
				</tr>
				<tr>
					<th>밴드</th>
					<td><input type="text" name="mcVendor" value="${mu.mcVendor}"></td>
				</tr>
				<tr>
					<th>좋아요</th>
					<td><input type="text" name="mcLike" value="${mu.mcLike}"></td>
				</tr>
				<tr>
					<th>싫어요</th>
					<td><input type="text" name="mcDislike" value="${mu.mcDislike}"></td>
				</tr>
				<tr>
					<th>날짜입력란</th>
					<td><input type="text" name="mcCredat" value="${mu.mcCredat}"></td>
				</tr>
				<tr>
					<th>어떤종류의음악</th>
					<td><input type="text" name="mcDesc" value="${mu.mcDesc}"></td>
				</tr>
				<tr>
				<td colspan="2"><button>삭제</button>
				<button data-action="/mMusic/mMusicUpdate">수정!</button></td>
				</tr>
		</table>
		</form>
	</div>
</div>
<jsp:include page="/WEB-INF/views/menu/bottom.jsp" /> 