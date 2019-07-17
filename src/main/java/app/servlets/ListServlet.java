package app.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/list")
public class ListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //получаем из объекта запроса объект диспетчера запросов, куда передаем адрес jsp страницы
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/views/List.jsp");
        //перенаправляем на эту страницу
        requestDispatcher.forward(req, resp);

    }
}
