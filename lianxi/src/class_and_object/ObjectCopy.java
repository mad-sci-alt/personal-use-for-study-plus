package class_and_object;
import java.util.Scanner;
/// 🌟🌟🌟🌟创建两个成员变量完全相同的独立对象（每个对象内要微调须在对应方法中进行，否则无效）
class Person0{//原对象类
    String name;
    int age;
}

class MyTools{
    public Person0 personCopy(Person0 p){//拷贝复制对象方法
        Person0 p2 = new Person0();
        p2.name = p.name;
        p2.age = p.age;
        p2.name = "张三";
        return p2;
    }
}

public class ObjectCopy{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);//创建输入对象，可以调用Scanner类中的输入方法
        Person0 p = new Person0();//创建原对象p
        System.out.println("请输入原对象的姓名和年龄：");
        p.name = myScanner.next();///调用Scanner类中的next方法获取用户输入的字符串类型
        p.age = myScanner.nextInt();
        MyTools myTools = new MyTools();//创建复制工具对象
        Person0 p2 = myTools.personCopy(p);//调用复制工具对象中的方法复制对象
        System.out.println("创建原对象p的属性如下："+p.name+" "+p.age);
        System.out.println("复制过后的对象p2属性如下："+p2.name+" "+p2.age);///如何体现两个对象是否是完全独立的不同的对象？答案：输出各自的hashcode
    }
}
//class Person01{
//    String name;
//    int age;
//}
//
//class PersonCopy{
//    public Person copyTools(Person p){
//        Person p2 = new Person();
//        p2.name = p.name;
//        p2.age = p.age;
//        return p2;
//    }
//}
//
//public class ObjectCopy {
//    public static void main(String[] args) {
//        Scanner myScanner = new Scanner(System.in);
//        Person p = new Person();
//        p.name = myScanner.next();
//        p.age = myScanner.nextInt();
//        PersonCopy myTools= new PersonCopy();
//        Person p2 = myTools.copyTools(p);
//    }
//}
///=======================================================================================================
///=======================================================================================================
//class Person01{
//    String name;
//    int age;
//}
//class MyTools{
//    public Person01 personCopy(Person01 p){
//        Person01 p2 = new Person01();
//        p2.name = p.name;
//        p2.age = p.age;
//        return p2;
//    }
//}
//
//public class ObjectCopy{
//    public static void main(String[] args) {
//        Person01 p = new Person01();
//        Scanner myScanner = new Scanner(System.in);
//        p.name = myScanner.next();
//        p.age = myScanner.nextInt();
//        MyTools myTools = new MyTools();
//        Person01 p2 = myTools.personCopy(p);
//    }
//}
