<%--
  Created by IntelliJ IDEA.
  User: oem
  Date: 12.08.18
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3> Usuń pojazd </h3>
<form action="/VehicleDel" method="post">
    Wprowadź id pojazdu do usunięcia <input type="number" name="id">
    <input type="submit" value="Usuń">
</form>
</body>
</html>
