package com.wh.abc_springboot_mybatis.services.user;

import com.wh.abc_springboot_mybatis.entity.user.User;

import java.util.List;

public interface UserService {
    void insertUser();


    List<User> findUser();
}
