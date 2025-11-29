package Set_;

import java.util.HashSet;

/**
 * @author 张 书航
 */
public class HashSetSource {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("java");
        hashSet.add("php");
        hashSet.add("c++");
        hashSet.add("java");
        System.out.println(hashSet);
    }
}
