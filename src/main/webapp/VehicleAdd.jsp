<%--
  Created by IntelliJ IDEA.
  User: oem
  Date: 12.08.18
  Time: 14:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form  method="post" action="/VehicleAdd">
    <h3> Dodaj pojazd </h3>
    Wprowadź model pojazdu: <input type="text" name="model"></br>
    Wprowadź markę pojazdu: <input type="text" name="mark"></br>
    Wprowadź rok produkcji pojazdu: <input type="number" name="year"></br>
    Wprowadź numer rejestracyjny: <input type="text" name="registrationNumber"></br>
    Wprowadź datę następnej wizyty: <input type="text" name="dateOfNextVisit"></br>
    <input type="submit" value="Dodaj">
</form>
</body>
</html>
