package com.example.voaserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Brilley
 * @description voa-server--for test!
 * @date 2022-04-10 20:04
 */
@RestController
public class HelloController {
    @GetMapping("hello")
    public String hello(){
        return "hello, this is Brilley!";
    }
}
