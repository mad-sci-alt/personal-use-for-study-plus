package com.atzsh.spring.pojo;

import java.util.Map;

/**
 * @author 张 书航
 */
public class StudentInfo {
    private Student student;
    private Clazz clazz;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "student=" + student +
                ", clazz=" + clazz +
                '}';
    }
}
