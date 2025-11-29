package List_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 张 书航
 */
@SuppressWarnings({"all"})
public class ListExercise {
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        arrayList.add("hello");
        arrayList.add("张书航");
        arrayList.add("wic");
        arrayList.add("college");
        arrayList.add("double");
        arrayList.add("fee");
        arrayList.add("for");
        arrayList.add("you");
        arrayList.add("my");
        arrayList.add("baby");
        arrayList.add(1, "韩顺平edu");
        arrayList.get(4);
        arrayList.remove(5);
        arrayList.set(6, "to");
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
