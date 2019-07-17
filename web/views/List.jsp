<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Макс
  Date: 17.07.2019
  Time: 11:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Users List</title>
    </head>

    <body>
        <!-- шапка тела страницы -->
        <div>
            <h1>Super app</h1>
        </div>

        <div>
            <div>
                <div>
                    <h2>Users</h2>
                </div>

                <!--используя объект request, получаем список имен и выводим их на экран -->
                <%
                    List<String> names = (List<String>)request.getAttribute("usernames");
                    if (names != null && !names.isEmpty()) {
                        out.println("<ui>");
                        for (String s : names){
                            out.println("<li>" + s + "</li>");
                        }
                        out.println("</ui>");
                    }
                    //если пользователей нет, выводим фразу
                    else {
                        out.println("<p>There are no users yet!</p>");
                    }
                %>
            </div>
        </div>

        <!-- кнопка возврата на главную страницу -->
        <div>
            <button onclick="location.href='/'">Back to main</button>
        </div>

    </body>
</html>
