<%--
  Created by IntelliJ IDEA.
  User: Intec
  Date: 29/01/2018
  Time: 21:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Search Book By Title</title>
</head>
<body>
<%@include file="../navbar.jsp" %>
<br>&nbsp;<br>&nbsp;<br>
 <c:forEach items="${books}" var="book">
    <div>
        ID: &nbsp; &nbsp; ${book.id}<br>
        ISBN:&nbsp; &nbsp;${book.isbn}<br>
        Depot: &nbsp; &nbsp;${book.depot}<br>
        Title: &nbsp; &nbsp;${book.title}<br>
        Authors: &nbsp; &nbsp;${book.authors}<br>
        Topics: &nbsp; &nbsp;${book.topics}<br>
        Nr of Pages: &nbsp; &nbsp;${book.nrOfPages}<br>
        Available: &nbsp; &nbsp;${book.inStock}<br>
        <br>&nbsp;<br>

    </div>
</c:forEach>
<br>&nbsp;<br> <br>&nbsp;<br>

<form action="" method="post">
    Titel: &nbsp;&nbsp; &nbsp; &nbsp;<input type="text" name="title" />
    &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
    <input type="submit" value="zoeken" />
</form>
</body>
</html>
