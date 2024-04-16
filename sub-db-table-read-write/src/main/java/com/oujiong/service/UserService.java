package com.oujiong.service;

import com.oujiong.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author yupan
* @description 针对表【tab_user】的数据库操作Service
* @createDate 2024-04-15 18:11:54
*/
public interface UserService extends IService<User> {
    /**
     *  获取所有用户信息
     */
    List<User> list();

    /**
     *  批量 保存用户信息
     * @param userVOList
     */
    String  insertForeach(List<User> userVOList);
}
