package ThreadUse_;

/**
 * @author 张 书航
 */
public class ThreadMethod extends Thread {
    public static void main(String[] args) throws InterruptedException {
        E e = new E();
        e.setPriority(Thread.MAX_PRIORITY);
        System.out.println(e.getPriority());
//        e.interrupt();//如果当前线程处于阻塞状态（sleep/wait），就会中断该线程的阻塞状态
//        e.yield();//将当前处理本线程cpu核心让给别人（操作系统底层资源分配不紧张时不会成功）
//        e.join();//将线程立刻插队执行
        //总结为yield被动插队，join主动插队
        e.start();
        for (int i = 0; i < 20; i++) {
            if (i == 5) e.join();
            System.out.println("main线程hi" + (i + 1));
            Thread.sleep(1000);
        }
    }
}

class E extends Thread {
    int times = 0;

    @Override
    public void run() {
        currentThread().setName("子线程");
        while (true) {
            if (times >= 20) break;
            System.out.println(currentThread().getName()
                    + "hello" + (++times));
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}