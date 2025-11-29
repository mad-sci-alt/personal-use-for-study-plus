package annotation;

import java.util.Scanner;

/**
 * @author 张 书航
 */
interface airCon {
    void flow();
}

class Car implements airCon{
    private static double tem;
    static Scanner myScanner = new Scanner(System.in);
    private static Car car;

    private Car(double tem) {
        this.tem = tem;
    }

    public static Car getInstance() {
        if (car == null){
            System.out.println("通过温度传感器检测到目前车内温度为：");
            car = new Car(myScanner.nextDouble());
        }
        return car;
    }

    @Override
    public void flow() {
        if (tem > 40 ){
            System.out.println("打开空调,吹冷气");
        } else if (tem <0){
            System.out.println("打开空调,吹暖气");
        } else {
            System.out.println("温度正常,关闭空调");
        }
    }
}

public class Homework07 {
    public static void main(String[] args) {
        Car.getInstance().flow();
    }
}
