package com.offcn.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("getname")
    @ResponseBody
    //这东西
    public String demo(){
        System.out.println("xiugai");
       String name= SecurityContextHolder.getContext().getAuthentication().getName();
       return name;
    }
}

