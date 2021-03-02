<%--
  Created by IntelliJ IDEA.
  User: khai trinh
  Date: 02/03/2021
  Time: 2:19 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ứng dụng chuyển đổi tiền tệ</title>
</head>
<body>
<form method="post">
    <select name="money">
        <option value="1" >USD to VND</option>
        <option value="2" ${selected}>VND to USD</option>
    </select>
    <input type="number" name="value" value="${value1}" placeholder="0$">
    <input type="text" value="${result}" disabled>
    <input type="submit" value="submit">
</form>
</body>
</html>
