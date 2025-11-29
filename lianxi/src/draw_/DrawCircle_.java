package draw_;

import javax.swing.*;
import java.awt.*;

/**
 * @author 张 书航
 */
public class DrawCircle_ extends JFrame {
    private MyPanel myPanel;

    public static void main(String[] args) {
        DrawCircle_ dC = new DrawCircle_();

    }

    public DrawCircle_() {
        //初始化面板
        myPanel = new MyPanel();
        //把面板放入到窗口
        this.add(myPanel);
        //设置窗口的大小和位置
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);///可以显示
    }
}

class MyPanel extends JPanel {

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        System.out.println("paint方法被调用");
//        g.drawOval(0, 0, 100, 100);
//        g.drawLine(0, 0, 100, 100);
        g.drawRect(10, 10, 100, 100);
        g.setColor(Color.red);
        g.fillRect(110, 110, 100, 100);
        g.drawOval(200,200,100,100);
        g.setColor(Color.blue);
        g.fillOval(300,300,100,100);
//        Image read = ImageIO.read(new File("/504230_78.png"));
        Image image = Toolkit.getDefaultToolkit().
                getImage(MyPanel.class.getResource
                        ("/504230_78.png"));
        g.drawImage(image,10,10,170,100,this);
        g.setColor(Color.BLACK);
        g.setFont(new Font("楷体",Font.BOLD,20));
        g.drawString("张书航",200,200);//这里的坐标就是“张书航”的左下角坐标
    }
}