package List_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 张 书航
 */
@SuppressWarnings({"unchecked", "all"})
public class ListMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        System.out.println(list);
        System.out.println(list.get(0));
//        list.removeAll(list);
        System.out.println(list.isEmpty());
        list.add(2, "张三");//从索引2开始将实参全部添加
        list.set(0, "张三疯");///将索引为0的元素替换为指定值
        System.out.println(list.subList(1, 3));//截取该范围索引前闭后开的元素
        System.out.println("===用迭代器指针按顺序输出list内对象运行类型的toString方法===");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);

        }
        System.out.println("===用增强for输出===");///本质上还是调用迭代器
        for (Object o : list) {
            System.out.println(o);
        }

    }
}
