<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Yeganeh
  Date: 6/14/16
  Time: 3:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<div>
    <s:if test="hasActionErrors()">
        <s:actionerror/>
    </s:if>
</div>
<div>
    <s:if test="hasActionMessages()">
        <s:actionmessage/>
    </s:if>
</div>
<form action="/operation/join.action" method="get">
    <p>
        Name:
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input name="name" type="text">
    </p>

    <p>
        Last Name:
        <input name="lastName" type="text">
    </p>

    <p>
        Password:
        &nbsp;&nbsp;<input name="pass" type="password">
    </p>

    <p>
        Phone Number:
        <input name="phone_Number" type="tel">
    </p>

    <p>
        Address:
        &nbsp;&nbsp;&nbsp; <textarea name="address" type="text" size="200"></textarea>
    </p>

    <p>
        &nbsp;&nbsp;&nbsp;<input value="Join" type="submit">&nbsp;&nbsp;&nbsp;&nbsp;<a
            href="${ctx}/login//showLoginPage.action"> <input value="Back To Login" type="button"> </a>
    </p>
</form>
</body>
</html>
