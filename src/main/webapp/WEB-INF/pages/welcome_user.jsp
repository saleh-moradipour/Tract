<%--
  Created by IntelliJ IDEA.
  User: Yeganeh
  Date: 5/15/16
  Time: 1:09 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home page</title>
</head>
<body>
<c:set var="ctx" value="${pageContext.servletContext.contextPath}"/>
<i><h2>Hello&nbsp; ${requestScope.username}</h2></i>
</br>
<pre><a href="${ctx}/operation/buy.action"><b>Karide Mahsol</b></a></pre>
<hr width="100" align="left" color="red" size="2">
<pre><a href="${ctx}/operation/sell.action"><b>Forosh Mahsol</b></a></pre>
<hr width="100" align="left" color="red" size="2">
<pre><a href="${ctx}/operation/information.action"><b>Etela Az Mahsol</b></a></pre>

</body>
</html>
