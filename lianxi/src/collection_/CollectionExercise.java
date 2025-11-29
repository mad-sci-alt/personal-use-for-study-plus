package collection_;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author 张 书航
 */

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class CollectionExercise {
    public static void main(String[] args) {
        Collection arrayList = new ArrayList();
        arrayList.add(new Dog("张三", 10));
        arrayList.add(new Dog("李四", 5));
        arrayList.add(new Dog("王五", 12));
//        Iterator iterator = arrayList.iterator();
//        while (iterator.hasNext()) {
//            Object next = iterator.next();
//            System.out.println(next);
//        }
        for (Object o : arrayList) {
            System.out.println(o);
        }
    }
}
