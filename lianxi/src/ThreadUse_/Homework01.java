package ThreadUse_;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author 张 书航
 */
public class Homework01 {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2(thread1);
        thread1.setName("线程1");
        thread2.setName("线程2");
        thread1.start();
        thread2.start();
    }
}

class Thread1 extends Thread {
    private static boolean flag = true;

    public static boolean isFlag() {
        return flag;
    }

    public static void setFlag(boolean flag) {
        Thread1.flag = flag;
    }

    @Override
    public void run() {
        while (flag) {
            System.out.println("随机数为" + (int) (Math.random() * 100 + 1));
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("线程1结束");
    }

}

class Thread2 extends Thread {
    private Thread1 threadControl;
    private static Scanner myScanner = new Scanner(System.in);

    public Thread2(Thread1 threadControl) {
        this.threadControl = threadControl;
    }

    @Override
    public void run() {
        while (true) {
            char c = myScanner.next().toUpperCase(Locale.ROOT).charAt(0);
            if (c == 'Q') {//对应ASCII码为81
                threadControl.setFlag(false);
                System.out.println("线程2终止了线程1");
                System.out.println("线程2结束");
                break;
            }
        }

    }

//    @Override
//    public void keyTyped(KeyEvent e) {
//
//    }
//
//    @Override
//    public void keyPressed(KeyEvent e) {
//        if (e.getKeyChar() == 81) {
//            System.out.println("线程2检测到Q被按下，即将终止线程1");
//            Thread1.setFlag(false);
//            Thread2.setInput(e.getKeyChar());
//        }
//    }
//
//    @Override
//    public void keyReleased(KeyEvent e) {
//
//    }
}

