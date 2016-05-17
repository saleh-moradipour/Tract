<%--
  Created by IntelliJ IDEA.
  User: Yeganeh
  Date: 5/15/16
  Time: 1:04 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
<s:if test="hasActionErrors()">
    <div class="errors">
        <s:actionerror/>
    </div>
    <s:if test="hasActionMessages()">
        <div class="welcome">
            <s:actionmessage/>
        </div>
    </s:if>
</s:if>
<form action="/login/login.action" method="get">
    <div>
        User name:
        <input type="text" name="username">
    </div>
    <div>
        Password:
        <input type="password" name="pass">
    </div>
    <div>
        <input type="submit" value="login">
    </div>
</form>
</body>
</html>
