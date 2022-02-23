package com.wh.abc_springboot_mybatis.services.Impl.user;

import com.wh.abc_springboot_mybatis.entity.user.User;
import com.wh.abc_springboot_mybatis.mapper.user.UserMapper;
import com.wh.abc_springboot_mybatis.services.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserService")
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;

    @Override
    public void insertUser() {
        userMapper.insertUser();
    }

    @Override
    public List<User> findUser() {
        return userMapper.findUser();
    }

}
