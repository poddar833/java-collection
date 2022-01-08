package com.javacollection;

import java.util.*;

public class ArrayListEx1 {
    private static final Random rand = new Random();
    private static List<Integer> numberList = new ArrayList<>();
    private static List<String> stringList = new ArrayList<>();


    /*
       How to Iterate ArrayList using Java ListIterator Example
    */
    public static void iterateByListIterator() {
        ListIterator listIterator = stringList.listIterator();
        while (listIterator.hasNext())
            System.out.println(listIterator.next());

        System.out.println("Size: " + stringList.size());
    }

    /*
        Arraylist add element at specific index
    */
    public static void addElement(int index, int element) {
        numberList.add(index, element);
    }

    /*
        Sort ArrayList in descending order
    */
    public static void sortInDesc() {
        numberList.sort((a, b) -> b - a);
    }

    public static void printElements() {
        numberList.stream().forEach((a) -> System.out.print(a + " "));
    }

    public static void addElements() {
        for (int i = 0; i < 10; i++)
            numberList.add(rand.nextInt(1000));

        stringList.add("A");
        stringList.add("C");
        stringList.add("D");
        stringList.add("Z");
        stringList.add("F");
        stringList.add("J");
        stringList.add("K");
        stringList.add("M");
        stringList.add("L");
        stringList.add("O");
    }

    /*
    Java program to insert an element to ArrayList using ListIterator Example
    */
    public static void insertUsingListIterator() {
        ListIterator<Integer> listiterator = numberList.listIterator();
        while (listiterator.hasNext()) {
            numberList.add(5);
            break;
        }
    }

    /*
    Java program to insert an element to ArrayList using ListIterator Example
    */
    public static void insertUsingIterator() {
        Iterator<Integer> iterator = numberList.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            numberList.add(6);
            break;
        }
    }

    /*
        How to sort arraylist of strings alphabetically java
    */
    public static void sortAlphabetically() {
        stringList.sort((a, b) -> a.compareTo(b));
    }

    public static void printStringList() {
        stringList.stream().forEach((a) -> System.out.print(a + " "));
    }
}
