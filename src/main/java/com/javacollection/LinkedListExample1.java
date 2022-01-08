package com.javacollection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample1 {
    private static List list = new LinkedList();
    static{
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add(null);
        list.add(null);

    }
    public static void methodtest(){
        System.out.println(list);
    }

    public static void main(String[] args) {
        methodtest();
    }
}
