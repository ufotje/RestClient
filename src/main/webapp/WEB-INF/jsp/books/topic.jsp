<%--
  Created by IntelliJ IDEA.
  User: Intec
  Date: 29/01/2018
  Time: 21:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search Books By Topic</title>
</head>
<body>
<%@include file="../navbar.jsp" %>
<p>Boek op onderwerp</p>
<form action="" method="post">
    Onderwerp: &nbsp;&nbsp; &nbsp; &nbsp;<input type="text" name="topic" />
    &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
    <input type="submit" value="zoeken" />
</form>
</body>
</html>
