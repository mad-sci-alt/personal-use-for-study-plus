package ThreadUse_;

/**
 * @author 张 书航
 */
public class DaemonThread {
    public static void main(String[] args) throws InterruptedException{
        MyDaemonThread myDaemonThread = new MyDaemonThread();
        // 如果我们希望在主线程结束后，子线程自动结束，我们可以将子线程设置为守护线程
        //注意：设置一个守护线程，需要在启动该线程之前，否则会抛异常
        myDaemonThread.setDaemon(true);
        myDaemonThread.start();

        for (int i = 1; i <= 10; i++) {
            System.out.println("main线程" + i);
            Thread.sleep(1000);
        }
        System.out.println("main线程结束");
    }
}

class MyDaemonThread extends Thread {
    @Override
    public void run() {
        for (;;){
            System.out.println("守护线程运行中");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}