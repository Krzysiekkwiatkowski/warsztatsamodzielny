<%--
  Created by IntelliJ IDEA.
  User: oem
  Date: 07.09.19
  Time: 12:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Main Page</title>
    <script type="text/javascript" src="/static/effects.js"></script>
</head>
<body>
<%@include file="Header.jsp" %>
<h1> Warsztat Samochodowy </h1>
<H3> Test </H3>
<label> Dane podstawowe </label></br>
<label> Jedno
    <input id="1" type="radio" name="type" value="1" content="Jedno" >
</label>
<label> Dwu
    <input id="2" type="radio" name="type" value="2" content="Dwu" >
</label>
<div id="content" hidden>
    <p> Wartość dodatkowa </p>
</div>
<%@include file="Footer.jsp" %>
</body>
</html>
