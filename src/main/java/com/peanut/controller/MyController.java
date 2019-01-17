package com.peanut.controller;

import com.peanut.entity.Category;
import com.peanut.entity.Product;
import com.peanut.service.CategoryService;
import com.peanut.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    private CategoryService cs;

    @Autowired
    private ProductService ps;

    @RequestMapping("list")
    public String list(Model mod){
        List<Category> list = cs.list();   //分类
        List<Product> list2 = ps.select(); //商品
        mod.addAttribute("list",list);
        mod.addAttribute("list2",list2);
        for (Product c : list2){
            System.out.println(c.getImage()+"-"+c.getCategory());
        }
        return "list";
    }

    @RequestMapping("index")
    public String index(){
        return "index";
    }

}
