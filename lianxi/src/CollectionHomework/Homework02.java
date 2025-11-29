package CollectionHomework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 张 书航
 */
public class Homework02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Car("ford", 5000) {
            @Override
            public String toString() {
                return "单独处理ford对象的输出格式...";
            }
        });
        list.add(new Car("bmw", 8000));
//        System.out.println(list);
        System.out.println("===用迭代器itit快捷键遍历===");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }
        System.out.println("===用快捷键I，增强for遍历===");
        for (Object o : list) {
            System.out.println(o);
        }


//        list.add("hello");
//        list.add("world");
//        list.add("hello");
//        System.out.println(list);
//        list.remove(2);
//        System.out.println(list);
//        list.contains("hello");//true
//        list.isEmpty();//false
//        list.size();
//        list.clear();
//        List list1 = new ArrayList();
//        list.addAll(0,list1);
    }
}

class Car {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                name + '\'' + price +
                '}';
    }
}
