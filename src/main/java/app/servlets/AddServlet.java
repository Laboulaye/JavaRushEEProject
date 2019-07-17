package app.servlets;

import app.entities.User;
import app.model.Model;

import javax.jws.WebParam;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/add")
public class AddServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //получаем из объекта запроса объект диспетчера запросов, куда передаем адрес jsp страницы
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/views/Add.jsp");
        //перенаправляем на эту страницу
        requestDispatcher.forward(req, resp);
    }

    @Override //обработка POST-запроса
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //вытягиваем из запроса имя и пароль, которые отправила форма jsp
        String name = req.getParameter("name");
        String password = req.getParameter("pass");

        //создаем объект пользователя
        User user = new User(name, password);
        //создаем объект Модели
        Model model = Model.getInstance();
        model.addUser(user);
    }
}
