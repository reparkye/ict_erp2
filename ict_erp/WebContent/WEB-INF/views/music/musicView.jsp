<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp" %>
<body>
<script>
var = cnt = ${}

</script>
<div id="wrapper"> 
<jsp:include page="/WEB-INF/views/menu/left.jsp" />
	<div id="page-content-wrapper">
		<form action="/music/musicView">
		<table class= "table table-bordered">
		
		<tr>
			<th></th>
			<td><input type="hidden" name="mcNum" value="${ }"</td>
		</tr>
		
		</table>
		
		
		</form>
		
		
		
	</div>
</div>
<jsp:include page="/WEB-INF/views/menu/bottom.jsp" /> 