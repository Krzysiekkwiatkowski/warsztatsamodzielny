<%--
  Created by IntelliJ IDEA.
  User: oem
  Date: 13.08.18
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form  method="post" action="/StatusAdd">
    <h3> Dodaj status </h3>
    Wprowadź status naprawy: <input type="number" name="repairStatus"></br>
    Wprowadź koszt naprawy: <input type="number" name="repairCost"></br>
    <input type="submit" value="Dodaj">
</form>
</body>
</html>
