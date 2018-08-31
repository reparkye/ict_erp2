<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp" %>
<body>
<script>
var cnt = ${mu};
if(cnt==1){
	alert("insert성공");
	location.href = "/music/musicList";
}else{
	alert("서트 실패");
}

</script>

<div id="wrapper">
<%-- <jsp:include page="/WEB-INF/views/menu/left.jsp" /> --%>
	<div id="page-content-wrapper">
		<form action ="/music/musicInsert" method="post">
		<table class="table table-bordered">
			
			<tr>
				<th>노래제목</th>
				<td><input type="text" name="mcName"></td>
			</tr>
		
			<tr>
				<th>가수명</th>
				<td><input type="text" name="mcSinger"></td>
			</tr>
			
			<tr>
				<th>밴드명</th>
				<td><input type="text" name="mcVendor"></td>
			</tr>
			
			<!-- <tr>
				<th>숫자</th>
				<td><input type="text" name="mcLike"></td>
			</tr> -->
		
		<!-- 	<tr>
				<th>숫자2</th>
				<td><input type="text" name="mcDislike"></td>
			</tr> -->
			
			<tr>
				<th>날짜</th>
				<td><input type="text" name="mcCredat"></td>
			</tr>		
		
			<tr>
				<th>종류</th>
				<td><input type="text" name="mcDesc"></td>
			</tr>	
			
			<tr>
				<td colspan ="2"><button>등록</button></td>
			</tr>
		</table>
		</form>
	</div>
</div>
<%-- <jsp:include page="/WEB-INF/views/menu/bottom.jsp" /> --%>