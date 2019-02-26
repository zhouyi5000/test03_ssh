package com.itheima.controller;

import com.itheima.model.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

/**
 * @author: zhouyi
 * @date 2019/2/26 11:35
 * @description:
 **/
@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;



    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<User> findAll(){
        List<User> users = userService.findAll();
        return  users;
    }
    @RequestMapping(value = "/findById/{id}",method = RequestMethod.GET)
    public User findById(@PathVariable(value = "id") Integer id){
        User user = userService.findById(id);
        return user;
    }
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public void update(@RequestBody User user){
         userService.update(user);
    }

}
