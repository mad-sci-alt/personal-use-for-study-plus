package homework;

import java.util.Objects;

class Doctor{
    private String name;
    private int age;
    private char gender;
    private String job;
    private double sal;

    public Doctor(String name, int age, char gender, double sal, String job) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.sal = sal;
        this.job = job;
    }

    public boolean equals(Doctor doctor){
        if (doctor != null){
            if (this.name.equals(doctor.name) && this.age == doctor.age && this.gender == doctor.gender && this.job.equals(doctor.job)  && this.sal == doctor.sal){
                return true;
            }
        }
       return false;
    }

    /// idea编辑器提供的重写equals方法的快捷模板，更加的灵活
///    public boolean equals(Object o) {
///        if (o == null || getClass() != o.getClass()) return false;
///        Doctor doctor = (Doctor) o;
///        return age == doctor.age && gender == doctor.gender && Double.compare(sal, doctor.sal) == 0 && Objects.equals(name, doctor.name) && Objects.equals(job, doctor.job);
///    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender, job, sal);
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
}

public class Homework {
    public static void main(String[] args) {
        System.out.println(new Doctor("张三", 18, '男', 5000, "医生")
                .equals(new Doctor("张三", 18, '男', 5000, "医生")));
    }
}
