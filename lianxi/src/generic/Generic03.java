package generic;

/**
 * @author 张 书航
 */
public class Generic03 {
    public static void main(String[] args) {
        String s = "hello";
        int a = 1;
        Person<String> person1 = new Person<String>(s);
        Person<String> person2 = new Person<String>(a+"");
    }
}

class Person<E> {
    private E info;
    public Person(E info) {
        this.info = info;
    }
}