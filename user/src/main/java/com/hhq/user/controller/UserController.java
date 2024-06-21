package com.hhq.user.controller;

import com.hhq.user.entity.User;
import com.hhq.user.mapper.UserMapper;
import com.hhq.user.service.EchoService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Api(value = "用户管理", tags = "用户管理")
@RestController
public class UserController {

    @Autowired
    private EchoService echoService;

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/port")
    public String user() {
        System.out.println(port);
        return port;
    }

    @GetMapping(value = "/product/port")
    public String feign() {
        return echoService.getServerPort();
    }

    @Autowired
    private UserMapper userMapper;

    @GetMapping(value = "/all")
    public int all() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        int userCount = userList.size();
        userList.forEach(System.out::println);
        return userCount;
    }
}
