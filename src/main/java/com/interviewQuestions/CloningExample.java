package com.interviewQuestions;

import com.interviewQuestions.models.Address;
import com.interviewQuestions.models.Student;

public class CloningExample {
    public static void main(String[] args) {
        Student student = new Student(1, "Abhishek", new Address("Daas Garden", "New Delhi"));
        Student copiedStudent = null;
        try {
             copiedStudent = (Student)student.clone();
             copiedStudent.getAddress().setStreet("Uttam Nagar");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("Printing the results");
        System.out.println(student);
        System.out.println(copiedStudent);
    }
}
