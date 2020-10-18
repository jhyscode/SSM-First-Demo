package com.jhys.service.impl;

import com.jhys.dao.UserDao;
import com.jhys.entity.User;
import com.jhys.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ：jhys
 * @date ：Created in 2020/10/16 16:24
 * @Description ：
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    public User findUserById(int id) {
        return userDao.findUserById(id);
    }
}
