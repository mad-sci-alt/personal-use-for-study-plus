package TankGame;

/**
 * @author 张 书航
 */
public class EnemyTank extends TankConsist {
    private int x;
    private int y;
    private int direct = 1;
    private int speed = 5;

    public EnemyTank(int x, int y) {
        super(x, y);
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

    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
