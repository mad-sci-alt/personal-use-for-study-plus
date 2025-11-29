package homework;

import java.util.Scanner;

class Person{
    private String name;
    private int age;
    private String job;
    Scanner myScanner = new Scanner(System.in);
    Person[] arr = new Person[3];

    public Person() {
    }


    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public void setValue(Person[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Person(myScanner.next(), myScanner.nextInt(), myScanner.next());
        }
    }

    public void sortByAge(Person[] arr){
        for (int k = arr.length; k > 0; --k) {
            for (int j = 0; j < k - 1; ++j) {
                if (arr[j].getAge() > arr[j + 1].getAge()){
                    Person temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public void show(Person[] arr){
        System.out.println("姓名"+"\t\t"+"年龄"+"\t\t"+"职位");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getName() + '\t' + arr[i].getAge() + "\t\t" + arr[i].getJob());
        }

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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}

public class Homework01 {
    public static void main(String[] args) {

        System.out.println("请输入3个员工的信息（姓名、年龄、工作）：");
        Person person = new Person();
        person.setValue(person.arr);
        person.sortByAge(person.arr);
        System.out.println("员工信息排序后：");
        person.show(person.arr);
    }
}

/**
 * 自己重温四种访问修饰符的作用
 * 1.public：公共修饰符，被修饰的成员属性和成员方法可以被所有地方调用
 * 2.protected：受保护修饰符，限制了不同包的类访问请求，其余都可以访问
 * 3.默认（default）：默认修饰符，在protected的基础上，进一步的限制了父子类的访问请求，其余都可以访问
 * 4.private：私有修饰符，有且只能被同类范围的方法调用，访问权限最严格，因此一般和同类的非私有方法一起用，否则就是无效的属性或者方法
 * over
 */
