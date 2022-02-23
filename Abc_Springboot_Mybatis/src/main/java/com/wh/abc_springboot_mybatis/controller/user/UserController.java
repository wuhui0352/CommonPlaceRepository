package com.wh.abc_springboot_mybatis.controller.user;

import com.wh.abc_springboot_mybatis.entity.user.User;
import com.wh.abc_springboot_mybatis.services.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/insert")
    public void insert(User user){
        userService.insertUser();
    }

    @RequestMapping("/findUserList")
    public List<User> findUserList(){
       return userService.findUser();
    }
}
