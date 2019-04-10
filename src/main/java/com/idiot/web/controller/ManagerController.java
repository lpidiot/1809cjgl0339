package com.idiot.web.controller;

import com.idiot.entity.TbClass;
import com.idiot.service.TbClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @auther idiot
 * @date 2018/9/30 - 15:33
 */
@Controller
@RequestMapping(value = "/manager")
public class ManagerController {
@Autowired
private TbClassService service;

    @RequestMapping(value = "classmanager")
    public String classmanager(ModelMap map){
        List<TbClass> list = service.findAll();
        map.put("classes",list);
        return "../tbclass/homepage";
    }
}
