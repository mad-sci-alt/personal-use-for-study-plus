package Set_;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

/**
 * @author 张 书航
 */
public class HashSetExercise01 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Set set = new HashSet();
//        Employee[] arr = new Employee[3];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = new Employee(sc.next(), sc.nextInt());
//        }
        Employee zs = new Employee("张三", 18);
        Employee ls = new Employee("李四", 19);
        Employee zs2 = new Employee("张三", 18);

//        for (Object o : arr) {
//            Employee e = (Employee) o;
//            for (Object o1 : arr) {
//                Employee e1 = (Employee) o1;
//                if (!(e.getAge() == e1.getAge() && e.getName().equals(e1.getName()))) {
//                    set.add(e1);
//                }
////                System.out.println("重复元素" + e1.getName() + "只会被添加一次");
//
//            }
//        }
        set.add(zs);
        set.add(ls);
        set.add(zs2);
        System.out.println(set);
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

//    @Override
//    public boolean equals(Object obj) {
//        Employee o = (Employee) obj;
//        return this.getName().equals(o.getName()) && this.getAge() == o.getAge();
//    }

//    @Override
//    public int hashCode() {
//        return Objects.hash();
//    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return getAge() == employee.getAge() && Objects.equals(getName(), employee.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }
}