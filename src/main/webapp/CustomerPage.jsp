<%--
  Created by IntelliJ IDEA.
  User: oem
  Date: 28.07.18
  Time: 13:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Show Customer</title>
</head>
<body>
<h1> Klienci </h1>
<input type="button" onclick="location.href='http://localhost:8080/CustomerAdd'" value="Dodaj">
<input type="button" onclick="location.href='http://localhost:8080/CustomerEdit'" value="Edycja">
<input type="button" onclick="location.href='http://localhost:8080/CustomerDel'" value="Usuń">
<input type="button" onclick="location.href='http://localhost:8080/CustomerServlet'" value="Pokaż wszystkich">
</body>
</html>
