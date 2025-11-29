package CollectionHomework;

import java.util.*;

/**
 * @author 张 书航
 */
public class Homework03 {
    public static void main(String[] args) {
        Map map = new HashMap();
        Employee jack = new Employee("jack", 650);
        Employee tom = new Employee("tom", 1200);
        Employee smith = new Employee("smith", 2900);
        map.put(jack.getName(), jack.getSal());
        map.put(tom.getName(), tom.getSal());
        map.put(smith.getName(), smith.getSal());
        map.replace(jack.getName(), jack.setSal(2600));

        Set set = map.keySet();
        List list = Collections.singletonList(map.values());
        for (Object key : set) {
            map.put(key, (int) map.get(key) + 100);
        }

        Set set1 = map.entrySet();
        for (Object o : set1) {
            System.out.println(o);
        }
        for (Object key : set) {
            System.out.print(key+" ");
        }
        System.out.println();
        for (Object value : list) {
            System.out.println(value);
        }


//        Set set1 = map.entrySet();
//
//        for (Object key : set) {
//            System.out.println(key + " " + map.get(key));
//        }

    }
}

class Employee {
    private String name;
    private int sal;

    @Override
    public String toString() {
        return "Employee{" +
                name + '\'' + sal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return getSal() == employee.getSal() && Objects.equals(getName(), employee.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSal());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public int setSal(int sal) {
        this.sal = sal;
        return sal;
    }


    public Employee(String name, int sal) {
        this.name = name;
        this.sal = sal;
    }

}