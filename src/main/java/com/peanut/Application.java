package com.peanut;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.peanut.dao")
public class Application {
    //启动12
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

}
