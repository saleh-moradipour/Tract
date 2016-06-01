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

<form action="/sell/sell.action" method="get">
    <div>
        <p>
            Car name :
            <select name="carname" size="1">
                <option></option>
                <option value="benz">Benz</option>
                <option value="ford">Ford</option>
                <option value="Bmw">Bmw</option>
                <option value="porsh">Porsh</option>
                <option value="bently">Bently</option>
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
            <option value="benzin">Benzin</option>
            <option value="gaz">Gaz</option>
            <option value="tofuel">Tow fuel</option>
        </select>
        </p>
    </div>
    <div>
        <p>
            Usekilometer :&nbsp;<input type="int" name="usekilometer">
        </p>
    </div>
    <div>
        <p>
            Gierbox :
            &nbsp;<select name="gearbox" size="1">
            <option></option>
            <option value="manual">Manual</option>
            <option value="automatic">Automatic</option>
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
            Phone number :&nbsp;<input type="text" name="phonenumber">
        </p>
    </div>
    <div>
        Input write to message :
    </div>
    <div>
        <p>
            <textarea name="message" rows="10" cols="50">
            </textarea>
        </p>
    </div>
    <div>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="Registration">
    </div>
</form>
</body>
</html>
