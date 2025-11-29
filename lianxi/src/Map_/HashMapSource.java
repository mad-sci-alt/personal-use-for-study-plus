package Map_;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 张 书航
 */
public class HashMapSource {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("java", 10);
        map.put("java", 20);//hash：3254803
        map.put("c++", 20);
        map.put("python", 30);

        System.out.println(map);
    }
}
