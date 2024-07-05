package com.hhq.user.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "product")
public interface ProductService {
    @GetMapping(value = "/product/port")
    String getServerPort();
}
