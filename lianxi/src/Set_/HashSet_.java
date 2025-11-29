package Set_;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 张 书航
 */


public class HashSet_ {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(new Dog("tom"));
        set.add(new Dog("tom"));
        set.add(new String("张三"));
        set.add(new String("张三"));
        set.add(new String("张"));
        System.out.println(set);
        /// 总结就是set能否添加进去，
        ///还要看添加的元素地址是否相同，相同地址肯定就是重复的
        /// String类实例元素存放在常量池，
        ///不同对象如果指向的是常量同一个地址，肯定不能重复添加
    }
}

class Dog{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}