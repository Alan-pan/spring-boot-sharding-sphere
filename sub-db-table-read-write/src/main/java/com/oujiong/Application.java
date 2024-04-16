package com.oujiong;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Description: 启动类
 *
 * @author xub
 * @date 2019/10/08 下午6:33
 */
@SpringBootApplication
//只能设置为mapper接口的包,设置com.oujiong会导致所有接口代理,导致UserService错误代理不能使用UserServiceImpl
@MapperScan("com.oujiong.mapper")
@EnableAspectJAutoProxy()
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
