<%--
  Created by IntelliJ IDEA.
  User: oem
  Date: 12.08.18
  Time: 23:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/OrderEdit">
    <h3> Edytuj dane zamówienia </h3>
    Id zamówienia: <input type="number" name="id"></br>
    Wprowadź datę przyjęcia: <input type="text" name="receptionDate"><br>
    Wprowadź planowaną datę naprawy: <input type="text" name="planningRepairDate"><br>
    Wprowadź datę rozpoczęcia naprawy: <input type="text" name="repairStartDate"></br>
    Wprowadź osobę odpowiedzialną: <input type="text" name="repairEmployee"></br>
    Wprowadź przyczynę: <input type="text" name="problem"></br>
    Opisz sposób naprawy: <input type="text" name="repairPlan"></br>
    Status: <input type="number" name="status"></br>
    Pojazd: <input type="text" name="vehicle"></br>
    <input type="submit" value="Edytuj">
</form>
</body>
</html>
