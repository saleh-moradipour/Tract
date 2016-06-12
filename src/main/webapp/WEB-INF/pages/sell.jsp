<%--
  Created by IntelliJ IDEA.
  User: Yeganeh
  Date: 5/17/16
  Time: 7:32 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sell Page</title>
    <style>
        body {
            background: #cccccc;
        }
    </style>

</head>
<body>
<s:if test="hasActionErrors()">
    <s:actionerror/>
</s:if>
<s:if test="hasActionMessages()">
    <s:actionmessage/>
</s:if>

<form action="/sell/sell.action" method="get">
    <div>
        <p>
            Car name :
            <select name="carName" size="1">
                <option></option>
                <option value="Benz">Benz</option>
                <option value="Ford">Ford</option>
                <option value="Bmw">Bmw</option>
                <option value="Porcsh">Porsh</option>
                <option value="Bently">Bently</option>
            </select>
        </p>
    </div>
    <div>
        <p>
            Model :&nbsp;<input type="text" name="model">
        </p>
    </div>
    <div>
        <p>
            Fuel :
            &nbsp;<select name="fuel" size="1">
            <option value="Benzin">Benzin</option>
            <option value="Gaz">Gaz</option>
            <option value="To Fuel">Tow fuel</option>
        </select>
        </p>
    </div>
    <div>
        <p>
            Usekilometer :&nbsp;<input type="int" name="usedInKilometer">
        </p>
    </div>
    <div>
        <p>
            Gierbox :
            &nbsp;<select name="gearBox" size="1">
            <option></option>
            <option value="<Manual">Manual</option>
            <option value="Automatic">Automatic</option>
        </select>
        </p>
    </div>
    <div>
        <p>
            Price :&nbsp;<input type="text" name="price">
        </p>
    </div>
    <div>
        <p>
            Phone number :&nbsp;<input type="text" name="phoneNumber">
        </p>
    </div>
    <div>
        Input write to message :
    </div>
    <div>
        <input type="text" name="explanation" size="100">
    </div>
    <div>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="Registration">
    </div>
</form>
</body>
</html>
