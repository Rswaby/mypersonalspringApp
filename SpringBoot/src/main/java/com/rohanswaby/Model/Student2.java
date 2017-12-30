package com.rohanswaby.Model;
import java.util.Date;

public class Student2 {
    private long id;
    private String name;
    private String subject;

    public Student2(){

    }

    public Student2(String name,String subject){
        this.id = (new Date()).getTime();
        this.name = name;
        this.subject = subject;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + this.id +
                ", name='" + this.name + '\'' +
                ", subject='" + this.subject + '\'' +
                '}';
    }
}
