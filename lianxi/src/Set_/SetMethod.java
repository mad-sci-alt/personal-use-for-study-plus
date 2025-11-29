package Set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author 张 书航
 */
@SuppressWarnings("all")
public class SetMethod {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("张三");
        set.add("李四");
        set.add("王五");
        set.add("张三");
        set.add(null);
        set.add(null);
        System.out.println(set);
//        Object[] array = set.toArray();
        for (Object o : set) {
            System.out.println(o);
        }
        /// set存放的是无序但确定的不重复的元素
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
        /// set无法通过遍历索引获取元素
    }
}
