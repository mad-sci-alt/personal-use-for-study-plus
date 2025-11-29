package Map_;

import java.util.HashMap;

/**
 * @author 张 书航
 */
public class HashMapSource2 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        for (int i = 1; i <= 12; i++) {
            hashMap.put(new A(i), "hello");
        }
        System.out.println(hashMap);

    }
}

class A {
    private int num;

    public A(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        return 100;
    }

    @Override
    public String toString() {
        return "\nA{" +
                "num=" + num +
                '}';
    }
}