package Map_;

import java.util.*;

/**
 * @author 张 书航
 */
public class MapExercise_ {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("n01", new Employee("张三", 1001, 5000));
        map.put("n02", new Employee("张三", 1001, 19000));
        map.put("n03", new Employee("张三", 1001, 5000));
        Set set = map.keySet();
        for (Object key : set) {
            Employee emp = (Employee) map.get(key);
            if (emp.getSalary() > 18000) {
                System.out.println("key:"+key+" "+"对应value为 "+map.get(key));
            }
        }

    }

}


class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return getId() == employee.getId()
                && Double.compare(salary, employee.salary) == 0
                && Objects.equals(getName(), employee.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getId(), salary);
    }

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

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}