package homework;

import java.util.Scanner;

class Teacher{
    private String name;
    private int age;
    private String post;
    private double sal;

    public Teacher(String name, int age, String post, double sal) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public void introduce(){
        System.out.println("姓名：" + name + " " + "年龄：" + age + " " + "职位：" + post + " " + "薪水：" + sal);
    }
}

class Professor extends Teacher{
    public Professor(String name, int age, String post, double sal) {
        super(name, age, post, sal);
    }

    public void setSal(double sal){
        super.setSal(sal*1.3);
        System.out.println("调用了Professor的薪资计算方法");
    }
}

class AssociateProfessor extends Teacher{
    public AssociateProfessor(String name,int age,String post,double sal){
        super(name, age, post, sal);
    }

    public void setSal(double sal){
        super.setSal(sal * 1.2);
        System.out.println("调佣AssociateProfessor的薪资计算方法");
    }
}

class Lecturer extends Teacher{
    public Lecturer(String name,int age,String post,double sal){
        super(name, age, post, sal);
    }

    public void setSal(double sal){
        super.setSal(sal * 1.1);
        System.out.println("调佣Lecturer的薪资计算方法");
    }
}

public class Homework03 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入教师信息,姓名、年龄、职位、薪水（输入基础薪资，自动按职位精确计算该教师的实际工资）：");
        String name = myScanner.next();
        int age = myScanner.nextInt();
        String pos = myScanner.next();
        double baseSal = myScanner.nextDouble();
        Teacher teacher1 = new Teacher(name,age,pos,baseSal);

        switch ( pos){
            case "教授":
                teacher1 = new Professor(name,age,pos,baseSal);
                teacher1.setSal(baseSal);
                break;
            case "副教授":
                teacher1 = new AssociateProfessor(name,age,pos,baseSal);
                teacher1.setSal(baseSal);
                break;
            case "讲师":
                teacher1 = new Lecturer(name,age,pos,baseSal);
                teacher1.setSal(baseSal);
                break;
            default:
                System.out.println("职位未知，给默认基础薪资");
                teacher1.setSal(baseSal);
        }

        if (teacher1 != null){
            teacher1.introduce();
        }

    }
}
