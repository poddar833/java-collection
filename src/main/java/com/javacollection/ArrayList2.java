package com.javacollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList2 {
    public static void main(String[] args) {
        copyArrayList();
    }

    public static void copyArrayList() {
        List<String> List1 = new ArrayList<String>();
        List1.add("1");
        List1.add("2");
        List1.add("3");
        List1.add("4");
        List1.add("5");
        List<String> l1 = List1.subList(0,2);
        l1.stream().forEach((item)-> System.out.print(item + " "));

    }
}