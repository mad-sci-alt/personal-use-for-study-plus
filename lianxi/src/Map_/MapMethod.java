package Map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author 张 书航
 */
public class MapMethod {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("01", "zsh");
        map.put("02", "张书航");
        map.put("01", "zsh th");
//        map.clear();
        System.out.println(map);
        System.out.println(map.get("01"));
        System.out.println(map.containsKey("01"));
        System.out.println(map.containsValue("zsh"));
        Set keySet = map.keySet();
        System.out.println("===用增强for遍历===");
        for (Object o : keySet) {
            System.out.println("["+o+":"+map.get(o)+"]");
        }
        System.out.println("===用迭代器遍历===");
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println("["+next+":"+map.get(next)+"]");
        }
        System.out.println("===用entrySet遍历===");
        Set set = map.entrySet();
        Iterator iterator1 = set.iterator();
        while (iterator1.hasNext()) {
            Object key = iterator1.next();
            System.out.println(key);
        }

    }
}
