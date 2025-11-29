package homework;

class Employee{
    private String name;
    private double salDay;
    private int workdays;

    public Employee(String name, double salDay, int workdays) {
        this.name = name;
        this.salDay = salDay;
        this.workdays = workdays;
    }

    public double getSalDay() {
        return salDay;
    }

    public void setSalDay(double salDay) {
        this.salDay = salDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkdays() {
        return workdays;
    }

    public void setWorkdays(int workdays) {
        this.workdays = workdays;
    }

    public double getSal(){
        return getSalDay()*getWorkdays();
    }

    public void printSal(){
        System.out.println("员工" + this.getName() + "的工资为：" + this.getSal());
    }
}

class DepManager extends Employee{
    public DepManager(String name, double salDay, int workdays) {
        super(name, salDay, workdays);
        printSal();
    }

    public double getSal(){
        return 1000 + super.getSalDay()*super.getWorkdays()*1.2;
    }

    public void printSal(){
        System.out.println("部门经理" + super.getName() + "的工资为：" + getSal());
    }
}

class Staff extends Employee{
    public Staff(String name, double salDay, int workdays) {
        super(name, salDay, workdays);
        printSal();
    }

    public double getSal() {
        return super.getSalDay()*super.getWorkdays()*1.0;
    }

    public void printSal(){
        System.out.println("员工" + super.getName() + "的工资为：" + getSal());
    }
}

public class Homework04 {
    public static void main(String[] args) {
        DepManager wang = new DepManager("小王", 100, 20);
        Staff zhang = new Staff("小张", 100, 20);
    }
}
