package com.itheima.mappper;

import com.itheima.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: zhouyi
 * @date 2019/2/26 11:24
 * @description:
 **/
public interface UserMapper extends JpaRepository<User,Integer> {
}
