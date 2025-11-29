package EncapFound;

import java.util.Scanner;

/**
 * @author 张 书航
 */
public class Homework03 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("请输入英文人名：");
        String in = sc.nextLine();
        printName(in);
    }

    static void printName(String str) {
        if (str == null) {
            return;
        }
        String[] names = str.split(" ");
        if (names.length != 3) {
            return;
        }
        System.out.println(String.format("%s,%s .%c", names[2], names[0], names[1].toUpperCase().charAt(0)));
    }
}
