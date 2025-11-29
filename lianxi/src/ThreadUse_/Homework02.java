package ThreadUse_;

/**
 * @author 张 书航
 */
public class Homework02 {
    private static int count = 10000;
    static boolean flag = true;

    public static int getCount() {
        return count;
    }

    public static void subCount(int num) {
        Homework02.count -= num;
    }

    public static void syn() {
        synchronized (Homework02.class) {
            if (Homework02.getCount() >= 1000) {
                Homework02.subCount(1000);
                System.out.println(Thread.currentThread().getName() +
                        "取款成功，当前余额为" + Homework02.getCount());
            } else {
                System.out.println("余额不足");
                flag = false;
            }

        }
    }

    public static void main(String[] args) {
        User user = new User();
        Thread thread1 = new Thread(user);
        Thread thread2 = new Thread(user);
        thread1.start();
        thread2.start();
    }


}

class User implements Runnable {
    @Override
    public void run() {
        while (Homework02.flag) {
            Homework02.syn();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


//class User2 implements Runnable {
//    @Override
//    public void run() {
//        while (Homework02.flag) {
//            Homework02.syn();
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}