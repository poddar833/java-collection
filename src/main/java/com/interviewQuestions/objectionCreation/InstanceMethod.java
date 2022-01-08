package com.interviewQuestions.objectionCreation;

public class InstanceMethod {
    public static void main(String[] args) {
        try {
            Class classA = Class.forName("com.interviewQuestions.objectionCreation.A");
            A a1 = (A) classA.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class A {
    public A() {
        System.out.println("No arg constructor of class A called");
    }
}
