<%--
  Created by IntelliJ IDEA.
  User: Intec
  Date: 29/01/2018
  Time: 21:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<html>
<head>
    <link REL="SHORTCUT ICON" HREF="${pageContext.request.contextPath}/images/logoKOKW.ico">
    <title>Search By Title</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/general.css">

</head>
<body>
<%@include file="../navbar.jsp" %>
<br>&nbsp;<br>&nbsp;<br>
<h2>${title}</h2>
<br>&nbsp;<br> <br>&nbsp;<br>

<form action="" method="post">
  Titel: &nbsp;&nbsp; &nbsp; &nbsp;<input type="text"  name="title" />
    &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
    <input type="submit" value="zoeken" />
</form>
</body>
</html>
