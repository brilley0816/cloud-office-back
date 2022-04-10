package com.example.voaserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.voaserver.mapper")
public class YebApplicationServer {
    public static void main(String[] args) {
        SpringApplication.run(YebApplicationServer.class,args);
    }
}
