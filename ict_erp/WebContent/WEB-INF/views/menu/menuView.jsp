<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp" %>
<body>
<script>
	var cnt = ${mMap};
	if(cnt == 1){
		alert("완료");
		location.href="/menu/menuList";
	}else{
		alert("에러");
	}

</script>

<div id="wrapper">
<jsp:include page="/WEB-INF/views/menu/left.jsp" />
	<div id="page-content-wrapper">
		<form action ="/menu/menuUpdate" method="post">
		<table class = "table table-bordered">
				
			<tr>
				<tr>번호</tr>
				<td><input type ="hidden" name="meiNum" value="${mei.meiNum}"></td>
			</tr>
			
			<tr>
				<th>메뉴명</th>
				<td><input type="text" name="meiName" value="${mei.meiName}"></td>
			</tr>
				<th>메뉴가격</th>
				<td><input type="text" name="meiPrice" value="${mei.meiPrice}"></td>
			<tr>
				<th>설명</th>
				<td><input type="text" name="meiDesc" value="${mei.meiDesc}"></td>
			</tr>		
			<tr>
				<td colspan="2"><button>부서수정</button>
				<button data-action="/menu/menuDelete">부서삭제</button>
			</tr>	
		</table>
		</form>
	</div>
</div>
<jsp:include page="/WEB-INF/views/menu/bottom.jsp" />