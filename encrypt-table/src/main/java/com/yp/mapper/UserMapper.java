package com.yp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yp.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper extends BaseMapper<User> {

    @Insert("insert into t_user(user_id,user_name,password) " +
            "values(#{userId},#{userName},#{password})")
    void insetUser(User users);

    @Select("select * from t_user where user_name=#{userName} and password=#{password}")
    @Results({
            @Result(column = "user_id", property = "userId"),
            @Result(column = "user_name", property = "userName"),
            @Result(column = "password", property = "password"),
            @Result(column = "password_assisted", property = "passwordAssisted")
    })
    List<User> getUserInfo(String userName, String password);
}
