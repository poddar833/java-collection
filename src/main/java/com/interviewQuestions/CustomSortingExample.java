package com.interviewQuestions;

import com.interviewQuestions.models.Address;
import com.interviewQuestions.models.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CustomSortingExample {
    private static List<Student> studentList = new ArrayList();

    static {
        Student student1 = new Student(1, "Abhishek", new Address("Daas Garden", "New Delhi"));
        Student student2 = new Student(2, "Shubham", new Address("Tilak Nagar", "Agra"));
        Student student3 = new Student(3, "Ashish", new Address("Janak Puri", "Jhansi"));
        Student student4 = new Student(4, "Abiral", new Address("Uttam Nagar", "Bareilly"));
        Student student5 = new Student(5, "Veer", new Address("Gorakhpur", "UP"));
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
    }

    public static void main(String[] args) {

    }

    public static void comparatorMethod() {
        studentList.stream().forEach((item) -> System.out.println(item));
        Comparator<Student> compOnName = (a, b) -> b.getName().compareTo(a.getName());
        studentList.sort(compOnName);
        System.out.println("After Sorting...");
        studentList.stream().forEach((item) -> System.out.println(item));
    }
}


