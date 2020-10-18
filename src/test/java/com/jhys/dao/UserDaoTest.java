package com.jhys.dao;

import com.jhys.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author ：jhys
 * @date ：Created in 2020/10/16 15:28
 * @Description ：
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class UserDaoTest {

//    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(UserDaoTest.class);
    private  final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserDao userDao;

    @Test
    public void testfindUserById() {
        int id = 1;
        User user = userDao.findUserById(id);
        LOGGER.info("username: {}", user.getUsername());
        System.out.println(user.getId() + ":" + user.getUsername());

    }
}