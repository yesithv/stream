package org.ironcoding;

import org.ironcoding.model.User;

import java.util.ArrayList;
import java.util.List;

public class Amap {

    public static void main(String[] args) {

        List<User> userList = new ArrayList<>();
        userList = List.of(new User("Jhon", 34, true), new User("Silvi", 49, false), new User("Franco", 15, true), new User("Ivon", 42, false));

        System.out.println("Vamos al map");

        userList.stream().map(user -> {
            System.out.println("Entrando al map " + user.getName());
            return user;
        });

    }


}
