<%--
  Created by IntelliJ IDEA.
  User: Макс
  Date: 17.07.2019
  Time: 11:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add new user</title>
</head>
<body>
<!--Создаем два текстовых поля (Имя и Пароль) и кнопку подтверждения -->
    <form method="post">
        <label>Name:
            <input type="text" name="name"><br/>
        </label>

        <label>Password:
            <input type="password" name="pass"><br/>
        </label>
        <button type="submit">Submit</button>
    </form>

</body>
</html>
