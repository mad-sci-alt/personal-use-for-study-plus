package Set_;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author 张 书航
 */
public class HashSetExercise02 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employer("张三",
                new MyDate(1999, 9, 9)));
        hashSet.add(new Employer("张三",
                new MyDate(1999, 10, 9)));
        System.out.println(hashSet);
    }
}

class Employer {
    private String name;
    private MyDate birth;


    public Employer(String name, MyDate birth) {
        this.name = name;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyDate getBirth() {
        return birth;
    }

    public void setBirth(MyDate birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "name='" + name + '\'' +
                ", birth=" + birth +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employer employer = (Employer) o;
        return getName().equals(employer.getName()) &&
                getBirth().getYear() == employer.getBirth().getYear()
                && getBirth().getMonth()==employer.getBirth().getMonth()
                && getBirth().getDay()==employer.getBirth().getDay();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getBirth().getYear(),
                getBirth().getMonth(), getBirth().getDay());
    }
}
class MyDate{
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return year +
                "-" + month +
                "-" + day;
    }

    //    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        MyDate myDate = (MyDate) o;
//        return getYear() == myDate.getYear() && getMonth() == myDate.getMonth() && getDay() == myDate.getDay();
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getYear(), getMonth(), getDay());
//    }
}