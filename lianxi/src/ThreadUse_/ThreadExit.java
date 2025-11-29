package ThreadUse_;

/**
 * @author 张 书航
 */
public class ThreadExit {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.setName("线程1");
        t.start();
        System.out.println("main线程休眠10s");
        Thread.sleep(10000);
        t.setLoop(false);
    }
}

class T extends Thread {
    private boolean isLoop = true;
    @Override
    public void run() {
        int count = 0;
        while (isLoop) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(currentThread().getName()+"正在运行" + (++count));
        }
    }

    public void setLoop(boolean loop) {
        isLoop = loop;
    }
}
