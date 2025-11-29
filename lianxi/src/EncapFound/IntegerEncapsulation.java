package EncapFound;

import java.util.Scanner;

/**
 * @author 张 书航
 */
@SuppressWarnings("all")
public class IntegerEncapsulation {
    public static void main(String[] args) {
        int i = new Scanner(System.in).nextInt();
        ///被自动装箱的类型为int的变量i如果不在-128~127之间，
        ///那么i1将自动创建一个Integer对象并返回，
        /// 如果i在-128~127之间，则返回的还是该基本数据类型int，
        Integer i1 = i;///将基本数据类型转为对应的包装类型,
        ///底层上还是将基本数据类型传参valueOf方法内创建了对象,
        ///八大基本数据类型可以使用valueOf()方法,
        ///这种直接将基本数据类型转为包装类型的行为被我们称作封箱
        int i2 = i1  ;///拆箱，调用Integer的intValue()方法
        System.out.println(i2 == i1);///只要==两边有一个为基本数据类型就是判断值是否相等
    }
}