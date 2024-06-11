package com.hhq.user.controller;

import com.hhq.user.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

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

}
