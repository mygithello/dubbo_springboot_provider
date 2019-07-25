package com.demo.dubbo_springboot_provider.remote.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.demo.dubbo_springboot_provider.remote.DemoReService;


/**
 * 服务发布配置
 * @Service 是 <dubbo:service> 的替代注解，用于服务提供方 Dubbo 服务暴露
 */
@Service(
        version = "1.0.0",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class DemoReServiceImpl implements DemoReService {
    @Override
    public String sayHello(String name) {
        return "Hello, " + name + " (from Spring Boot)";
    }
}
