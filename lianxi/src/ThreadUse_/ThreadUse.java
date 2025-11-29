package ThreadUse_;

/**
 * @author 张 书航
 */
public class ThreadUse {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.start();


    }
}

class Cat extends Thread {
    int times = 0;

    @Override
    public void run() {
        int i = 0;
        while (true) {
            System.out.println("喵喵~"+(++times));
            i++;
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (times == 80) break;
        }

    }
}