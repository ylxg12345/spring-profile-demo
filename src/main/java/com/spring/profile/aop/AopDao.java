package com.spring.profile.aop;

import org.springframework.stereotype.Component;

/**
 * @author byzuse
 * datetime: 2021/4/1 23:29
 */
@Component
public class AopDao {

    public void getBefore(){
        System.out.println("3. 我操作数据库：");
    }

    @AopNote
    public void getBeforeTWO(){
        System.out.println("我是巨无霸：");
    }
}

