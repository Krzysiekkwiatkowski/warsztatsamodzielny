<%--
  Created by IntelliJ IDEA.
  User: oem
  Date: 12.08.18
  Time: 08:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/CustomerEdit">
    <h3> Edytuj dane klienta </h3>
    Wprowadź id: <input type="number" name="id"><br>
    Wprowadź imię: <input type="text" name="name"><br>
    Wprowadź nazwisko: <input type="text" name="surname"></br>
    <input type="submit" value="Edytuj">
</form>
</body>
</html>
