package com.jhys.dao;

import com.jhys.entity.User;

/**
 * @author ：jhys
 * @date ：Created in 2020/10/16 15:21
 * @Description ：
 */
public interface UserDao {

    /**
     * 根据id查询所有的User对象
     * @param id
     * @return
     */
    User findUserById(int id);
}
