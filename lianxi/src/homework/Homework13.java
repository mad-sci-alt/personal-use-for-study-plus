package homework;

abstract class  PersonL{
    private String name;
    private int age;
    private char sex;

    public PersonL(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public abstract String playT();
    public abstract String playS();
}

class Student extends PersonL{
    private int stu_id;

    public Student(String name, int age, char sex, int stu_id) {
        super(name, age, sex);
        this.stu_id = stu_id;
    }

    public String playS(){
        return getName()+" 爱踢足球";
    }

    @Override
    public String playT(){
        return null;
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public void study(){
        System.out.println("我承诺 我会好好学习");
    }
}

class TeacherL extends PersonL{
    private int work_age;

    public TeacherL(String name, int age, char sex, int work_age) {
        super(name, age, sex);
        this.work_age = work_age;
    }

    public String playT(){
        return getName()+" 爱玩象棋";
    }

    @Override
    public String playS(){
        return null;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    public void teach(){
        System.out.println("我承诺 我会好好教学");
    }
}

public class Homework13 {
    public static void main(String[] args) {
        Student s = new Student("张三", 18, '男', 1001);
        System.out.println(s.playS());
    }
}
