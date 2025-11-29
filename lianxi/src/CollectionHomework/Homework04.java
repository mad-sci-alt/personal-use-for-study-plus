package CollectionHomework;

import java.util.HashSet;

/**
 * @author 张 书航
 */
public class Homework04 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("java");
        hashSet.add("php");
        hashSet.add("java");
        //处理重复元素添加在HashMap中的putVal方法中，扩容机制也在该方法中
        //HashSet去重：HashCode()+equals()，先通通过存入对象的地址，
        // 计算出一个hash值，再通过hash值高低位比特和运算出尽可能分散的索引
        //如果索引在table中为空，则直接存放
        //如果索引位置已存在对象，则通过equals()方法逐个判断该索引对应的单链表一列存放内容是否相同
        //最后的位置就确定了
        //TreeSet去重：如果你传入一个Comparator类匿名对象，
        // 并重写compare方法，就用该方法自定义去重（当返回值为0时则为同一个对象）
        //如果不传入Comparator则调用compareTo方法 默认通过字典序升序并去重
    }
}
