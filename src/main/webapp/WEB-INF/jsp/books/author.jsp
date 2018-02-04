<%--
  Created by IntelliJ IDEA.
  User: Intec
  Date: 29/01/2018
  Time: 21:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<html>
<head>
    <link REL="SHORTCUT ICON" HREF="${pageContext.request.contextPath}/images/logoKOKW.ico">
    <title>${title}</title>
</head>
<body>
<%@include file="../navbar.jsp" %>
<h2>${title}</h2>
<form action="" method="post">
    Auteur: &nbsp;&nbsp; &nbsp; &nbsp;<input type="text" name="author" />
    &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
    <input type="submit" value="zoeken" />
</form>
</body>
</html>
