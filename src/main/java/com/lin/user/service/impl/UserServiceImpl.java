package com.lin.user.service.impl;


import com.lin.user.dao.impl.UserDaoImpl;
import com.lin.user.model.User;
import com.lin.user.service.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public void saveUser(User user){
        UserDaoImpl userDaoImpl = new UserDaoImpl();
        userDaoImpl.savaUser(user);
    }

}
