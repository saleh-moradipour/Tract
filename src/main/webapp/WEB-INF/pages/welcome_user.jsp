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
    <style>
        #myDIV {
            letter-spacing: 2px;
            -webkit-animation: mymove 5s infinite; /* Chrome, Safari, Opera */
            animation: mymove 5s infinite;
        }

        /* Chrome, Safari, Opera */
        @-webkit-keyframes mymove {
            50% {
                letter-spacing: 50px;
            }
        }

        /* Standard syntax */
        @keyframes mymove {
            50% {
                letter-spacing: 50px;
            }
        }
    </style>
    <title>Home page</title>
</head>
<body>
<c:set var="ctx" value="${pageContext.servletContext.contextPath}"/>
<div id="myDIV"><i><h2>Hello&nbsp; ${requestScope.username}</h2></i></div>
</br>
<pre><a href="${ctx}/operation/sell.action"><b>Forosh Mahsol</b></a></pre>
<hr width="170" align="left" color="red" size="2">
<pre><a href="${ctx}/operation/select.action"><b>Etela Az Mahsol & Search</b></a></pre>
</body>
</html>
