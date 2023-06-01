package org.ironcoding;

import org.ironcoding.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Bfilter {

    public static void main(String[] args) {


        List<User> userList = new ArrayList<>();
        userList = List.of(new User("Jhon", 14, true), new User("Silvi", 49, false), new User("Franco", 15, true), new User("Ivon", 42, false));

        var names = userList.stream()
                .filter(User::isActive)
                .map(user -> user.getName())
                .collect(Collectors.toList());
        System.out.println("Nombres activos: " + names);

        var ages = userList.stream()
                .filter(user -> user.getAge() > 18)
                .map(user -> user.getName())
                .collect(Collectors.toList());
        System.out.println("Mayores de edad : " + ages);

    }
}
