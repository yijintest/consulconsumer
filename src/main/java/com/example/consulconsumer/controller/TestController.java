package com.example.consulconsumer.controller;

import com.example.consulconsumer.service.ConsulProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:yj
 * @Date:2019/7/1 16:12
 */
@RestController
public class TestController {

    @Autowired
    private ConsulProviderClient consulProviderClient;

    @GetMapping("feignTest")
    public String feignTest(){
        return consulProviderClient.test();
    }
}
