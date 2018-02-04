<%--
  Created by IntelliJ IDEA.
  User: Intec
  Date: 29/01/2018
  Time: 23:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link REL="SHORTCUT ICON" HREF="${pageContext.request.contextPath}/images/logoKOKW.ico">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/general.css">
    <title>Uw Gezocht Boek</title>
</head>
<body>
<%@include file="../navbar.jsp" %>
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
</body>
</html>
