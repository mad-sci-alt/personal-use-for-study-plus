package com.atzsh.spring.proxy;

import com.atzsh.spring.cal.impl.CalculatorImpl;

/**
 * @author 张 书航
 */
public class CalculatorStaticProxy {
    private CalculatorImpl target;

    public CalculatorImpl getTarget() {
        return target;
    }

    public void setTarget(CalculatorImpl target) {
        this.target = target;
    }

    public CalculatorStaticProxy(CalculatorImpl target) {
        this.target = target;
    }

    public CalculatorStaticProxy() {
    }

    public void add(int i, int j){
        // 附加功能由代理类中的代理方法来实现，此处是静态的手动代理，使用的是硬编码
        System.out.println("[日志] add 方法开始了，参数是：" + i + "," + j);
        int res = target.add(i,j);
        System.out.println("[日志] add 方法结束了，结果是：" + res);
    }
    public void sub(int i, int j){
        System.out.println("[日志] sub 方法开始了，参数是：" + i + "," + j);
        int res = target.sub(i,j);
        System.out.println("[日志] sub 方法结束了，结果是：" + res);
    }
    public void div(int i, int j){
        System.out.println("[日志] div 方法开始了，参数是：" + i + "," + j);
        int res = target.div(i,j);
        System.out.println("[日志] div 方法结束了，结果是：" + res);
    }
    public void mul(int i, int j){
        System.out.println("[日志] div 方法开始了，参数是：" + i + "," + j);
        int res = target.mul(i,j);
        System.out.println("[日志] sub 方法结束了，结果是：" + res);
    }
}
