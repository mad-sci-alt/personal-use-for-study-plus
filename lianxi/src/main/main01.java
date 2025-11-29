package main;


import java.util.Scanner;

public class main01 {
    public static void main(String[] args) {/// String类型的数组args是在运行时传入的参数，
                                            ///在idea中可以在编辑配置页面中设置环境变量（运行参数）
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入参数的个数：");
        int num = scanner.nextInt();
        args = new String[num];
        System.out.println("请输入"+num+"个参数：");
        for (int i = 0; i < args.length; i++) {
            args[i] = scanner.next();
        }
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}

class Test{
    final int a = 2;
    final double b;
    final double c;
    public Test() {
        b = Math.PI;
    }
    {
        c = Math.E;
    }
}
