package class_and_object;
import java.util.Scanner;

class k{

    public int fibonacci(int n) {
        if (n >= 1) {
            if (n == 1 || n == 2) {
                return 1;
            } else return fibonacci(n - 1) + fibonacci(n - 2);
        } else {
            System.out.println("输入的数字必须大于0");
        }
        return fibonacci(n);
    }
}

class Fibonacci{
    public static void main(String[] args) {
        k back = new k();
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入要判断斐波那契数的第几个数的大小：");
        int n = myScanner.nextInt();
        int res = back.fibonacci(n);
        System.out.println("第"+n+"个斐波那契数是："+res);
    }
}