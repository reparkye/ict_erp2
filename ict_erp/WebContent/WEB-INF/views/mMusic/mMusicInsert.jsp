<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp" %>
<body>

<script>
var cnt = ${mmi};
if(cnt==1){
	alert("성공");
	location.href = "/mMusic/mMusicList";
}else{
	alert("실패");
}
</script>

<div id="wrapper"> 
<jsp:include page="/WEB-INF/views/menu/left.jsp" />
	<div id="page-content-wrapper">
		<form action = "/mMusic/mMusicInsert" method="post">
		<table class = "table table-bordered">
			<tr>
				<th>노래제목인서</th>
				<td><input type="text" name="mcName"></td>
			</tr>
			<tr>
				<th>가수이름</th>
				<td><input type="text" name="mcSinger"></td>
			</tr>	
			<tr>
				<th>밴드</th>
				<td><input type="text" name="mcVendor"></td>
			</tr>
			<tr>
				<th>날짜입력란</th>
				<td><input type="text" name="mcCredat"></td>
			</tr>
			<tr>
				<th>어떤종류의 음악인서</th>
				<td><input type="text" name="mcDesc"></td>
			</tr>	
			<tr>
				<td colspan="2"><button>등록</button></td>
			</tr>
		</table>
		</form>
	</div>
</div>
<jsp:include page="/WEB-INF/views/menu/bottom.jsp" /> 