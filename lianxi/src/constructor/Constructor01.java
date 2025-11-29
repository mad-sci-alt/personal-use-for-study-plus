package constructor;

class Person{
    String name;
    int age;
    public Person(String toName, int toAge){/// 🌟构造方法的规则如下：
        name = toName;                     ///1.构造器名和类名一致
        age = toAge;                       ///2.构造方法没有返回值，不能有返回值(不能添加void，但也不允许返回值)
        System.out.println("构造方法执行了");///3.构造器也可以重载改变形参的个数及种类，构造其本质也是一个方法
    }
}

public class Constructor01 {
    public static void main(String[] args) {
        Person p1 = new Person("张书航",20);///4.通过构造器初始化的对象，构造方法会自动执行，且值需要在new对象时就在后面上传
    }
}
