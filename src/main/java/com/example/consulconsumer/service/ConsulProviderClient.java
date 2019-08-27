package com.example.consulconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author:yj
 * @Date:2019/7/1 16:13
 */
@FeignClient(name = "consulprovider")
public interface ConsulProviderClient {

    @GetMapping("test")
    String test();
}
