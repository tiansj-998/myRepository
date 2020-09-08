package com.broada.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author tsj
 * @Date 2020/9/4 9:22
 */
@RestController
@RequestMapping("/test")
public class StatusController {
    @RequestMapping("/hot1")
    public String hotBuild(){
        return "OK";
    }

    @RequestMapping("/hot2")
    public String hotBuild2(){
        return "fk OK";
    }
}
