package List_;

import java.util.LinkedList;

/**
 * @author 张 书航
 */
public class LinkedListCRUD {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("张三");
//        Iterator iterator = linkedList.iterator();
//        while (iterator.hasNext()) {
//            Object next = iterator.next();
//            System.out.println(next);
//        }
        for (Object o : linkedList) {
            System.out.println(o);
        }
        System.out.println(linkedList.indexOf("张三"));
    }
}
