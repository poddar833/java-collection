package com.java8.streamapiquestions;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StreamExample1 {
    private static List<String> list = Arrays.asList("H", "A", "Z", "L", "B", "Y", "M", "a", "c");
    private static List<Integer> numberList = Arrays.asList(1, 4, 6, 7, 9, 11);
    private static List<String> strList = Arrays.asList("saw", "wrong turn", "walking dead", "nun", "jurassic park");
    private static List<Integer> listithNumbers = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
    private static List<Integer> firstNumberList = Arrays.asList(10, 15, 8, 49, 25, 198, 98, 32, 15);
    private static Predicate<Integer> testOdd = (item) -> item % 2 != 0;
    private static Predicate<String> checkLength = (item) -> item.length() > 3;
    private static Predicate<Integer> checkStartwith1 = (item) -> item.toString().startsWith("1");
    private static Consumer printer = (item) -> System.out.print(item + ", ");
    private static List<Integer> duplicateList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);


    public static void sortList() {
        list.stream().forEach(item -> System.out.print(item + " "));
        System.out.println();
        list.stream().sorted().forEach((item) -> System.out.print(item + " "));
    }

    public static void sortReverseList() {
        list.stream().forEach(item -> System.out.print(item + " "));
        System.out.println();
        list.stream().sorted(Comparator.reverseOrder());
    }

    public static void countOdd() {
        numberList.stream().filter(testOdd).forEach(item -> System.out.print(item + " "));
        System.out.println("Number of Odds in the list: " + numberList.stream().filter(testOdd).count());
    }

    public static void checkLength() {
        System.out.println("count of string with length > 3 " + strList.stream().filter(checkLength).count());
        strList.stream().filter(checkLength).forEach(item -> System.out.print(item + ", "));
    }

    public static void CheckStartwith1() {
        listithNumbers.stream().filter(checkStartwith1).forEach(printer);
        System.out.println();
        listithNumbers.stream().forEach(printer);
    }

    public static void dupicateNumberChecker() {
        Set<Integer> numberSet = new HashSet<>();
        duplicateList.stream().filter(item -> !numberSet.add(item)).forEach(printer);
        System.out.println();
        duplicateList.stream().forEach(printer);
    }

    public static void printFirst() {
        firstNumberList.stream().limit(1).forEach(printer);
        firstNumberList.stream().max(Integer::compare).get();
    }

    public static void findFirstrepeatedNumber() {
        Set<Integer> numberSet = new HashSet<>();
        int answer = firstNumberList.stream().filter(item -> !numberSet.add(item)).limit(1).max(Integer::compare).get();
        System.out.println("Answer: " + answer);
    }

    public static void printMax() {
        int result = firstNumberList.stream().reduce(firstNumberList.get(0), (a, b) -> a > b ? a : b);
        System.out.println("Maximum in the list: " + result);
    }

    public static void main(String[] args) {
        printMax();
    }

}
