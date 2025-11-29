package homework;

class Point{
    private double x;
    private double y;
    public  Point(double x,double y){
        this.x = x;
        this.y = y;

    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}

class LabeledPoint extends Point{
    public LabeledPoint(double x,double y){
        super(x,y);
        System.out.println("x = " + getX() + "\ty = " + getY());
    }

}

public class Homework09 {
    public static void main(String[] args) {
        new LabeledPoint(1,2);

    }
}
