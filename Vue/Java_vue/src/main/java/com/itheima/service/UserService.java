package com.itheima.service;

import com.itheima.model.User;

import java.util.List;

/**
 * @author: zhouyi
 * @date 2019/2/26 11:27
 * @description:
 **/
public interface UserService {

    //查询所有
    List<User> findAll();

    List<User> abc();

    void update(User user);

    User findById(Integer id);
}
