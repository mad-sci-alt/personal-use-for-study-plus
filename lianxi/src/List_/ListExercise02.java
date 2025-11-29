package List_;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author 张 书航
 */
public class ListExercise02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        //其余两种集合在本程序中没有区别，都可以用，具体细分区别后续深入研究
//        List list = new LinkedList();
//        List list = new Vector();
        list.add(new Book("java入门手册", 20.35, "张三"));
        list.add(new Book("C语言入门手册", 15.44, "李四"));
        list.add(new Book("C++入门手册    ", 66.6, "王五"));
        printObj(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {/// 重写Comparator的compare按照price从小到大排序
                Book i1 = (Book) o1;
                Book i2 = (Book) o2;
                double sub = i1.getPrice() - i2.getPrice();
                if (sub > 0) {
                    return 1;
                } else return -1;
            }
        });
        for (Object obj : list) {
            System.out.println(obj);
        }


    }

    public static String printObj(List list, Comparator c) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (c.compare(list.get(j), list.get(j + 1)) > 0) {
                    Object temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        return list.toString();
    }
}

class Book {
    private String name;
    private double price;
    private String author;

    public Book(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return String.format("名称：%s\t价格：%s\t作者：%s", name, price, author);
//        return String.format("名称：%s\t价格：%.2f\t作者：%s", name, price, author);
    }
}
