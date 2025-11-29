package Final;

class Cal{
    public final double PI ;
    public final double radius;
    {
        PI = 3.14;
    }


    public Cal(double radius) {
        this.radius = radius;
        System.out.println("圆的周长为"+2*PI*this.radius);
    }

}

public class Circle {
    public static void main(String[] args) {
        new Cal(5.0);
    }
}
