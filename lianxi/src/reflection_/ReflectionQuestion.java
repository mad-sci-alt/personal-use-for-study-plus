package reflection_;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author 张 书航
 */
@SuppressWarnings("all")
public class ReflectionQuestion {

    public static void main(String[] args)
            throws IOException, ClassNotFoundException, NoSuchMethodException,
            InvocationTargetException, InstantiationException, IllegalAccessException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\re.properties"));
        String classfullpath = properties.get("classfullpath").toString();
        String method = properties.get("method").toString();
//        new classfullpath().method();//这样创建是不行的，于是引出反射机制和Class类

        Class cls = Class.forName(classfullpath);
//        Object o = cls.newInstance();//已过时，被class.getDeclaredConstructor().newInstance()替代
        Object o = cls.getDeclaredConstructor().newInstance();
        Method methodName = cls.getMethod(method);
        System.out.println(o.getClass());
        methodName.invoke(o);///调用指定类对象的方法
    }
}

