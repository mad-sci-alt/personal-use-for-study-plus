package ThreadUse_;

/**
 * @author 张 书航
 */
public class ThreadState_ {
    public static void main(String[] args) throws InterruptedException {
        R r = new R();
        System.out.println("子线程当前状态为" + r.getState());
        r.start();
        while (r.getState() != Thread.State.TERMINATED) {
            System.out.println("子线程当前状态为" + r.getState());
            Thread.sleep(1000);
        }
        System.out.println("子线程结束，目前状态为" + r.getState());
    }
}

class R extends Thread {
    int times = 0;

    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 10; i++) {
                System.out.println("hi " + (i + 1));
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            if (times == 2) break;
        }
    }
}
