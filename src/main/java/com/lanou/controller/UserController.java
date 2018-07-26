package com.lanou.controller;


import com.lanou.model.User;
import com.lanou.service.impl.UserServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class UserController {
    @Autowired
    private UserServiceimpl userServiceimpl;

    //插入一条数据;
    @RequestMapping("/findAll")
    public String findId(User user) {
        int insert = userServiceimpl.insert(user);
        return "userlist";
    }

    //删除一条数据;
    //
    @RequestMapping("/delete")
    public String delete(Integer id) {
        int i = userServiceimpl.deleteByPrimaryKey(id);
        return "userlist";
    }
    public String login(){
        System.out.println(11);
        return "aaa";
    }

}



