package EncapFound;

/**
 * @author 张 书航
 */
public class Homework05 {
    public static void main(String[] args) {
        String s1 = "hspedu";
        Animal a = new Animal(s1);
        Animal b = new Animal(s1);
        System.out.println(a == b);//F
        System.out.println(a.equals(b));//F
        System.out.println(a.name == b.name);//T
        String s4 = new String("hspedu");
        String s5 = "hspedu";

        System.out.println(s1 == s4);//F
        System.out.println(s4 == s5);//F

        String t1 = "hello" + s1;
        String t2 = "hellohspedu";
        System.out.println(t1.intern() == t2);//T


    }
}

class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }
}