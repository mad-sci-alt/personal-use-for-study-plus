package reflection_;

import java.util.Scanner;

/**
 * @author 张 书航
 */
public class Class_ {
    public static void main(String[] args) throws ClassNotFoundException {
//        Dog dog = new Dog();
        Class<?> aClass = Class.forName("reflection_.Dog");
        Scanner ms = new Scanner(System.in);
        char c = ms.next().charAt(0);

    }
}
