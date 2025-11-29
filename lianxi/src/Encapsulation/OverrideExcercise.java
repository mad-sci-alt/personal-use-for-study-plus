package Encapsulation;

import java.util.Scanner;

class Person{
    private String name;
    private int age;


    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public String say(){
        return "大家好，我是"+this.name + "今年 "+this.age;
    }
}
class Student extends Person{
    private final String id;
    private final double score;

    public Student(String name,int age,String id,double score){
        super(name,age);
        this.id = id;
        this.score = score;
    }

    public String say(){
        return super.say()+"，在"+id+"学科获得了"+score+"分";
    }

}

public class OverrideExcercise {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入姓名和年龄：");
        String name = myScanner.next();
        int age = myScanner.nextInt();
        Person p1 = new Person(name , age );
        System.out.println(p1.say());
        System.out.println("请输入学科和成绩：");
        Student me = new Student(name , age ,myScanner.next(), myScanner.nextDouble());
        System.out.println(me.say());
    }
}
