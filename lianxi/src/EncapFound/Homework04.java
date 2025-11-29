package EncapFound;

import java.util.Scanner;

/**
 * @author 张 书航
 */
public class Homework04 {
    static Scanner sc = new Scanner(System.in);

    public static void countStr(String str) {
        char[] chars = str.toCharArray();
        int strLen = str.length();
        int numCount = 0;
        int upperCount = 0;
        int lowerCount = 0;
        for (int i = 0; i < strLen; i++) {
            if (Character.isDigit(chars[i]))numCount++;
            if (Character.isUpperCase(chars[i]))upperCount++;
            if (Character.isLowerCase(chars[i]))lowerCount++;
        }
//        for (int i = 0; i < strLen; i++) {
//            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') numCount++;
//            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') upperCount++;
//            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') lowerCount++;
//        }
        System.out.println("该字符串共有" + numCount + "个数字" +'\n'+

                 upperCount + "个大写字母" + "\n" + lowerCount + "个小写字母");
    }

    public static void main(String[] args) {
        System.out.println("请输入要判断的字符串");
        String in = sc.nextLine();
        countStr(in);
    }
}