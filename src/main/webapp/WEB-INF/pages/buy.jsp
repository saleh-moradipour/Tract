<%--
  Created by IntelliJ IDEA.
  User: Yeganeh
  Date: 5/31/16
  Time: 7:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> Buy Page</title>
</head>
<body>

<s:if test="hasActionErrors()">
    <div class="errors">
        <s:actionerror/>
    </div>
    <s:if test="hasActionMessages()">
        <div class="success">
            <s:actionmessage/>
        </div>
    </s:if>
</s:if>
<form action="/buy/buy.action" method="get">

    <p>
        Car name :
        <select name="carName" size="1">
            <option></option>
            <option value="benz">Benz</option>
            <option value="ford">Ford</option>
            <option value="Bmw">Bmw</option>
            <option value="porsh">Porsh</option>
            <option value="bently">Bently</option>
        </select>
    </p>
    <p>Price Of: <input type="text" name="priceOf">&nbsp;&nbsp;&nbsp;Price Up:<input type="text" name="priceUp"></p>

    <p>Model Of: <input type="text" name="modelOf">&nbsp;&nbsp;&nbsp;Model Up:<input type="text" name="modelUp"></p>

    <p>Of use in kilometer: <input type="text" name="usekilometerOf">&nbsp;&nbsp;&nbsp;Up use in kilometer:<input
            type="text" name="usekilometerUp"></p>

    <p><input type="submit" value="Search"></p>
</form>
</body>
</html>
