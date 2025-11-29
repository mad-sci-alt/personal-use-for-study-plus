package collection_;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author 张 书航
 */
public class Collection_ {
    public static void main(String[] args) {
        Collection arrayList = new ArrayList();
        arrayList.add("张三");
        arrayList.add("李四");
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add("王五");
        arrayList.addAll(arrayList1);
        arrayList.isEmpty();
        arrayList.remove("张三");
        arrayList.contains("张三");
        arrayList.containsAll(arrayList1);
        arrayList.size();
//        arrayList.addAll(arrayList);
//        Iterator iterator = arrayList.iterator();
//        while (iterator.hasNext()) {
//            Object next = iterator.next();
//            System.out.println(next);
//        }
        for (Object o : arrayList) {/// 增强for底层也是调用了迭代器iterator
            System.out.println(o);
        }
    }
}
