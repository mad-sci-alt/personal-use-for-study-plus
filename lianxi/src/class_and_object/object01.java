package class_and_object;

import java.util.Scanner;

class Person{
    String name;
    int age;
    double sal;
    public void speak(){
        System.out.println("我是一只好人");
    }
}

public class object01 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Person p1 = new Person();
        System.out.println("请输入p1的姓名和年龄");
        p1.name = myScanner.next();
        p1.age = myScanner.nextInt();
        Person p2 = p1;
        System.out.println("p2的年龄为");
        System.out.println(p2.age+" "+p2.sal);
    }
}

class MemberMethod{
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.speak();//调用Person类中的成员方法
    }
}