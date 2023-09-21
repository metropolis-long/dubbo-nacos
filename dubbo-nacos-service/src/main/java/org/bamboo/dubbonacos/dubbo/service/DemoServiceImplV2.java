package org.bamboo.dubbonacos.dubbo.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.bamboo.dubbonacos.dubbo.api.DemoService;

@DubboService(version = "2.0")
public class DemoServiceImplV2 implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello222222222 " + name;
    }
}