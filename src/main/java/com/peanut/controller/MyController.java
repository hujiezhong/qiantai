package com.peanut.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("list")
    public String list(){
        return "list";
    }

    @RequestMapping("index")
    public String index(){
        return "index";
    }

}
