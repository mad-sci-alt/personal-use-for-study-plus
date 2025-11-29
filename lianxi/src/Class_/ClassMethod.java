package Class_;

import reflection_.Dog;

import java.lang.reflect.InvocationTargetException;

/**
 * @author 张 书航
 * 演示程序在三个阶段（编译、加载、运行）获取Class对象的方式
 */
public class ClassMethod {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //1.在编译阶段通过读取配置文件
        //Class.forName
        //（一般是从xml文件中读取，这里直接用一个String来模拟路径）
        String classfullpath = "reflection_.Dog";
        Class cls1 = Class.forName(classfullpath);
        //2.类名.class 应用场景：参数传递
        Class cls2 = Dog.class;
        //3.对象.getClass() 应用场景：对象已存在获取对应的Class对象
        Dog dog = new Dog();
        Class cls3 = dog.getClass();
        //4.通过类加载器获取
        ClassLoader classLoader =
                dog.getClass().getClassLoader();
        Class cls4 = classLoader.loadClass(classfullpath);
        System.out.println(cls1 == cls2);
        System.out.println(cls1.hashCode());
        System.out.println(cls2.hashCode());
        System.out.println(cls3.hashCode());
        System.out.println(cls4.hashCode());

        //5.八大基本数据（int、char等）按如下方式获取Class类对象
        Class cls5 = int.class;
        System.out.println(cls5);
        //6.基本数据类型的包装类，通过 .TYPE获取Class类对象
        Class<Integer> type = Integer.TYPE;
        Class<Boolean> type1 = Boolean.TYPE;
        System.out.println(type);
        System.out.println(type==cls5);//通过基本数据得到的和通过包装类对象得到的Class对象是同一个对象
    }
}
