package com.hhq.product.controller;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@Api(value = "商品管理", tags = "商品管理")
@RestController
public class ProductController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/port")
    public String getServerPort() {
        return "Product Server Port: " + serverPort;
    }
}
