package Class_;

import reflection_.Dog;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * @author 张 书航
 */
public class ClassLoad01_ {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Scanner ms = new Scanner(System.in);
        String key = ms.next();
        switch (key){
            //直接这样写直接new的话就是静态加载了类，无论key会不会是“1”，
            // 在编译阶段就会将Dog类载入堆，依赖性强
            case "1":
                Dog dog = new Dog();
                dog.hi();
                break;
                //而通过反射机制获取就是动态加载类，只有当key是“2”的时候，才会去加载Dog类，依赖性相对较弱
            case "2":
                Class<?> cls = Class.forName("reflection_.Dog");
                Object o = cls.newInstance();
                Method md = cls.getMethod("hi");
                Object invoke = md.invoke(o);
                System.out.println("ok");
                break;

        }
    }
}
