package ThreadUse_;

/**
 * @author 张 书航
 */
public class Thread03 {
    public static void main(String[] args) {
        new Thread(new Thread01()).start();
        new Thread(new Thread02()).start();
        int times = 0;
        while (true) {
            System.out.println("main" + times++);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (times == 25) break;
        }
    }
}

class Thread01 implements Runnable {
    int times = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println("Hello,world!" + (++times));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (times == 20) break;
        }
    }
}

class Thread02 implements Runnable {
    int times = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println("Hi!" + (++times));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (times == 60) break;
        }
    }
}