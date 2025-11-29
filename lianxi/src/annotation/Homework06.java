package annotation;

/**
 * @author 张 书航
 */

interface Vehicles {
    void work();
}

class Horse implements Vehicles {
    @Override
    public void work() {
        System.out.println("一般情况，使用🐎...");
    }
}

class Boat implements Vehicles {
    @Override
    public void work() {
        System.out.println("遇到河流，使用小船...");
    }
}

class Plane implements Vehicles {
    @Override
    public void work() {
        System.out.println("遇到火焰山，飞过去...");
    }
}

class VehiclesFactory {
    public static Horse getHorse() {
        return new Horse();
    }

    public static Boat getBoat() {
        return new Boat();
    }

    public static Plane getPlane() {
        return new Plane();
    }
}

class Person {
    private String name;
    private Vehicles vehicles;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public void passRiver() {
        if (!(vehicles instanceof Boat)) {
            vehicles = VehiclesFactory.getBoat();
        }
        vehicles.work();

    }

    public void common() {
        if (!(vehicles instanceof Horse)) {
            vehicles = new Horse();
        }

        vehicles.work();
    }

    public void fly() {
        if (!(vehicles instanceof Plane)){
            vehicles = new Plane();
        }
        vehicles.work();
    }

}

public class Homework06 {
    public static void main(String[] args) {
        Person p1 = new Person("张三", new Horse());
        p1.passRiver();
        p1.common();
        p1.fly();
    }
}
