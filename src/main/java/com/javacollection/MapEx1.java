package com.javacollection;

import java.util.*;
import java.util.stream.Collectors;

public class MapEx1 {
    private static final Map<String, Object> hashmap = new HashMap<>();
    private static final Map<String, Object> hashtable = new Hashtable<>();
    private static final List<String> list = new ArrayList<>();

    static {
        hashmap.put("1", "One");
        hashmap.put("2", "Two");
        hashmap.put("3", "Three");
        hashmap.put("4", "Four");
        hashmap.put("5", "Five");
        hashmap.put("6", "Six");
        hashmap.put("7", null);
        hashmap.put(null, null);
        Set<String> s = hashmap.keySet();
        Iterator iterator = s.iterator();
        while (iterator.hasNext()) {
            System.out.println("Value: " + iterator.next());
        }
    }

//    static {
//        hashtable.put("1", "One");
//        hashtable.put("2", "Two");
//        hashtable.put("3", "Three");
//        hashtable.put("4", "Four");
//        hashtable.put("5", "Five");
//        hashtable.put("6", "Six");
//        hashtable.put("7", null);
//        hashtable.put(null, null);
//    }

    public static void checkKey(String key) {
        Set keyset = hashmap.keySet();
        keyset.stream().collect(Collectors.toList());
        keyset.stream().filter(a -> a.equals(key)).forEach(a -> System.out.println(a));
    }

    public static void iterateMap() {
/*
        System.out.println(hashmap);
        hashmap.keySet().stream().forEach((item) -> System.out.print(hashmap.get(item) + " "));
*/
        Set<Map.Entry<String, Object>> s = hashmap.entrySet();
    }

    public static void methodTest() {
        hashmap.put("7", "Seven");
        System.out.println("Size of HashMap: " + hashmap.size());
        System.out.println("Value: " + hashmap.containsKey("1"));
        System.out.println("Value: " + hashmap.containsValue("One"));
        Set<String> keySet = hashmap.keySet();
        Collection c = hashmap.values();
    }

    public static void main(String[] args) {

    }
}
