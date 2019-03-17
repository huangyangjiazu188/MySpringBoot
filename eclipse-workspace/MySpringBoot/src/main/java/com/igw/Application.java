package com.igw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2 //启动Swagger

public class Application {

    public static void main(String[] args) {
//        SpringApplication.run(Application.class, args);
        
        
        SpringApplication app = new SpringApplication(Application.class);
        
        //添加自定义初始化
//        app.setInitializers(initializers);
//        
//        //添加自定义监听
//        app.setListeners(listeners);
        
        app.run(args);
        
    }

    

}