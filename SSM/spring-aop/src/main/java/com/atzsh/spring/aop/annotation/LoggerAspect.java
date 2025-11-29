package com.atzsh.spring.aop.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author 张 书航
 */
@Component("annotationAop")
@Aspect //将当前类标记为切面类
@Order(1)//设置当前切面的优先级为最高，数值越小优先等级越高，最大数值为int无符号最大值
public class LoggerAspect {
    //private static final String POINT_CUT="execution
    // (public int com.atzsh.spring.aop.annotation.impl.*(..))";思想是好的，但是这里不能这么做

    //设置一个公共切入点表达式，用方法名表示
    @Pointcut("execution(public int com.atzsh.spring.aop.annotation.impl.*.*(..))")
    public void pointCut() {
    }

    //标签内设置的表达式指定的作用域，让通知连接到切面类中的方法
//    @Before("execution(public int com.atzsh" +
//            ".spring.aop.annotation.impl." +
//            "CalculatorImpl.add(int,int))")
//    public void beforeAdviceMethod() {
//        System.out.println("LoggerAspect，前置通知");
//    }
    @Before("execution(* com.atzsh.spring.aop." +
            "annotation.impl.CalculatorImpl.*(..))")
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

    @After("pointCut()")
    public void afterAdviceMethod() {
        System.out.println("LoggerAspect，后置通知");
    }


}
