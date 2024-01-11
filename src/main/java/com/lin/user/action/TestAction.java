package com.lin.user.action;

import com.lin.user.model.User;
import com.lin.user.service.impl.UserServiceImpl;

public class TestAction {
    public static void main(String[] args) {
        User user = new User();
        user.setUsername("asdf");
        user.setPassword("q43222er");
        UserServiceImpl userService = new UserServiceImpl();
        userService.saveUser(user);
    }
}
