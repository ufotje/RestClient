<%--
  Created by IntelliJ IDEA.
  User: DanielD
  Date: 2/02/2018
  Time: 12:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Lid worden van de KOKW</title>
</head>
<body>
<%@include file="../navbar.jsp" %>
<div class="container">
    <%--@elvariable id="memberForm" type=""--%>
    <form:form action="register" method="post" commandName="memberForm">
        <table>
            <tr>
                <td><label for="firstName">Voornaam:</label></td>
                <td><form:input path="firstName" type="text" placeholder="Enter Firstname" name="firstName" id="firstName" required="required" /></td>
            </tr>
            <tr>
                <td><label for="lastName">Achternaam:</label></td>
                <td><form:input path="lastName" type="text" placeholder="Enter Streetname" name="street" id="street" required="required" /></td>
            </tr>
            <tr>
                <td><label for="street">Straatnaam:</label></td>
                <td><form:input path="street" type="text" placeholder="Enter Username" name="user" id="user" required="required" /></td>
            </tr>
            <tr>
                <td><label for="houseNr">Huisnummer:</label></td>
                <td><form:input path="houseNr" type="text" placeholder="Enter Housenumber" name="houseNr" id="houseNr" required="required" /></td>
            </tr>
            <tr>
                <td><label for="zip">Zipcode:</label></td>
                <td><form:input path="zip" type="number" placeholder="enter zipcode" name="zip" id="zip" required="required"/></td>
            </tr>

            <tr>
                <td><label for="city">Stad:</label></td>
                <td><form:input path="city" type="city" required="required" placeholder="Enter City" name="city" id="city"/></td>
            </tr>
            <tr>
                <td><label for="email">E-mail:</label></td>
                <td><form:input path="eMail" type="email" required="required" placeholder="example@example.com" name="email" id="mail"/></td>
            </tr>
            <tr>
                <td><label for="bDay">Geboortedatum:</label></td>
                <td><form:input path="bDay" type="date" placeholder="Enter Day of Birth" name="bDay" id="bDay" required="required" /></td>
            </tr>
            <tr>
                <td><label for="gender">Geslacht:</label> </td>
                <td>
                <form:select path="gender">
                    <form:option value="" label="--- Select ---"/>
                    <form:options value="M" label="--- Mannelijk ---" />
                    <form:options value="V" label="--- Vrouwelijk ---"/>
                </form:select>
                </td>
            </tr>
        </table>
        <div><br><input type="submit" value="register" class="button"></div>
    </form:form>
</div>
<br>
<br>
</body>
</html>
