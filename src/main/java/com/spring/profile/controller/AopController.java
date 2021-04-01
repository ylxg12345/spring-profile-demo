package com.spring.profile.controller;

import com.spring.profile.aop.AopDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author byzuse
 * datetime: 2021/4/1 23:33
 */
@RestController
public class AopController {

    @Autowired
    AopDao aopDao;

    @RequestMapping("/aop")
    String aopDemo() {
        System.out.println("1 =========================");
        aopDao.getBefore();
        return "success";
    }


    @RequestMapping("/aopNote")
    String aopNoteDemo() {
        System.out.println("=========================");
        aopDao.getBeforeTWO();
        return "success";
    }


}

