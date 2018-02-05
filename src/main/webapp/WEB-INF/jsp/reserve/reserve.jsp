<%--
  Created by IntelliJ IDEA.
  User: DanielD
  Date: 5/02/2018
  Time: 13:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Een item reserveren</title>
</head>
<body>
<form method="post">
    <label>Voornaam:</label> &nbsp; &nbsp; &nbsp; <input type="text" name="firstName" /><br>
    <label>Achternaam:</label> &nbsp; &nbsp; &nbsp; <input type="text" name="lastName" /><br>
    <label>Titel:</label> &nbsp; &nbsp; &nbsp; <input type="text" name="title" /><br>
    <label>Volume:</label> &nbsp; &nbsp; &nbsp; <input type="text" name="volume" /><br>
    <label>Ophaal datum:</label> &nbsp; &nbsp; &nbsp; <input type="datetime-local" name="pickUpDate"><br>
    &nbsp; <br> &nbsp; <br>
    <input type="submit" value="Reserveren">
</form>
</body>
</html>
