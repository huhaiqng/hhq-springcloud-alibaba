package com.hhq.user.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {
    @Value("${username}")
    private String userName;

    @Value("${server.port}")
    private String port;

    @GetMapping
    public String user() {
        System.out.println(port);
        return port;
    }
}
