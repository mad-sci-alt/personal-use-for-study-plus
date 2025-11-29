package reflection_;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author 张 书航
 */
public class Reflection01 {
    public static void main(String[] args)
            throws IOException, ClassNotFoundException, InvocationTargetException,
            NoSuchMethodException, InstantiationException, IllegalAccessException {
        m1();
        m2();
    }

    public static void m1() {
        Dog dog = new Dog();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 9000000; i++) {
            dog.hi();
        }
        long end = System.currentTimeMillis();
        System.out.println("普通方式调用方法所耗时间：" + (end - start) + "ms");
    }

    public static void m2() throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\re.properties"));
        String classfullpath = properties.get("classfullpath").toString();
        Class cls = Class.forName(classfullpath);
        Method ms = cls.getMethod("hi");
        ms.setAccessible(true);///取消每次调用方法时的访问检查,提高了效率
        long start = System.currentTimeMillis();
        for (int i = 0; i < 9000000; i++) {
            ms.invoke(cls.getDeclaredConstructor().newInstance());
        }
        long end = System.currentTimeMillis();
        System.out.println("反射方式调用方法所耗时间：" + (end - start) + "ms");
    }
}
