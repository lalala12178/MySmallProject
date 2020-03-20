package com.lalala.houtai.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
//@RequestMapping("/")
public class MController {

    //匹配"/"
    @Resource
    UsersController usersController;

    @RequestMapping("/")
    public String showPage(){
        return "redirect:user/login";
    }
}
