package com.spring.profile.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author byzuse
 * datetime: 2021/4/1 23:30
 */
@Aspect
@Component
public class AopDemo {

    @Before(value = "execution(* com.spring.profile.aop.AopDao.getBefore())")
    public void getDemo(){
        System.out.println("2. 用户要操作数据库了-----------------");
    }

    @After(value = "execution(* com.spring.profile.aop.AopDao.getBefore())")
    public void getDemoAfter(){
        System.out.println("4. 用户要操作数据库了-----------------");
    }
}

