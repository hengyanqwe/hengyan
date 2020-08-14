package aaa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class OrderController {

    @RequestMapping("select")
    public String getUser(){
        return "ProductB--查询订单信息";
    }

}
