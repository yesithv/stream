package org.ironcoding;

import org.ironcoding.model.User;

import java.util.ArrayList;
import java.util.List;

public class Cterminal {

    public static void main(String[] args) {

        List<User> userList = new ArrayList<>();
        userList = List.of(new User("Jhon", 18, true), new User("Silvi", 43, false), new User("Franco", 15, true), new User("Ivon", 42, false), new User("Ivon", 43, false));

        userList.stream()
                .forEach(user -> System.out.println(user));

        var uniqueName = userList.stream().filter(user -> user.getName().equals("Ivon"))
                .findFirst(); // findAny()
        System.out.println("Find fist Ivon: " + uniqueName);

        var some18 = userList.stream()
                .anyMatch(user -> user.getAge().equals(18));
        System.out.println("Unique 18 ? " + some18);

        var how40 = userList.stream().filter(user -> user.getAge() > 40)
                .count();
        System.out.println("Older than 40: " + how40);

        
    }
}
