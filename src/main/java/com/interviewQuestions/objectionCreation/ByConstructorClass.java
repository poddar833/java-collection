package com.interviewQuestions.objectionCreation;

import lombok.ToString;

import java.lang.reflect.Constructor;

public class ByConstructorClass {
    public static void main(String[] args) {
        Constructor<B> constructor;
        try {
            constructor = B.class.getConstructor();
            constructor.setAccessible(true);
            B b1 = constructor.newInstance();
            System.out.println("Object: " + b1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

@ToString
class B {
    private int a;
    private String name;

    private B() {
        System.out.println("No-Arg Constructor of B class called");
        this.a = 1;
        this.name = "Abhishek";
    }

}
