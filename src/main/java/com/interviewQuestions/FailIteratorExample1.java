package com.interviewQuestions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailIteratorExample1 {
    public static void main(String[] args) {

    }

    public static void failFast() {
        List<String> list = new ArrayList<>();
        list.add("First Element");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            list.add("Second Element");
        }
    }

    public static void failSafe() {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("First Element");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            list.add("Second Element");
        }
    }


}


