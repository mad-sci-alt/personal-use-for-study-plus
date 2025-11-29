package annotation;

/**
 * @author 张 书航
 */

abstract class Animal {
    abstract void shout();
}

class Cat extends Animal {
    @Override
    void shout() {
        System.out.println("喵喵喵");
    }
}

class Dog extends Animal {
    @Override
    void shout() {
        System.out.println("汪汪汪");
    }
}
public class Homework03 {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.shout();
        Animal dog = new Dog();
        dog.shout();
    }
}
