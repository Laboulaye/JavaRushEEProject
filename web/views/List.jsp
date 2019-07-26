<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Максим
  Date: 17.07.2019
  Time: 11:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Users List</title>
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    </head>

    <body class="w3-light-grey">
        <!-- шапка тела страницы -->
        <div class="w3-container w3-blue-grey w3-opacity w3-right-align">
            <h1>Simple app</h1>
        </div>

        <div class="w3-container w3-center w3-margin-bottom w3-padding">
            <div class="w3-card-4">
                <div class="w3-container w3-light-blue">
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
                        out.println("<div class=\"w3-panel w3-red w3-display-container w3-card-4 w3-round\">\n" +
                            "   <span onclick=\"this.parentElement.style.display='none'\"\n" +
                            "   class=\"w3-button w3-margin-right w3-display-right w3-round-large w3-hover-red w3-border w3-border-red w3-hover-border-grey\">×</span>\n" +
                            "   <h5>There are no users yet!</h5>\n" +
                            "</div>");
                    }
                %>
            </div>
        </div>

        <!-- кнопка возврата на главную страницу -->
        <div class="w3-container w3-grey w3-opacity w3-right-align w3-padding">
            <button class="w3-btn w3-round-large" onclick="location.href='/'">Back to main</button>
        </div>

    </body>
</html>
