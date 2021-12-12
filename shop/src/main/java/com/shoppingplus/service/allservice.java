package com.shoppingplus.service;



import com.shoppingplus.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import com.shoppingplus.mapper.allmapper;

@Service
public class allservice {


    @Autowired
    private allmapper aM;

    public List<User> lists() {

        System.out.println("test");
        return aM.getlists();
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

