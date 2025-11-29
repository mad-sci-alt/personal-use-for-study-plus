package LockUse;

/**
 * @author 张 书航
 */
/// 模拟经典死锁的写法，开发中要避免这种写法
public class DeadLock_ {
    public static void main(String[] args) {
        DeadLockDemo t1 = new DeadLockDemo(true);
        DeadLockDemo t2 = new DeadLockDemo(false);
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }
}

class DeadLockDemo extends Thread {
    static Object o1 = new Object();
    static Object o2 = new Object();
    boolean flag;

    public DeadLockDemo(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        /// 如下代码业务逻辑分析
        /// 1.如果flag为真，进入方法的线程就会先持有o1对象锁
        if (flag) {
            synchronized (o1) {
                System.out.println(Thread.currentThread().getName()
                        + "进入方法1");
                synchronized (o2) {
                    System.out.println(Thread.currentThread().getName()
                            + "进入2");
                }
            }
        } else {
            synchronized (o2) {
                System.out.println(Thread.currentThread().getName()
                        + "进入3");
                synchronized (o1) {
                    System.out.println(Thread.currentThread().getName()
                            + "进入4");
                }
            }
        }
    }
}
