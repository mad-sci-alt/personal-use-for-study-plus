package reflection_;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 张 书航
 */
public class Homework01 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<PrivateTest> pTC = PrivateTest.class;
        Field name = pTC.getDeclaredField("name");
        PrivateTest pT = pTC.getDeclaredConstructor().newInstance();
        name.setAccessible(true);
        name.set(pT, "张书航");
        Method toString = pTC.getMethod("toString");
        Object invoke = toString.invoke(pT);
        System.out.println(invoke);
    }
}

@SuppressWarnings("all")
class PrivateTest {
    private String name = "hellokitty";


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\nPrivateTest{" +
                "name='" + name + '\'' +
                '}';
    }
}
