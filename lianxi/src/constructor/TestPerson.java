package constructor;
class Person01{
    String name;
    int age;
    Person01(String name,int age){
        this.name = name;
        this.age = age;
    }
    public boolean CompareTo(Person01 x){
        return this.name.equals(x.name) && this.age == x.age;
    }
}

public class TestPerson {
    public static void main(String[] args) {
        Person01 p1 = new Person01("张书航", 20);
        Person01 p2 = new Person01("张书航", 20);
        System.out.println("两个对象比较的结果为："+p1.CompareTo(p2));
    }
}
