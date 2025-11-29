package arrays_;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author 张 书航
 */
class Book {
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
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

    @Override
    public String toString() {
        return getName() + ":" + getPrice() + "元";
    }
}

public class ArraysExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入图书数量");
        Book[] books = new Book[scanner.nextInt()];
        for (int i = 0; i < books.length; i++) {
            System.out.println("请输入第" + (i + 1) + "本书的名称和价格");
            books[i] = new Book(scanner.next(), scanner.nextDouble());
        }
        System.out.println("排序前的顺序为" + Arrays.toString(books));
        definedSort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book i1 = (Book) o1;
                Book i2 = (Book) o2;
                double sub = i1.getPrice() - i2.getPrice();///这道中间转换是必要的，因为父类的compare方法的返回类型为int，因此子类不能改变返回类型
                if (sub > 0) return 1;
                return -1;
//                return Double.compare(i2.getPrice(), i1.getPrice());
            }

//            @Override
//            public int compare(Book o1, Book o2) {
//                return o1.getName().length() - o2.getName().length();
//            }
        });
    }

    public static void definedSort(Book[] books, Comparator c) {
        for (int i = 0; i < books.length - 1; i++) {
            for (int j = 0; j < books.length - 1; j++) {
                if (c.compare(books[j], books[j + 1]) > 0) {
                    Book temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }

        }
        System.out.println("排序后的顺序为" + Arrays.toString(books));
    }
}
