package TankGame;

import javax.swing.*;

/**
 * @author 张 书航
 */
public class zshTankGame01 extends JFrame {
    static MyPanel mp;

    public zshTankGame01() {
        mp = MyPanel.getInstance(mp);
        Thread thread = new Thread(mp);
        thread.start();
        this.add(mp);
        this.addKeyListener(mp);
        this.setSize(1000, 750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        zshTankGame01 zTG = new zshTankGame01();

    }


}


class TankConsist {
    private int x;
    private int y;

    public TankConsist(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
