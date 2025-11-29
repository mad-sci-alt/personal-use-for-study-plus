package Set_;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author 张 书航
 */
public class LinkedHashSetSource {
    public static void main(String[] args) {
        Set set = new LinkedHashSet();
        set.add("张三");
        set.add("李四");
        set.add("张三");
        set.add("王五");
        System.out.println(set);
        /*
        LinkedHashSet是集合的子类，继承了HashSet

         */
    }
}
