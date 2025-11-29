package EncapFound;

/**
 * @author 张 书航
 */

public class StringEncap {
    public static void main(String[] args) {
        
        String a = "abc";
        String b = "de";
        String c = a + b;
        String d = "abcde";
        System.out.println(d.getClass());
        System.out.println(c.getClass());
        System.out.println(d == c);
        System.out.println(c == c.intern());
    }
}
