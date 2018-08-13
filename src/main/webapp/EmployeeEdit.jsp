<%--
  Created by IntelliJ IDEA.
  User: oem
  Date: 12.08.18
  Time: 13:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/EmployeeEdit">
    <h3> Edytuj dane pracownika </h3>
    Wprowadź id: <input type="number" name="id"><br>
    Wprowadź imię: <input type="text" name="name"><br>
    Wprowadź nazwisko: <input type="text" name="surname"></br>
    Wprowadź adres: <input type="text" name="address"></br>
    Wprowadź numer: <input type="number" name="phone"></br>
    Wprowadź notatkę: <input type="text" name="note"></br>
    Wprowadź wynagrodzenie: <input type="number" name="salary"></br>
    <input type="submit" value="Edytuj">
</form>
</body>
</html>
