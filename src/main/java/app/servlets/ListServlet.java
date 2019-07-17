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

    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //получаем из модели список имен пользователей
       Model model = Model.getInstance();
       List<String> names = model.list();
       req.setAttribute("usernames", names);

       //перенаправляем на jsp страницу
       RequestDispatcher requestDispatcher = req.getRequestDispatcher("/views/List.jsp");
       requestDispatcher.forward(req, resp);

    }
}
