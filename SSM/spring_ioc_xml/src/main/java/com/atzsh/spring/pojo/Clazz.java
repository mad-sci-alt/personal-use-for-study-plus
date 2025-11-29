package com.atzsh.spring.pojo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.List;

/**
 * @author 张 书航
 */
public class Clazz {
    private Integer cid;
    private String cname;
    private List<Student> studentList;

    public Clazz(Integer cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }

    public Clazz() {
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", studentList=" + studentList +
                '}';
    }
}
