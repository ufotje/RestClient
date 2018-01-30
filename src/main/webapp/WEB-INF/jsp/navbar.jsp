<%--
  Created by IntelliJ IDEA.
  User: Intec
  Date: 29/01/2018
  Time: 22:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/navbar.css">
<div class="navbar">
    <a href="#home">Home</a>
    <a href="#news">News</a>
    <div class="dropdown">
        <button class="dropbtn" onclick="myFunction()">Boeken
            <i class="fa fa-caret-down"></i>
        </button>
        <div class="dropdown-content" id="myDropdown">
            <a href="${pageContext.request.contextPath}title">Zoek op titel</a>
            <a href="${pageContext.request.contextPath}author">Zoek op auteur</a>
            <a href="${pageContext.request.contextPath}topic">Zoek op onderwerp</a>
        </div>
    </div>
</div>
<script>
    function myFunction() {
        document.getElementById("myDropdown").classList.toggle("show");
    }

    window.onclick = function(e) {
        if (!e.target.matches('.dropbtn')) {
            var myDropdown = document.getElementById("myDropdown");
            if (myDropdown.classList.contains('show')) {
                myDropdown.classList.remove('show');
            }
        }
    }
</script>
