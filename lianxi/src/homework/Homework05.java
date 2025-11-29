package homework;

class Workers{
    private double baseSal;

    public Workers(double baseSal) {
        this.baseSal = baseSal;
    }

    public double getBaseSal() {
        return baseSal;
    }

    public void setBaseSal(double baseSal) {
        this.baseSal = baseSal;
    }
}

class Worker extends Workers{
    public Worker(double baseSal) {
        super(baseSal);
        printSal();
    }

    public void printSal(){
        System.out.println("工人年工资为：" + getBaseSal());
    }
}

class Farmer extends Workers{
    public Farmer(double baseSal){
        super(baseSal);
        printSal();
    }

    public void printSal(){
        System.out.println("农民年工资为：" + getBaseSal());
    }
}

class Waiter extends Workers{
    public Waiter(double baseSal){
        super(baseSal);
        printSal();
    }

    public void printSal(){
        System.out.println("服务员年工资为：" + getBaseSal());
    }
}

class Teachers extends Workers{
    private int teachDay;
    private double salPerDay;

    public double getSalPerDay() {
        return salPerDay;
    }

    public void setSalPerDay(double salPerDay) {
        this.salPerDay = salPerDay;
    }

    public int getTeachDay() {
        return teachDay;
    }

    public void setTeachDay(int teachDay) {
        this.teachDay = teachDay;
    }

    public Teachers(double baseSal, int teachDay, double salPerDay) {
        super(baseSal);
        this.teachDay = teachDay;
        this.salPerDay = salPerDay;
        printSal();
    }

    public void printSal(){
        System.out.println("老师年工资为：" + (getBaseSal()+getSalPerDay()*getTeachDay()));
    }

}

class Scientist extends Workers{
    private double annualBonus;

    public Scientist(double baseSal, double annualBonus) {
        super(baseSal);
        this.annualBonus = annualBonus;
        printSal();
    }

    public double getAnnualBonus() {
        return annualBonus;
    }

    public void setAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;
    }

    public void printSal(){
        System.out.println("科学家年工资为：" + (getBaseSal()+getAnnualBonus()));
    }
}

public class Homework05 {
    public static void main(String[] args) {
        new Worker(5000);
        new Farmer(5000);
        new Waiter(5000);
        new Teachers(5000, 20, 100);
        new Scientist(5000, 5000);
    }

}