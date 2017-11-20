package com.springcloud.eurekaclient.controller;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

/**
 * Description:
 * Company:中智关爱通
 * author：tao.zhang
 *
 * @date：2017/11/9
 */

@RestController
public class DiscoveryClientController {

    @Resource
    DiscoveryClient discoveryClient;

    @GetMapping("dc")
    public String discoveryClient(){
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }
}
