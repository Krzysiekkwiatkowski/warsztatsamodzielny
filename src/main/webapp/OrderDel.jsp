<%--
  Created by IntelliJ IDEA.
  User: oem
  Date: 13.08.18
  Time: 16:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3> Usuń zamówienie </h3>
<form action="/OrderDel" method="post">
    Wprowadź id zamówienia do usunięcia <input type="number" name="id">
    <input type="submit" value="Usuń">
</form>
</body>
</html>
