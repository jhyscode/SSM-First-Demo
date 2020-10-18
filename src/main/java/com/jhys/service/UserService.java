package com.jhys.service;

import com.jhys.entity.User;

/**
 * @author ：jhys
 * @date ：Created in 2020/10/16 16:19
 * @Description ：
 */
public interface UserService {

    // 根据 id 寻找对应的 User
    public User findUserById(int id);
}
