package app.model;

import app.entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
Реализуем паттерн MVC. Здесь Model - данные, с которыми работает программа. Модель хранит данные
View- отображение (JSP- страницы).
Controller - связующее звено между данными и отображением (сервлеты). */
public class Model {

    //реализация шаблона Синглтон
    private static Model instance = new Model();

    private List<User> model;

    public static Model getInstance() {
        return instance;
    }

    private Model(){
        model = new ArrayList<User>();
    }

    //метод добавляет пользователя в список
    public void addUser(User user){
        model.add(user);
    }

    //метод возвращает список строк (список пользователей)
    public List<String> list(){
        return model.stream()
                .map(User::getName)
                .collect(Collectors.toList());
    }

}
