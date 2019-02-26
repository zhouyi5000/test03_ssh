package com.itheima.service.Impl;

import com.itheima.mappper.UserMapper;
import com.itheima.model.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author: zhouyi
 * @date 2019/2/26 11:28
 * @description:
 **/
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> findAll() {
        List<User> users = userMapper.findAll();
        return users;
    }

    @Override
    public List<User> abc() {
        return null;
    }

    @Override
    public void update(User user) {
        userMapper.save(user);

    }

    @Override
    public User findById(Integer id) {
        User user = userMapper.findOne(id);
        return user;
    }
}
