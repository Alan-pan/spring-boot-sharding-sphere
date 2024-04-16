package com.oujiong.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.oujiong.entity.User;
import com.oujiong.mapper.UserMapper;
import com.oujiong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
* @author yupan
* @description 针对表【tab_user】的数据库操作Service实现
* @createDate 2024-04-15 18:11:54
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> list() {
        List<User> users = baseMapper.selectAll();
        return users;
    }

    @Override
    public String insertForeach(List<User> userList) {
        for (User user : userList) {
            user.setCreateTime(new Date());
            user.setUpdateTime(new Date());
            user.setStatus(0);
        }
        //批量插入数据
//        baseMapper.insertForeach(userList);
        userMapper.insertForeach(userList);
        return "保存成功";
    }
}




