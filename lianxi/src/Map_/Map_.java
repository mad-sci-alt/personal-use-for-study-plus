package Map_;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 张 书航
 */

/// map集合可以粗略的理解为每个一维数组有两个元素（一个键值对）的二维数组
public class Map_ {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("01", "zsh");
        map.put("02", "张书航");
        map.put("01", "张书航");
        /// Key不能重复，重复后会发生键值对整体覆盖，key就是HashSet结构
        /// Map和函数的性质一样，一个key对应一个value，但一个value可以对应多个key
        map.get("01"); //get方法通过key来查找
        System.out.println(map);
    }
}
