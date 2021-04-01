package com.spring.profile.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author byzuse
 * datetime: 2021/4/1 23:30
 */
@Aspect
@Component
public class AopNoteDemo {

    @Before(value ="@annotation(com.spring.profile.aop.AopNote)")
    public void getDemo(){
        System.out.println("我是注解开发AOP-----------------");
    }
}

