<%--
  Created by IntelliJ IDEA.
  User: oem
  Date: 12.08.18
  Time: 15:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/OrderAdd">
    <h3 id="a"> Dodaj zlecenie </h3>
    Wprowadź datę przyjęcia zgłoszenia: <input type="text" name="receptionDate"></br>
    Wprowadź planowaną datę naprawy: <input type="text" name="planningRepairDate"></br>
    Wprowadź data przeprowadzenia naprawy: <input type="text" name="repairStartDate"></br>
    Wprowadź pracownik przypisany do naprawy: <input type="text" name="repairEmployee"></br>
    Wprowadź opis problemu: <input type="text" name="problem"></br>
    Wprowadź sposób naprawy: <input type="text" name="repairPlan"></br>
    Wprowadź status naprawy: <input type="number" name="status"></br>
    Wprowadź pojazd: <input type="text" name="vehicle"></br>
    <input type="submit" value="Dodaj">
</form>
</body>
</html>
