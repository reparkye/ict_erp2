<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="/WEB-INF/views/common/common.jsp" %>
<body>
에러가 발생하였습니다.<br>
<%
String erreoMsg = (String)request.getAttribute("erreo");
%>
사유는 아래와 같습니다.<br>
<%=erreoMsg %>
</body>
</html>