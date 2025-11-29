package EncapFound;

import java.util.Scanner;

/**
 * @author 张 书航
 */


class Goods {
    private String name;
    private double price;

    public Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

public class StringBufferExercise {
    public static void main(String[] args) {
        System.out.println("请输入超级PC价格");
        Scanner scanner = new Scanner(System.in);
        double input = scanner.nextDouble();
        Goods thyh = new Goods("超级PC", input);
        String intPart = (int) input + "";
        String price = thyh.getPrice() + "";
        StringBuffer stringBuffer = new StringBuffer(price);
        int index = stringBuffer.indexOf(".");
        if (intPart.length() != 3) {
            for (int i = index; i > 3; ) {
                stringBuffer.insert(index,  ",");
                index -= 3;
            }
        }
        System.out.println(stringBuffer);
    }
}
