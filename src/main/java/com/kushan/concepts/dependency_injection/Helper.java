package com.kushan.concepts.dependency_injection;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @author Ravindu
 * 8/11/2022
 */
@Component
@Aspect
@EnableAspectJAutoProxy
public class Helper {
    @Before("execution(public void testIt())")
    public void log(){
        System.out.println("Log printed from ASPECT....................");
    }

    @After("execution(public void completeIt())")
    public void printAuthor(){
        System.out.println("Author@Kushan95 printed from ASPECT....................");
    }

//    @Before("execution(* Desktop.process())")     //point-cut expression
//    public void logBeforeV1(JoinPoint joinPoint)
//    {
//        System.out.println("Helper.logBeforeV1() : " + joinPoint.getSignature().getName());
//    }

}
