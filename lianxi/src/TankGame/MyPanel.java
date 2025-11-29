package TankGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * @author 张 书航
 */
public class MyPanel extends JPanel implements KeyListener, Runnable {
    static King me;
    static int x = 460;
    static int y = 550;
    static int direct = 0;
    Bullet b;
    EnemyTank eT1 = new EnemyTank(x, y);
    EnemyTank eT2 = new EnemyTank(x * 2, y);
    EnemyTank eT3 = new EnemyTank(x * 3, y);
    Vector<EnemyTank> eTankList = new Vector<>();

    private MyPanel() {
        me = new King(x, y);

        eTankList.add(eT1);
        eTankList.add(eT2);
        eTankList.add(eT3);
    }

    public static MyPanel getInstance(MyPanel mp) {
        if (mp == null) {
            mp = new MyPanel();
        }
        return mp;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);
        //画出自己的坦克
        drawTank(x, y, g, direct, 0);
        drawEnemyTank(150, 100, g, 1, 1, eTankList);
//        drawTank(me.getX(), me.getY(), g, 1, 0);
        if (b != null && b.isLive()) {
            g.fill3DRect(x, y, 10, 10, false);
        }
        drawBullet();

    }

    //画出坦克，封装方法

    /**
     * @param x      坦克的左上角x坐标
     * @param y      坦克的左上角y坐标
     * @param g      画笔
     * @param direct 记录当前坦克前进的朝向
     * @param type   记录坦克类型，自己/敌方
     */
    public void drawTank(int x, int y, Graphics g, int direct, int type) {
        switch (type) {
            case 0://自己的坦克
                g.setColor(Color.cyan);
                break;
            case 1://敌方
                g.setColor(Color.yellow);
                break;
        }
        switch (direct) {
            case 0://向上
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 30, x + 20, y);
                break;
            case 1://向下
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 30, x + 20, y + 60);
                break;
            case 2://向左
                g.fill3DRect(x, y + 10, 60, 10, false);
                g.fill3DRect(x, y + 40, 60, 10, false);
                g.fill3DRect(x + 10, y + 20, 40, 20, false);
                g.fillOval(x + 20, y + 20, 20, 20);
                g.drawLine(x + 20, y + 30, x, y + 30);
                break;
            case 3://向右
                g.fill3DRect(x, y + 10, 60, 10, false);
                g.fill3DRect(x, y + 40, 60, 10, false);
                g.fill3DRect(x + 10, y + 20, 40, 20, false);
                g.fillOval(x + 20, y + 20, 20, 20);
                g.drawLine(x + 30, y + 30, x + 60, y + 30);
                break;
            default:
                System.out.println("没有此按键");
        }
    }

    public void drawBullet() {
        repaint();
    }

    public void drawEnemyTank(int x, int y, Graphics g, int direct, int type, Vector<EnemyTank> eTankList) {
        int times = 1;
        for (EnemyTank eT : eTankList) {
            switch (type) {
                case 0://自己的坦克
                    g.setColor(Color.cyan);
                    break;
                case 1://敌方
                    g.setColor(Color.yellow);
                    break;
            }
            initPos(times * 150 + 170, 100, g, eT.getDirect());
            times++;
        }

    }

    public void initPos(int x, int y, Graphics g, int direct) {
        switch (direct) {
            case 0://向上
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 30, x + 20, y);
                break;
            case 1://向下
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 30, x + 20, y + 60);
                break;
            case 2://向左
                g.fill3DRect(x, y + 10, 60, 10, false);
                g.fill3DRect(x, y + 40, 60, 10, false);
                g.fill3DRect(x + 10, y + 20, 40, 20, false);
                g.fillOval(x + 20, y + 20, 20, 20);
                g.drawLine(x + 20, y + 30, x, y + 30);
                break;
            case 3://向右
                g.fill3DRect(x, y + 10, 60, 10, false);
                g.fill3DRect(x, y + 40, 60, 10, false);
                g.fill3DRect(x + 10, y + 20, 40, 20, false);
                g.fillOval(x + 20, y + 20, 20, 20);
                g.drawLine(x + 30, y + 30, x + 60, y + 30);
                break;
            default:
                System.out.println("没有此按键");
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        input(e.getKeyCode());
    }

    public void input(int press) {
        switch (press) {
            case KeyEvent.VK_DOWN:
                System.out.println("按下了下键");
                y += 5;
                direct = 1;
                this.repaint();
                break;
            case KeyEvent.VK_UP:
                System.out.println("按下了上键");
                y -= 5;
                direct = 0;
                this.repaint();
                break;
            case KeyEvent.VK_LEFT:
                System.out.println("按下了左键");
                x -= 5;
                direct = 2;
                this.repaint();
                break;
            case KeyEvent.VK_RIGHT:
                System.out.println("按下了右键");
                x += 5;
                direct = 3;
                this.repaint();
                break;
            case KeyEvent.VK_J:
                System.out.println("按下了J键，发射子弹");
                initBullet();
            default:
                System.out.println("没有此按键");
        }
    }

    public void initBullet() {
        switch (direct) {
            case 0://向上
                b = new Bullet(x + 20, y, direct);
                b.start();
                break;
            case 1://向下
                b = new Bullet(x + 20, y + 60, direct);
                b.start();
                break;
            case 2://向左
                b = new Bullet(x, y + 20, direct);
                b.start();
                break;
            case 3://向右
                b = new Bullet(x + 60, y + 20, direct);
                b.start();
                break;
            default:
                System.out.println("没有此按键");
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.repaint();
    }
}

class Bullet extends Thread {
    int x;
    int y;
    private int direct;
    int speed = 2;
    boolean isLive = true;

    public Bullet(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            switch (direct) {
                case 0://向上
                    y -= speed;
                    break;
                case 1://向下
                    y += speed;
                    break;
                case 2://向左
                    x -= speed;
                    break;
                case 3://向右
                    x += speed;
                    break;
            }
            System.out.println("当前子弹坐标：" + x + " " + y);
            if (!(x >= 0 && x <= 1000 && y >= 0 && y <= 750)) {
                isLive = false;
                break;
            }
        }
        System.out.println("子弹被销毁");
    }

    public boolean isLive() {
        return isLive;
    }
}