package ThreadUse_;

/**
 * @author 张 书航
 */
public class ThreadMethodExercise {
    public static void main(String[] args) throws InterruptedException{
        Thread thread = new Thread(new SonThread());
        thread.setName("子线程1");
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "线程 hi " + (i + 1));
            Thread.sleep(1000);
            if (i == 4){
                thread.start();
                thread.join();
            }
        }
        System.out.println("main线程结束");
    }
}

class SonThread implements Runnable {
    int times = 0;


    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() +
                    " hello" + (++times));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (times == 10) {
                System.out.println("子线程结束");
                break;
            }
        }
    }
}