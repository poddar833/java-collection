package com.interviewQuestions.recurssion;

public class Example1 {

    public static void main(String[] args) {
        Example1 example1 = new Example1();
        example1.test();
    }

    public void test() {
        try {
            System.out.println("In the try");
            throw new Exception();
        } catch (Exception e) {
            System.out.println("In the catch");
//            e.printStackTrace();
        } finally {
            System.out.println("In the finally");
        }
        System.out.println("Out side try-catch-finally");
    }

}

class SuperClass {
    {
        System.out.println("Super class instance block");
    }

    static {
        System.out.println("Super class static block");
    }

    public SuperClass() {
        System.out.println("Super Class No-arg constructor");
    }
}
