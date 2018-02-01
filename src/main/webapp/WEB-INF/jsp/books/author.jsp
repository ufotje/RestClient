<%--
  Created by IntelliJ IDEA.
  User: Intec
  Date: 29/01/2018
  Time: 21:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search Book By Author</title>
</head>
<body>
<%@include file="../navbar.jsp" %>
<p>Boek op auteur</p>
<form action="" method="post">
    Auteur: &nbsp;&nbsp; &nbsp; &nbsp;<input type="text" name="author" />
    &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
    <input type="submit" value="zoeken" />
</form>
</body>
</html>
