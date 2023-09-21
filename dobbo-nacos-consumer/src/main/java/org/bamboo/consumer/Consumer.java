package org.bamboo.consumer;

import org.apache.dubbo.config.annotation.DubboReference;
import org.bamboo.dubbonacos.dubbo.api.DemoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Consumer implements CommandLineRunner {
    @DubboReference(version = "2.0")
    private DemoService demoService;

    @Override
    public void run(String... args) throws Exception {

        String result = demoService.sayHello("world");
        System.out.println("Receive result ======> " + result);
    }
}
