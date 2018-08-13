<%--
  Created by IntelliJ IDEA.
  User: oem
  Date: 27.07.18
  Time: 07:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Main Page</title>
</head>
<body>
<h1> Warsztat Samochodowy </h1>
<h3>Menu:</h3>
<input type="button" onclick="location.href='http://localhost:8080/CustomerPage'" value="Klienci">
<input type="button" onclick="location.href='http://localhost:8080/VehiclePage'" value="Pojazdy">
<input type="button" onclick="location.href='http://localhost:8080/EmployeePage'" value="Pracownicy">
<input type="button" onclick="location.href='http://localhost:8080/OrderPage'" value="Zlecenia">
<input type="button" onclick="location.href='http://localhost:8080/StatusPage'" value="Prowadzone naprawy">
</body>
</html>
