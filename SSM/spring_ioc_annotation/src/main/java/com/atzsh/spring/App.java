package com.atzsh.spring;

import com.atzsh.spring.cal.Calculator;
import com.atzsh.spring.cal.impl.CalculatorImpl;
import com.atzsh.spring.proxy.ProxyFactoryUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * Hello world!
 */
@Controller
@Component
@Service
public class App {
    public static void main(String[] args) {
//        CalculatorStaticProxy proxy = new CalculatorStaticProxy(new CalculatorImpl());
//        proxy.add(1,2);
        ProxyFactoryUtils factory = new ProxyFactoryUtils(new CalculatorImpl());
        Calculator proxy = (Calculator) factory.getProxy();
        proxy.add(1,2);
    }


}
