<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp" %>
<body>
<script>
var cnt = ${ri};
if(cnt==1){
	alert("성공");
	location.href ="/menu2/menuList";
	}else{
	alert("실패");
	}
</script>

<div id="wrapper">
	<div id="page-content-wrapper">
		<form action ="/menu2/menuInsert" method="Post">
		<table class="table table-bordered">
		
			<tr>
				<th>메뉴명</th>
				<td><input type="text" name="meiName"></td>
			</tr>
			<tr>
				<th>메뉴가격</th>
				<td><input type="text" name="meiPrice"></td>
			</tr>
			<tr>
				<th>설명</th>
				<td><input type="text" name="meiDesc"></td>
			</tr>
			<tr>
				<td colspan="2"><button>등록</button></td>
			</tr>
		</table>
		</form>
	</div>
</div>
						