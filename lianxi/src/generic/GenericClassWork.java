package generic;

import java.util.ArrayList;

/**
 * @author 张 书航
 */
@SuppressWarnings("all")
public class GenericClassWork {
    public static void main(String[] args) {
        /// 注：如果传入的Employee对象name属性为中文，则排序不会按照字典序，因为中文编码问题
        Employee zs = new Employee("tom", 5000, new MyDateT(1999, 10, 10));
        Employee ls = new Employee("jack", 6000, new MyDateT(2001, 9, 15));
        Employee ww = new Employee("jac", 7000, new MyDateT(2000, 12, 12));
        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(zs);
        empList.add(ls);
        empList.add(ww);
        empList.sort((emp1, emp2) -> {
            if (!(emp1 instanceof Employee && emp2 instanceof Employee)) {//因为已经做了泛型校验，所以这里做类型验证就只有验证传进来的是否为Employee类的字类，如果是则直接退出不进行比较
                return 0;
            }
            if (!emp1.getName().equals(emp2.getName())) {
                return emp1.getName().compareTo(emp2.getName());
            }
            if (!emp1.getBithday().equals(emp2.getBithday())) {
                return emp1.getBithday().compareTo(emp2.getBithday());
            }
            return 0;
        });

        System.out.println(empList);
    }
}

@SuppressWarnings("all")
class Employee {
    private String name;
    private double sal;
    private MyDateT Bithday;

    public Employee(String name, double sal, MyDateT bithday) {
        this.name = name;
        this.sal = sal;
        Bithday = bithday;
    }

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

    public MyDateT getBithday() {
        return Bithday;
    }

    public void setBithday(MyDateT bithday) {
        Bithday = bithday;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", Bithday=" + Bithday +
                '}';
    }
}

@SuppressWarnings("all")
class MyDateT implements Comparable<MyDateT>{
    private int year;
    private int month;
    private int day;

    public MyDateT(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MyDateT myDateT = (MyDateT) o;
        return year == myDateT.year && month == myDateT.month && day == myDateT.day;
    }

    public int compareTo(MyDateT d) {
        if (year != d.year) return year - d.year;
        if (month != d.month) return month - d.month;
        return day - d.day;
    }
//    @Override
//    public int hashCode() {
//        return Objects.hash(year, month, day);
//    }
}