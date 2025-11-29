package annotation;

/**
 * @author 张 书航
 */

interface Cal {
    void work();
}

class Cellphone {
    private static Cellphone cellphone;

    private Cellphone() {
    }

    static void testWork() {
        if (cellphone == null) {
            cellphone = new Cellphone();
        }
        /// 匿名内部类作为参数传给了本类的work方法,
        ///先运行匿名内部类中的方法，再将匿名对象作为参数传给指定方法
        /// 但是现在Java的新特性可以更简洁的写为
        ///  cellphone.work(() -> System.out.println("开始工作"), 1, 2);
        cellphone.work(new Cal() {

            @Override
            public void work() {
                System.out.println("开始工作");
            }

        }, 1, 2);
    }

    void work(Cal cal, int n1, int n2) {
        cal.work();
        System.out.println(n1 + n2);
    }
}

public class Homework04 {
    public static void main(String[] args) {
        Cellphone.testWork();
    }
}

