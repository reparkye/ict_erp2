<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp" %>
<body>
<div id="wrapper">
<jsp:include page="/WEB-INF/views/menu/left.jsp" />
	<div id="page-content-wrapper">
<%
application.setAttribute("app","1번라인");
session.setAttribute("sess","2번라인");
request.setAttribute("req","리퀘스트");
pageContext.setAttribute("page","마지막");
RequestDispatcher rd = request.getRequestDispatcher("print.jsp");
rd.forward(request, response);

%>	
	</div>
</div>
<jsp:include page="/WEB-INF/views/menu/bottom.jsp" />