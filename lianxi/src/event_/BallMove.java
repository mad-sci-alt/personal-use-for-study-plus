package event_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author 张 书航
 */
public class BallMove extends JFrame {
    private MyPanel mp = null;

    public static void main(String[] args) {
        BallMove ballMove = new BallMove();
    }

    public BallMove() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400, 300);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

//KeyListener是一个监听器，可以监听关于键盘输入的事件
class MyPanel extends JPanel implements KeyListener {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(10, 10, 10, 10);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        Judge(e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public void Judge(int logic) {
        switch (logic) {
            case KeyEvent.VK_DOWN:
                System.out.println("按下了下键");
                break;
            case KeyEvent.VK_UP:
                System.out.println("按下了上键");
                break;
            case KeyEvent.VK_LEFT:
                System.out.println("按下了左键");
                break;
            case KeyEvent.VK_RIGHT:
                System.out.println("按下了右键");
                break;
        }
    }
}
