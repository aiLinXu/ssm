package cn.itcast.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xualin
 * @version v1.0
 * @date 2019/4/2 11:45
 * @description
 **/
@Controller
@RequestMapping("user")
public class UserController {


    @RequestMapping("user")
    public String toUser(){
        return "user";
    }
}