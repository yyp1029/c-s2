package server;

import entity.User;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Server {
    private static ArrayList<User> users = new ArrayList<>();

    public Server(){
        users.add(new User("杨芋棚","12345","雅安市"));
        users.add(new User("张三","33333","成都市"));
        users.add(new User("李四","44444","成都市"));
    }

    public static ArrayList<User> getAllUsers(){
        return users;
    }

    public static void deleteUserByName(String name){
        for (User user : users) {
            if(user.getName().equals(name)){
                users.remove(user);
                return;
            }
        }
    }

    public static void addUses(User user){
        users.add(user);
    }
}
