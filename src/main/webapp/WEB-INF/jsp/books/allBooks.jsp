
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<html>
<head>
    <link REL="SHORTCUT ICON" HREF="${pageContext.request.contextPath}/images/logoKOKW.ico">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/general.css">
    <title>All Books</title>
</head>
<body>
<table>
    <tr>
        <td>ID</td>
        <td>ISBN</td>
        <td>Depot</td>
        <td>Title</td>
        <td>Authors</td>
        <td>Topics</td>
        <td>Nr of Pages</td>
        <td>Available</td>
    </tr>
    <c:forEach items="${books}" var="book">
        <tr>
            <td>${book.id}</td>
            <td>${book.isbn}</td>
            <td>${book.depot}</td>
            <td>${book.title}</td>
            <td>${book.authors}</td>
            <td>${book.topics}</td>
            <td>${book.nrOfPages}</td>
            <td>${book.inStock}</td>

        </tr>

    </c:forEach>
</table>
</body>
</html>
