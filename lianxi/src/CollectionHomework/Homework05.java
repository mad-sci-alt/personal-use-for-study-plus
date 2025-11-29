package CollectionHomework;

import java.util.TreeSet;

/**
 * @author 张 书航
 */
public class Homework05 {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(new Person());
        //这边Person没有实现Comparable接口
        //并且add方法没有传入Comparator匿名对象指定比较规则
        //这样添加就两种比较方法去重都无法走，会抛出ClassCastException
    }
}

class Person /*implements Comparable*/{
//    @Override
//    public int compareTo(Object o) {
//        return 0;
//    }
}