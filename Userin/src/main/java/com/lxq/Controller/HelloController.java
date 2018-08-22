package com.lxq.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //像helloboot接口打招呼
    @RequestMapping(value = "/helloboot")
    public String helloboot(){
        return "hello boot I U";
    }
}
