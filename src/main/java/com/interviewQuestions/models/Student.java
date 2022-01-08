package com.interviewQuestions.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Student implements Cloneable{
    private int id;
    private String name;
    private Address address;

    public Student() {
    }

    public Student(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("Clone method called for student");
        Student student = (Student) super.clone();
        student.address = (Address) student.address.clone();
        return student;
    }

}
