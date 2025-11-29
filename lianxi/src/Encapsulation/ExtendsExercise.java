package Encapsulation;

import java.util.Scanner;

class Computer{
    private String cpu;///封装，无法被除了本类以外所有地方调用，隐藏了实现细节
    private String memory;
    private String hardDisk;
    private final Scanner myScanner = new Scanner(System.in);

    public void getCpu(){/// 调用被封装了的属性，访问修饰public可以被所有地方调用
        System.out.println("请输入CPU的型号:");
        cpu = myScanner.next();
    }
    public void getMemory() {
        System.out.println("请输入内存的型号:");
        memory = myScanner.next();
    }

    public void getHardDisk() {
        System.out.println("请输入硬盘的型号:");
        hardDisk = myScanner.next();
    }


    public String getDetails() {
        return "改电脑的配置如下：CPU"+cpu+"，内存"+memory+"，硬盘"+hardDisk;
    }
}
class Pc extends Computer{
    public String brand;

}
class NotePad extends Computer{
    public double color;
}

public class ExtendsExercise {
    public static void main(String[] args) {
        Pc pc = new Pc();
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入电脑的牌子：");
        pc.brand =myScanner.next();
        pc.getCpu();
        pc.getMemory();
        pc.getHardDisk();
        System.out.println("电脑的详细信息为："+pc.getDetails());
        NotePad myPad = new NotePad();
        myPad.getCpu();
        myPad.getMemory();
        myPad.getHardDisk();
        myPad.getDetails();


    }

}
