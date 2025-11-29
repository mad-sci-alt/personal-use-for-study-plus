package ThreadUse_;

/**
 * @author 张 书航
 */
public class SellTicket implements Runnable {
    private static int ticket = 99;

    public static int getTicket() {
        return ticket;
    }

    public static void setTicket(int ticket) {
        SellTicket.ticket = ticket;
    }

    private static boolean flag = true;

    public static boolean isFlag() {
        return flag;
    }

    public static void setFlag(boolean flag) {
        SellTicket.flag = flag;
    }

    public static void subTicket() {
        setTicket(getTicket() - 1);
        System.out.println(Thread.currentThread().getName() +
                "售出一张票,当前剩余票数为" + getTicket());
    }

    /// 当前所学的多线程共同处理一个问题会存在超卖问题，
    /// 即在1这个零界点时三个线程都最后一次判断成功卖出一张票
    /// 此时库存票就会变成负数
    public static void main(String[] args) {
        new Thread(new SellTicket()).start();
        new Thread(new SellTicket02()).start();
        new Thread(new SellTicket03()).start();
        int times = 0;
        while (true) {
            System.out.println("main主线程正在同步进行中" + (++times));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (times == 100) break;
        }
        System.out.println("main线程结束");
    }

    /// 我们只需要保证多个线程在操作同一个资源，
    /// 在处理这个资源时是在一个同步状态
    /// 即可保证不会出现超卖等类似问题
    public synchronized static void sell() {
        if (ticket == 0) {
            setFlag(false);
            System.out.println("票卖完了，所有窗口停止卖票");
            return;
        }
        System.out.println("窗口" + Thread.currentThread().getName()
                + "卖了一张票，目前剩余票数" + (--ticket));
    }

    @Override
    public void run() {
        while (SellTicket.isFlag()) {
//            if (SellTicket.getTicket() > 1) {
//                SellTicket.subTicket();
            sell();

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class SellTicket02 implements Runnable {
    @Override
    public void run() {
        while (SellTicket.isFlag()) {
//            if (SellTicket.getTicket() > 1) {
//                SellTicket.subTicket();
            SellTicket.sell();

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class SellTicket03 implements Runnable {
    @Override
    public void run() {
        while (SellTicket.isFlag()) {
//            if (SellTicket.getTicket() > 1) {
//                SellTicket.subTicket();
            SellTicket.sell();

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}