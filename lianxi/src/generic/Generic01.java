package generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 张 书航
 */
@SuppressWarnings("all")
public class Generic01 {
    public static void main(String[] args) {
        Dog wc = new Dog("旺财", 10);
        Dog xh = new Dog("小花", 5);
        Dog xb = new Dog("小白", 5);
        List list = new ArrayList();

        list.add(wc);
        list.add(xh);
        list.add(xb);
        for (Object o :list) {
            System.out.println(((Dog)o).getName());
        }
        /// 像这里如果不用泛型再往ArrayList中存对象时会发生向上转型，
        /// 因为数组中只能存放Object类型，每次取出的对象都是Object类型，
        /// 就没办法直接调用对象原本类型(Dog)中的方法，只能强转再调用
        /// 而且很多时候我们在从Object数组中可以存放各种各样不止一种的对象类型
        /// 因此在取出对象时已经很难去搞清楚要转成什么类型才能调用其中的方法了
        /// 如果直接进行强制类型转换的话就很有可能发生ClassCastException异常
        /// 因此泛型就是在存入对象时就把该对象原本的类型记录保存下来，
        /// 在取出时底层会自动进行正确定向的强制类型转换
        /// 再放入非指定泛型类型对象是就会添加失败，不会添加进ArrayList中
        /// 使用泛型约束ArrayList中的能存放的对象类型，这样在存入对象时就会进行类型检查
        ArrayList<Dog> list1 = new ArrayList<>();
        list1.add(wc);
        list1.add(xh);
        list1.add(xb);
//      list1.add(new Object());list1无法添加除了泛型制定类型以外的对象类型
        for (Dog dog : list1) {/// 你看在循环中取出的Dog对象时可以直接指定对象为Dog，已经是Dog类型了，
            System.out.println(dog.getName()+":"+dog.getAge());
        }
    }
}

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
}