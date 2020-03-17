package com.myspringboot.myspringbootdemo.controller;

import com.myspringboot.myspringbootdemo.mapper.UserMapper;
import com.myspringboot.myspringbootdemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class RegisterController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/")
    public String Register(){
        return "register";
    }
    @RequestMapping("/addUser")
    public String register(HttpServletRequest request){
        String username =request.getParameter("username");
        String password =request.getParameter("password");
        String phoneNum =request.getParameter("phoneNum");
        String emileAddr =request.getParameter("emileAddr");
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setPhoneNum(phoneNum);
        user.setEmileAddr(emileAddr);
        userMapper.Save(user);
        return "login";
    }
}
