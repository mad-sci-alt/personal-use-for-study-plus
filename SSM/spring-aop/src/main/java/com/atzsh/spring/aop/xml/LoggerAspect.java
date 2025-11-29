package com.atzsh.spring.aop.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author 张 书航
 */
@SuppressWarnings("all")
@Component("annotationLoggerAspect")
public class LoggerAspect {
    //private static final String POINT_CUT="execution
    // (public int com.atzsh.spring.aop.annotation.impl.*(..))";思想是好的，但是这里不能这么做

    public void beforeAdviceMethod(JoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        Object[] args = joinPoint.getArgs();//获取方法的参数列表
        String name = signature.getName();//获取当前切入点方法的方法名
        int modifiers = signature.getModifiers();//获取当前切入点方法的修饰符
        Class declaringType = signature.getDeclaringType();//用于反射的获取
        String declaringTypeName = signature.getDeclaringTypeName();//获取
        System.out.println("LoggerAspect，方法" + name + "，参数列表：" +
                Arrays.toString(args));
    }

    public void afterAdviceMethod() {
        System.out.println("LoggerAspect，后置通知");
    }
    public int afterReturningAdviceMethod() {
        System.out.println("LoggerAspect，后置通知");
        return 0;
    }


}
