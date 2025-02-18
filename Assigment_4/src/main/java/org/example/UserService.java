package org.example;

import java.util.HashMap;
import java.util.Map;

public class UserService {
    private static Map<Integer, User> users = new HashMap<>();

    private UserService() {}

    public static void addUser(User user) {
        users.put(user.getUserId(), user);
    }

    public static User findUser(int userId) {
        return users.get(userId);
    }

    public static boolean deleteUser(int userId) {
        if (users.containsKey(userId)) {
            users.remove(userId);
            return true;
        }
        return false;
    }

}

