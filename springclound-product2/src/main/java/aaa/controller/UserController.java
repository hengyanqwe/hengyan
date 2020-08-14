package aaa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @RequestMapping("getUser")
    public String getUser(){
        return "ProductA--负载均衡服务二";
    }
}
