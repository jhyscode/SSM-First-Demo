package com.jhys.controller;

import com.jhys.entity.User;
import com.jhys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ：jhys
 * @date ：Created in 2020/10/16 16:28
 * @Description ：
 */
@Controller
@RequestMapping("")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findUser")
    public String findUser(Model model) {
        int id = 2;
        User user = this.userService.findUserById(id);
        model.addAttribute("user", user);
        return "index";
    }

}
