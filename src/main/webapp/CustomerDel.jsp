<%--
  Created by IntelliJ IDEA.
  User: oem
  Date: 12.08.18
  Time: 08:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3> Usuń klienta </h3>
<form action="/CustomerDel" method="post">
    Wprowadź id klienta do usunięcia <input type="number" name="id">
    <input type="submit" value="Usuń">
</form>
</body>
</html>
