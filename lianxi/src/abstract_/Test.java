package abstract_;

abstract class Employee{
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public abstract void work();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Manager extends Employee{
    private double bonus;
    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }
    @Override
    public void work() {
        System.out.println("经理"+getName()+"正在工作...");
    }
}

class CommonEmployee extends Employee{
    public CommonEmployee(String name, int id, double salary, double workTime) {
        super(name, id, salary);
    }
    @Override
    public void work() {
        System.out.println("普通员工"+getName()+"正在工作...");
    }
}

public class Test {
    public static void main(String[] args) {
        new Manager("张三", 1, 5000, 5000).work();
        new CommonEmployee("李四", 2, 3000, 8).work();
    }
}
