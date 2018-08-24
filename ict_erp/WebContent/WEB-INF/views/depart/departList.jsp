<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp" %>
<body>
<div id="wrapper">
<jsp:include page="/WEB-INF/views/menu/left.jsp" />
	<div id="page-content-wrapper">
	
	<div style="margin:10px">
	<a href="#menu-toggle" class="btn btn-secondary" id="menu-toggle">Toggle Menu</a>
	</div>
	<div style="margin:5px">
	<select name="scType">
		<option value="diName">어떠한이름</option>
		<option value="diDesc">어떠한설명</option>
	</select>
	<input type="text" name="scText" onkeyup="checkEnter(event)">
	<button onclick="searchLevel()">검색</button>
	</div>
	<table class="table table-bordered table-hover">
		<thead>
			<tr>
				<th>번호</th>
				<th>코드</th>
				<th>이름</th>
				<th>설명</th>
			</tr>
		</thead>
		<tbody id="liTbody">
		<c:forEach items="${diList}" var="di">
		<tr>
			<td>${di.diNum }</td>
			<td>${di.diCode }</td>
			<td>${di.diName }</td>
			<td>${di.diDesc }</td>
		</c:forEach>
		
		</tbody>
			<tr>
				<td colspan="5"></td>			
	</table>
	<!-- <div class="btns">
		<button id="add" onclick="addRow()">추가</button>
		<button id="save" onclivk="saveLevel()">저장</button>
		<button id="del" onclick="deleteLevel()">삭제</button>
	</div>
	</div>

<script>
	/* $(document).ready(function(){
		document.querySelector('input[name=scText]').focus();
	});
	var cnt = '$(rMap.cnt)';	
	if(cnt){
		
	} */
var emptyList = "${empty liList}";
function addRow(){
	var html = '<tr>';
	html += '<td>&nbsp;</td>';
	html += '<td>&nbsp;</td>';
	html += '<td><input type="text" name="diNum"></td>';
	html += '<td><input type="text" name="diCode"></td>';
	html += '<td><input type="text" name="diName"></td>';
	html += '<td><input type="text name="diDesc"></td>';
	html += '</tr>';	
	
	
}
	
	
	
</script>
	 -->
	
	
</div>
<jsp:include page="/WEB-INF/views/menu/bottom.jsp" />