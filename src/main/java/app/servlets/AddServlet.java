package app.servlets;

import app.entities.User;
import app.model.Model;
import com.sun.org.apache.xpath.internal.operations.Mod;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/add")
public class AddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //получаем из объекта запроса объект диспетчера запросов, куда передаем адрес jsp страницы
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/views/Add.jsp");
        //перенаправляем на эту страницу
        requestDispatcher.forward(req, resp);
    }


}
