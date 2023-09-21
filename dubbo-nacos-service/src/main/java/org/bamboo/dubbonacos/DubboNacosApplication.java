package org.bamboo.dubbonacos;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class DubboNacosApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboNacosApplication.class, args);
    }

}
