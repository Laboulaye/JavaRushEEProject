package app.model;

import app.entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Model {

    //реализация шаблона Синглтон
    private static Model instance = new Model();

    private List<User> model;

    private static Model getInstance() {
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
