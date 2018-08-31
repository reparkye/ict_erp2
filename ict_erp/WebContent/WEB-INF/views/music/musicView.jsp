<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp" %>
<body>
<script>
var cnt = ${rmusic};
	if(cnt==1){
		alert("성공하였습니다.");
		location.href="/music/musicList";
	}else{
		alert("실패");
	}

</script>

<div id="wrapper"> 
<jsp:include page="/WEB-INF/views/menu/left.jsp" />
	<div id="page-content-wrapper">
		<form action="/music/musicDelete" method="post">
		<table class= "table table-bordered">
		
		<tr>
			<th>번호</th>
			<td><input type="text" name="mcNum" value="${mc.mcNum}"></td>
		</tr>
		<tr>
			<th>노래제목</th>
			<td><input type="text" name="mcName" value="${mc.mcName}"></td>
		</tr>
		<tr>
			<th>가수명</th>
			<td><input type="text" name="mcSinger" value="${mc.mcSinger}"></td>
		</tr>
		<tr>
			<th>밴드</th>
			<td><input type="text" name="mcVendor" value="${mc.mcVendor}"></td>
		</tr>
		<tr>
			<th>숫자</th>
			<td><input type="text" name="mcLike" value="${mc.mcLike}"></td>
		</tr>
		<tr>
			<th>숫자2</th>
			<td><input type="text" name="mcDilike" value="${mc.mcDislike}"></td>
		</tr>
		<tr>
			<th>날짜</th>
			<td><input type="text" name="mcCredat" value="${mc.mcCredat}"></td>
		</tr>
		<tr>
			<th>종류</th>
			<td><input type="text" name="mcDesc" value="${mc.mcDesc}"></td>
		</tr>
		<tr>
			<td colspan="2"><button>부서 삭제</button></td>
		</tr>
		</table>
		</form>
	</div>
</div>
<jsp:include page="/WEB-INF/views/menu/bottom.jsp" /> 