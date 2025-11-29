package generic;

import java.util.*;

/**
 * @author 张 书航
 */
public class GenericExercise {
    public static void main(String[] args) {
        Student zs = new Student("张三", 18);
        Student ls = new Student("李四", 19);
        Student ww = new Student("王五", 20);
        HashSet<Student> set = new HashSet<>();
        HashMap<String, Student> hashMap =
                new HashMap<String, Student>();///指定该map存放key和value的类型
        set.add(zs);
        set.add(ls);
        set.add(ww);
        Iterator<Student> iterator = set.iterator();
        while (iterator.hasNext()) {
            Student stu = iterator.next();
            hashMap.put(stu.name, stu);
            System.out.println(stu);
        }
        Set<String> key = hashMap.keySet();
        Set<Map.Entry<String, Student>> entrySet = hashMap.entrySet();
        Iterator<Map.Entry<String, Student>> iterator1 = entrySet.iterator();
        while (iterator1.hasNext()) {
            Map.Entry<String, Student> stu = iterator1.next();
            System.out.println(stu);
        }

        for (String stu :key) {
            System.out.println("key"+stu+"对应的value为"
                    +hashMap.get(stu));
        }
        for (Map.Entry entry :entrySet) {
            System.out.println( entry);
        }


    }
}

class Student{
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
