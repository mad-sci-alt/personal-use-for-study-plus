package Encapsulation;

import java.util.Scanner;

class Employee{
    public String name;
    private int age;
    private double sal;
    private String job;


    Scanner myScanner = new Scanner(System.in);
    public void setAge(){
        System.out.println("请输入年龄:");
        age = myScanner.nextInt();
        if (age <= 120 && age >= 1) System.out.println("年龄合法");
        else{
            System.out.println("年龄不合法");
            this.age = 18;
        }
    }
    public void setName(){
        System.out.println("请输入姓名:");
        name = myScanner.next();
        if (name.length() >= 2 && name.length() <=6){
            System.out.println("名字合法");
        }else {
            System.out.println("名字不合法");
            this.name = "匿名";
        }
    }
    public void setSal(){
        System.out.println("请输入工资:");
        sal = myScanner.nextDouble();
        System.out.println(name+"的工资为："+sal);
    }
    public void setJob(){
        System.out.println("请输入"+name+"的职位:");
        job = myScanner.next();
    }
    public int getAge(){
        System.out.println(name+"的年龄为:"+age);
        return age;
    }
    public double getSal(){
        System.out.println(name+"的工资为:"+sal);
        return sal;
    }
    public String getJob(){
        System.out.println(name+"的职位为:"+job);
        return job;
    }
}

public class Encapsulation01 {
    public static void main(String[] args) {
        Employee person1 = new Employee();
        person1.setName();
        person1.setAge();
        person1.setSal();
        person1.setJob();
        person1.getAge();
        person1.getSal();
        person1.getJob();
    }
}
