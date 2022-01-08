package com.interviewQuestions;

import com.interviewQuestions.models.Address;
import com.interviewQuestions.models.Student;

import java.util.*;

public class TreeMapExample1 {
    Comparator<Student> keyComparator = (a,b)->a.getName().compareTo(b.getName());
    private  Map<Student, Student> studentMap = new TreeMap<>(keyComparator);

    static {

    }

    public static void main(String[] args) {
        Map m  = new HashMap();
        TreeMapExample1 treeMapExample1 = new TreeMapExample1();
        Student student1 = new Student(1, "Abhishek", new Address("Daas Garden", "New Delhi"));
        Student student2 = new Student(2, "Shubham", new Address("Tilak Nagar", "Agra"));
        Student student3 = new Student(3, "Ashish", new Address("Janak Puri", "Jhansi"));
        Student student4 = new Student(4, "Abiral", new Address("Uttam Nagar", "Bareilly"));
        Student student5 = new Student(5, "Veer", new Address("Gorakhpur", "UP"));
        treeMapExample1.studentMap.put(student1, student1);
        treeMapExample1.studentMap.put(student2, student2);
        treeMapExample1.studentMap.put(student5, student5);
        treeMapExample1.studentMap.put(student4, student4);
        treeMapExample1. studentMap.put(student3, student3);
        System.out.println(treeMapExample1.studentMap);
    }
}
