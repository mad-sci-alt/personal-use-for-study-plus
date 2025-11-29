package reflection_;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 张 书航
 */
public class Homework02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //一般的文件创建方法
        //File file = new File("d:\\aa.txt");
        //file.createNewFile();
        Class<?> cls = Class.forName("java.io.File");
        Constructor<?>[] dC = cls.getDeclaredConstructors();
        for (Constructor c : dC) {
            System.out.println(c);
//            Object o = c.newInstance();
        }
        Constructor<?> dcString = cls.getDeclaredConstructor(String.class);//获取File类指定参数为一个String形参的构造器
        String filePath = "d:\\myNewTxt.txt";
        Object file = dcString.newInstance(filePath);
        Method createNewFile = cls.getMethod("createNewFile");
        Object invoke = createNewFile.invoke(file);
        System.out.println("是否创建成功：" + invoke);
    }
}
