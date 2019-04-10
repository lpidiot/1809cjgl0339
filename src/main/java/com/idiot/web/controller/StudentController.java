package com.idiot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @auther idiot
 * @date 2018/9/29 - 22:23
 */
@Controller
@RequestMapping(value = "/student")
public class StudentController{
    @RequestMapping(value = {"/","/main"})
    public String main(){
        return "homepage";
    }


}

