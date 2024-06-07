package com.hhq.product.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/port")
    public String getServerPort() {
        return "Product Server Port: " + serverPort;
    }
}
