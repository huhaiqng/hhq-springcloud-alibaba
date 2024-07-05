package com.hhq.user.controller;

import com.hhq.user.common.response.ResponseResult;
import com.hhq.user.mapper.UserMapper;
import com.hhq.user.pojo.User;
import com.hhq.user.service.ProductService;
import com.hhq.user.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "用户管理", tags = "用户管理")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private ProductService productService;

    @GetMapping(value = "/all")
    public int all() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userService.list();
        int userCount = userList.size();
        userList.forEach(System.out::println);
        return userCount;
    }

    @PostMapping(value = "/add")
    public ResponseResult<User> add(@RequestBody User user) {
        boolean i = userService.save(user);
        return ResponseResult.success();
    }

    @GetMapping(value = "/product/port")
    public String feign() {
        return productService.getServerPort();
    }
}
