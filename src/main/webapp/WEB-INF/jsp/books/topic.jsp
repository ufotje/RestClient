<%--
  Created by IntelliJ IDEA.
  User: Intec
  Date: 29/01/2018
  Time: 21:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<html>
<head>
    <link REL="SHORTCUT ICON" HREF="${pageContext.request.contextPath}/images/logoKOKW.ico">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/general.css">
    <title>${title}</title>
</head>
<body>
<%@include file="../navbar.jsp" %>
<h2>${title}</h2>
<form action="" method="post">
    Onderwerp: &nbsp;&nbsp; &nbsp; &nbsp;<input type="text" name="topic" />
    &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
    <input type="submit" value="zoeken" />
</form>
</body>
</html>
