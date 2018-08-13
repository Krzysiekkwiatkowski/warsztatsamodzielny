<%--
  Created by IntelliJ IDEA.
  User: oem
  Date: 12.08.18
  Time: 09:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form  method="post" action="/EmployeeAdd">
    <h3> Dodaj pracownika </h3>
    Wprowadź imię pracownika: <input type="text" name="name"></br>
    Wprowadź nazwisko pracownika: <input type="text" name="surname"></br>
    Wprowadź adres pracownika: <input type="text" name="address"></br>
    Wprowadź telefon pracownika: <input type="number" name="phone"></br>
    Wprowadź notatkę dla pracownika: <input type="text" name="note"></br>
    Wprowadź wynagrodzenie pracownika: <input type="number" name="salary"></br>
<input type="submit" value="Dodaj">
</form>
</body>
</html>
