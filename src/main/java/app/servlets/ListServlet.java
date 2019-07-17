package app.servlets;

import app.model.Model;
import sun.awt.ModalExclude;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/list")
public class ListServlet extends HttpServlet {

    @Override  //обработка GET- запроса
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //получаем из объекта запроса объект диспетчера запросов, куда передаем адрес jsp страницы
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/views/List.jsp");
        //перенаправляем на эту страницу
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //получаем из модели список имен пользователей
       Model model = Model.getInstance();
       List<String> names = model.list();
       req.setAttribute("usernames", names);

       //перенаправляем на jsp страницу
       RequestDispatcher requestDispatcher = req.getRequestDispatcher("/views/List.jsp");
       requestDispatcher.forward(req, resp);

    }
}
