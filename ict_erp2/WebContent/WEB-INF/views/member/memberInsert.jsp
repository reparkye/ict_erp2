<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp"%>

<c:if test="${!empty rMap}">
	<script>
alert('${rMap.msg}');
if(${rMap.cnt}==1){
	location.href='/member/memberList';
}
</script>
</c:if>
<body>
	<div id="wrapper">
		<jsp:include page="/WEB-INF/views/menu/left.jsp" />
		<div id="page-content-wrapper">
			<form method="post" action="/member/memberInsert">
				<table class="table table-bordered">
					<tr>
						<th>사원이름</th>
						<td><input type="text" name="miName"></td>
					</tr>
					<tr>
						<th>사원아이디</th>
						<td><input type="text" name="miId"></td>
					</tr>
					<tr>
						<th>사원비밀번호</th>
						<td><input type="password" name="miPwd"></td>
					</tr>
					<tr>
						<th>사원부서</th>
						<td><select name="dicode">
								<option value="INS001">인사1팀</option>
								<option value="WED001">디자인1팀</option>
								<option value="DEV001">개발1팀</option>
						</select></td>
					</tr>
					<tr>
						<th>사원권한</th>
						<td><select name="liLevel">
								<option>선택</option>
								<c:forEach items="${liList}" var="li">
									<option value="${li.liLevel}">${li.liName}</option>
								</c:forEach>
						</select></td>
					</tr>
					<tr>
						<th>사원이메일</th>
						<td><input type="email" name="miEmail"></td>
					</tr>
					<tr>
						<th>사원설명</th>
						<td><input type="text" name="miDesc"></td>
					</tr>
					<tr>
						<th>사원폰</th>
						<td><input type="tel" name="miPhone"></td>
					</tr>
					<tr>
						<th>사원우표</th>
						<td><input type="number" name="miZipcode"></td>
					</tr>
					<tr>
						<th>사원주소1</th>
						<td><input type="text" name="miAddress1"></td>
					</tr>
					<tr>
						<th>사원주소2</th>
						<td><input type="text" name="miAddress2"></td>
					</tr>
					<tr>
						<td colspan="2"><button class="btn btn-primary">등록</button></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
	<jsp:include page="/WEB-INF/views/menu/bottom.jsp" />