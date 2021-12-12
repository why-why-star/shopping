package com.shoppingplus.controller;


import com.shoppingplus.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.shoppingplus.service.allservice;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class allcontroller {

    @Autowired
    private allservice aS;


    @RequestMapping("/listData")
    public String list(ModelMap model){
        List<User> lists = aS.lists();

        System.out.println("---------------------");
        System.out.println(lists.get(0).getName());
        System.out.println("---------------------");

        model.put("lists",lists);
        return "list";
    }


//    -------------------------覃森传-----------------------------

//    -------------------------覃森传-----------------------------

//    -------------------------邹正-----------------------------

//    -------------------------邹正-----------------------------

//    -------------------------覃翊-----------------------------

//    -------------------------覃翊-----------------------------

//    -------------------------郑德文-----------------------------

//    -------------------------郑德文-----------------------------

//    -------------------------梁家铭-----------------------------

//    -------------------------梁家铭-----------------------------






}
