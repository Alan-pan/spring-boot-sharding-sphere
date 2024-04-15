package com.yp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yp.entity.User;
import com.yp.mapper.UserMapper;
import com.yp.service.UserService;
import org.springframework.stereotype.Service;

/**
* @author yupan
* @description 针对表【t_user】的数据库操作Service实现
* @createDate 2024-04-09 10:02:41
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




