package com.lin.user.action;

import com.lin.user.model.User;
import com.lin.user.service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * 商品操作-控制层
 *
 */
@Controller
@Scope("prototype")
public class UserAction extends ActionSupport {

    private String username;
    private String password;

    /**
     * 保存商品操作
     *
     * @return
     */
    public String saveUser() {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        UserServiceImpl userService = new UserServiceImpl();
        userService.saveUser(user);
        this.addActionMessage("注册成功...");
        return SUCCESS;

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}