package com.lanou.service.impl;

import com.lanou.dao.UserMapper;
import com.lanou.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userServiceimpl")
public class UserServiceimpl {
    @Autowired
    private UserMapper userMapper;

    public int insert(User record) {
        int insert = userMapper.insert(record);
        return insert;

    }

//通过id删除;
   public int deleteByPrimaryKey(Integer userId){
       int i = userMapper.deleteByPrimaryKey(userId);
       return i;
   }

}
