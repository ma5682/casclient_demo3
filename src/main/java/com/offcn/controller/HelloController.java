package com.offcn.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("getname")
    @ResponseBody
    public String demo(){
       String name= SecurityContextHolder.getContext().getAuthentication().getName();
       return name;
    }
    System.out.pring("你好呀");
}

