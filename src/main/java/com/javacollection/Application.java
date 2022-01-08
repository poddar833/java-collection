package com.javacollection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Application {
    public static void main(String[] args) {
//        String test = "truefalse";
//        boolean flag = checkIfFalse(test);
//        System.out.println("Above String contains false:  " + flag);
        Runnable runnable = ()->{
            System.out.println("Hello World");
        };
        Comparator<String> comparator = (a,b)->{
            return a.compareTo(b);
        };

        List l = new ArrayList();


    }

    public static boolean checkIfFalse(String test){
        if(test.contains("false"))
            return true;
        else
            return false;
    }
}
