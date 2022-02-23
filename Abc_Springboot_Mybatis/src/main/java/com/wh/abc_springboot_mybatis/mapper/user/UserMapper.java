package com.wh.abc_springboot_mybatis.mapper.user;

import com.wh.abc_springboot_mybatis.entity.user.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    void insertUser();

    List<User> findUser();
}

