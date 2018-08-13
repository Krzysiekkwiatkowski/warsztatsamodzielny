<%--
  Created by IntelliJ IDEA.
  User: oem
  Date: 12.08.18
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/VehicleEdit">
    <h3> Edytuj dane pojazdu </h3>
    Wprowadź id: <input type="number" name="id"><br>
    Wprowadź model: <input type="text" name="model"><br>
    Wprowadź markę: <input type="text" name="mark"></br>
    Wprowadź rok produkcji: <input type="number" name="year"></br>
    Wprowadź numer rejestracyjny: <input type="text" name="registrationNumber"></br>
    Wprowadź datę kolejnej wizyty: <input type="text" name="dateOfNextVisit"></br>
    <input type="submit" value="Edytuj">
</form>
</body>
</html>
