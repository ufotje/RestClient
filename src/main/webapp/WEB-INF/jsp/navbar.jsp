<%--
  Created by IntelliJ IDEA.
  User: Intec
  Date: 29/01/2018
  Time: 22:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/navbar.css">
<div class="navbar">
    <a href="${pageContext.request.contextPath}members">Lid worden</a>
    <div class="dropdown">
        <button class="dropbtn" onclick="myFunction()">Digitale Dragers
            <i class="fa fa-caret-down"></i>
        </button>
        <div class="dropdown-content" id="myDropdown">
            <a href="${pageContext.request.contextPath}members">Lid worden</a>
            <a href="${pageContext.request.contextPath}author">Zoek op auteur</a>
            <a href="${pageContext.request.contextPath}topic">Zoek op onderwerp</a>
        </div>
    </div>
    <div class="dropdown2">
        <button class="dropbtn2" onclick="myFunction()">Boeken
            <i class="fa fa-caret-down"></i>
        </button>
        <div class="dropdown2-content" id="myDropdown2">
            <a href="${pageContext.request.contextPath}allBooks">Alle boeken</a>
            <a href="${pageContext.request.contextPath}title">Zoek op titel</a>
            <a href="${pageContext.request.contextPath}author">Zoek op auteur</a>
            <a href="${pageContext.request.contextPath}topic">Zoek op onderwerp</a>
        </div>
    </div>
    <div class="dropdown3">
        <button class="dropbtn3" onclick="myFunction()">Magazines
            <i class="fa fa-caret-down"></i>
        </button>
        <div class="dropdown3-content" id="myDropdown3">
            <a href="${pageContext.request.contextPath}title">Zoek op titel</a>
            <a href="${pageContext.request.contextPath}author">Zoek op auteur</a>
            <a href="${pageContext.request.contextPath}topic">Zoek op onderwerp</a>
        </div>
    </div>
    <div class="dropdown4">
        <button class="dropbtn4" onclick="myFunction()">Reservaties
            <i class="fa fa-caret-down"></i>
        </button>
        <div class="dropdown4-content" id="myDropdown4">
            <a href="${pageContext.request.contextPath}title">Reserveer een boek</a>
            <a href="${pageContext.request.contextPath}author">Reserveer een magazine</a>
            <a href="${pageContext.request.contextPath}topic">Reserveer een digitale drager</a>
        </div>
    </div>
</div>
<script>
    function myFunction() {
        document.getElementById("myDropdown").classList.toggle("show");
        document.getElementById("myDropdown2").classList.toggle("show");
        document.getElementById("myDropdown3").classList.toggle("show");
        document.getElementById("myDropdown4").classList.toggle("show");
    }

    window.onclick = function (e) {
        if (!e.target.matches('.dropbtn')) {
            var myDropdown = document.getElementById("myDropdown");
            if (myDropdown.classList.contains('show')) {
                myDropdown.classList.remove('show');
            }
        }
        if (!e.target.matches('.dropbtn2')) {
            var myDropdown2 = document.getElementById("myDropdown2");
            if (myDropdown2.classList.contains('show')) {
                myDropdown2.classList.remove('show');
            }
        }
        if (!e.target.matches('.dropbtn3')) {
            var myDropdown3 = document.getElementById("myDropdown3");
            if (myDropdown3.classList.contains('show')) {
                myDropdown3.classList.remove('show');
            }
        }
        if (!e.target.matches('.dropbtn4')) {
            var myDropdown4 = document.getElementById("myDropdown4");
            if (myDropdown4.classList.contains('show')) {
                myDropdown4.classList.remove('show');
            }
        }
    }
</script>
