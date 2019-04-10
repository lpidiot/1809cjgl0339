package com.idiot.common;

import com.idiot.entity.Student;
import com.idiot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class CommonController{
    @Autowired
    private StudentService service;
    @RequestMapping(value = {"/","/index"})
    public String homepage(){
        return "login";
    }
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(String xuehao, String password, HttpSession session){
        Student user = service.findByXuehaoAndPassword(xuehao, password);
        if(user==null){
            session.removeAttribute("user");
            return "redirect:login";
        }else{
            if(user.getManager()==null){
                session.setAttribute("user",user);
                return "student/homepage";
            }
            session.setAttribute("user",user);
            return "manager/homepage";
        }
    }




}
