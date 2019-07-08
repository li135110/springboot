package com.tk.ccm.dict.annotation.demo2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/*** 功能：注解类的实现* authorize: lijianwen* Date: 2018/6/5 14:20*/
@Component
@Aspect
public class Demo2Impl {
    @Pointcut("@annotation(com.tk.ccm.dict.annotation.demo2.Demo2)")
    private void cut() {
        System.out.println("定义切点位置");
    }

    // 开始环绕
    @Around("cut()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("1");
        try {
            joinPoint.proceed();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("4");
    }

    @Before("cut()")
    public void before() {
        System.out.println("2");
    }

    @After("cut()")
    public void after() {
        System.out.println("5");
    }
}

