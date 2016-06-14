<%--
  Created by IntelliJ IDEA.
  User: Yeganeh
  Date: 6/7/16
  Time: 3:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Select Page</title>
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
<form action="/operation/search.action" method="get">

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
    <p>Model From: <input type="text" name="modelOf" value="${requestScope.modelOf}">&nbsp;&nbsp;&nbsp;Model To:<input type="text" name="modelUp"></p>

    <p>Price From: <input type="text" name="priceOf">&nbsp;&nbsp;&nbsp;Price To:<input type="text" name="priceUp"></p>

    <p>Use In Kilometer Form: <input type="text" name="usedInKilometerOf">&nbsp;&nbsp;&nbsp;Use In Kilometer To:<input
            type="text" name="usedInKilometerUp"></p>

    <p><input type="submit" value="Search"></p>
</form>
<br>
<br>
<br>

<table>
    <TH>Name</th>
    <TH>&nbsp;&nbsp;&nbsp;&nbsp;Model</th>
    <TH>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Fuel</th>
    <TH>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Used_In_Kilometer</th>
    <TH>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Gear Box</th>
    <TH>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Price</th>
    <TH>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Phone_number</th>
    <TH>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Explanation</th>
</table>
<table>
    <c:forEach items="${requestScope.carList}" var="car">
        <tr>
            <td>
                    ${car.carName}
            <td>
            <td>
                &nbsp;&nbsp;&nbsp;&nbsp;${car.model}
            <td>
            <td>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${car.fuel}
            <td>
            <td>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${car.usedInKilometer}
            <td>
            <td>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${car.gearbox}
            <td>
            <td>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${car.price}
            <td>
            <td>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${car.phoneNumber}
            <td>
            <td>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${car.explanation}
            <td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
