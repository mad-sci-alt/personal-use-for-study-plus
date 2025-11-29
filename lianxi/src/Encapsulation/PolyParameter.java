package Encapsulation;

class EmployeeMain{
    private String name;
    private double sal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public EmployeeMain(String name, double sal) {
        this.name = name;
        this.sal = sal;
    }
    public double getAnnualSal(){
        return 12*getSal();
    }

}
class CommonEmployee extends EmployeeMain{
    public CommonEmployee(String name, double sal) {
        super(name, sal);
    }

    public void work(){
        System.out.println("员工"+getName()+"正在工作...");
    }

    @Override
    public double getAnnualSal() {
        return super.getAnnualSal();
    }
}
class Manager extends EmployeeMain{
    private double bonus;

    public double getBonus() {
        return bonus;
    }
    public void manage(){
        System.out.println("经理"+getName()+"正在管理...");
    }
    @Override
    public double getAnnualSal() {
        return super.getAnnualSal()+getBonus();
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
        "hello".equals("good");
    }

    public Manager(String name, double sal, double bonus) {
        super(name,sal);
        this.bonus = bonus;
    }

}



public class PolyParameter {

    public static void main(String[] args) {
        CommonEmployee tom = new CommonEmployee("Tom", 5000);
        Manager jerry = new Manager("Jerry", 5000, 5000);
        PolyParameter poly = new PolyParameter();
        poly.showEmpAnnual(tom);
        poly.showEmpAnnual(jerry);
    }

    public void showEmpAnnual(EmployeeMain e){
        System.out.println(e.getAnnualSal());
    }
}
