package com.zjh.controller;


import com.zjh.domain.ItemEntity;
import com.zjh.service.ItemService;
import com.zjh.service.impl.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/item")
public class ItemController {
@Autowired
    private ItemService itemService;

    @RequestMapping("/findById")
    public String findById(@PathVariable int id, Model model) {
        //调用SERVICE方法
        ItemEntity items = itemService.findById(id);
        //封装数据
        model.addAttribute("item", items);
        return "show";
    }

    @RequestMapping("/test")
    public String test(){
        return "show";
    }
}
