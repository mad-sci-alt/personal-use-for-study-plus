package generic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author 张 书航
 */
public class GenericDetails {
    public static void main(String[] args) {
        ArrayList<A> list = new ArrayList<>();
        list.add(new A());//这里传入一个A类对象没问题
        list.add(new B());//传入一个A类对象的子类也没问题，因为可以自动向上转型
        //但是如果继承关系反过来，一个子类泛型的容器无法接收父类对象
        // （这里指的类型都是指运行时类型，new过后就确认了无法改变），
        // 无论是向上/向下转型改变的都是编译类型
        Pig<String> stringPig = new Pig<>("这是一个String类型的e");//尖括号内指定的就是Pig类中的泛型属性e的类型
        Pig<Integer> aPig = new Pig(1);///会自动填充运行类型的泛型，因此运行类型的泛型可以省略不写，包括尖括号吗？
        HashSet<Pig> set = new HashSet<>();///编译类型引用写上的泛型类，
        /// 这是编译器编译器的工作
        ArrayList arrayList = new ArrayList();///如果我们这样创建一个集合，那其实他默认的泛型就是Object
        /// 即   ArrayList<Object> arrayList = new ArrayList();
        set.add(stringPig);
        set.add(aPig);
        Iterator<Pig> iterator = set.iterator();
        while (iterator.hasNext()) {
            Pig pig = iterator.next();
            System.out.println(pig);
        }
    }
}



class Pig<T> {
    T e;

    public Pig(T e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "e=" + e +
                '}';
    }
}