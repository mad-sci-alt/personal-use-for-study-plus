package com.atzsh.spring.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author 张 书航
 * <p>
 * 本类为JDK动态代理实现，要求至少要有待实现接口，最终生成的代理类放在com.sun.proxy包下，类名为$proxy2
 * 动态代理还可以通过cglib实现，有时间去了解一下，cglib可以不需要接口，且最终生成的代理类会继承目标类，且与目标类在同一个包下面（Dubbo、ZooKeeper会使用到cglib动态代理）
 * <p>
 * <p>
 * 学习建议：动态代理机制不会要我们自己去写，
 * 但是Spring的AOP底层大量的用到了动态代理，我们需要弄清楚调用机制
 */
public class ProxyFactoryUtils {
    //待代理的目标类
    private Object target;

    public ProxyFactoryUtils(Object target) {
        this.target = target;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public Object getProxy() {
        ClassLoader classLoader = target.getClass().getClassLoader();

        Class<?>[] method = target.getClass().getInterfaces();

        InvocationHandler h = new InvocationHandler() {
            /**
             *
             * @param proxy 代理对象
             *
             * @param method 要执行的抽象方法
             *
             * @param args 执行方法的参数列表
             *
             * @return
             * @throws Throwable
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object res = null;
                //环绕通知实现即为四个通知的整合（前置通知、返回通知、异常通知、后置通知
                /*
                我们指的各种通知顺序都是围绕代理对象原方法前后进行的，各通知由不同的注解标识
                各种通知的执行顺序：
                    Spring版本5.3.x以前：
                    前置通知
                    目标操作
                    后置通知
                    返回通知或异常通知
                    Spring版本5.3.x以后：
                    前置通知
                    目标操作
                    返回通知或异常通知
                    后置通知
                总结为：5.3.x之后返回通知或异常通知先于后置通知执行
                 */
                try {
                    System.out.println("[日志]" + method.getName() + " 方法开始了，参数是：" + Arrays.toString(args));
                    res = method.invoke(target, args);
                    System.out.println("[日志]" + method.getName() + " 方法结束了，结果为：" + res);
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("[日志]" + method.getName() + " 方法发生异常了");
                } finally {
                    System.out.println("[日志]" + method.getName() + " 执行完毕");
                }

                return res;
            }
        };
        /**
         * newProxyInstance(
         * ClassLoader loader ：指定加载动态生成的代理类的类加载器
         * Class<?>[] interfaces ：获取目标对象实现的所有接口的class对象数组（待实现方法）
         * InvocationHandler h ：设置代理类中的抽象方法如何重写
         * )
         */
        return Proxy.newProxyInstance(classLoader, method, h);
    }
}
