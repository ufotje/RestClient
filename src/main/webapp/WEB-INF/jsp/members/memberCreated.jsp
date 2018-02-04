<%@ taglib prefix="c" uri=
Geboortedatum: &nbsp; &nbsp; &nbsp; ${added.bDay}<br>
E-Mail: &nbsp; &nbsp; &nbsp; ${added.EMail}<br>
Geslacht: &nbsp; &nbsp; &nbsp; ${added.gender}<br>

</body>
</html>
"http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: DanielD
  Date: 2/02/2018
  Time: 13:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link REL="SHORTCUT ICON" HREF="${pageContext.request.contextPath}/images/logoKOKW.ico">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/general.css">
    <title>Het toegevoegde lid</title>
</head>
<body>
<%@include file="../navbar.jsp" %>
<c:set var="added" value="${member}"/>
Naam: &nbsp; &nbsp; &nbsp; ${added.firstName} &nbsp; &nbsp; &nbsp;${added.lastName}<br>
Adres:  &nbsp; &nbsp; &nbsp; ${added.street} &nbsp; &nbsp; &nbsp; ${added.houseNr}<br>
${added.zip} &nbsp; &nbsp; &nbsp; ${added.city}<br>
<br>