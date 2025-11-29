package Set_;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author 张 书航
 */
public class LinkedHashSetExercise {
    public static void main(String[] args) {
        Set set = new LinkedHashSet();
        set.add(new Car("ford", 100));
        set.add(new Car("ford", 100));
        set.add(new Car("Maybach", 200));
        System.out.println(set);

    }
}

class Car {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + ":" + price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(price, car.price) == 0
                && Objects.equals(name, car.name);//name.equals(car.name)
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}