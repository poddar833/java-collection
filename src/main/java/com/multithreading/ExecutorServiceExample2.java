package com.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExample2 {
    public static void main(String[] args) {
        List<String> strList = Data.getList();
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        ExecutorService es = Executors.newCachedThreadPool();
        long startTime = System.currentTimeMillis();
        es.submit(new A(strList.subList(0, 500)));
        es.submit(new A(strList.subList(501, 1000)));
        executorService.submit(new A(strList.subList(1001, 1500)));
        executorService.submit(new A(strList.subList(1501, 2000)));
        executorService.submit(new A(strList.subList(2001, strList.size())));
        long endTime = System.currentTimeMillis();
        executorService.shutdown();
        try {
            while (!executorService.awaitTermination(24L, TimeUnit.HOURS)) {
                System.out.println();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long result = endTime - startTime;
        System.out.println("Time consumed to Execute: " + result + "ms");
    }
}

class A implements Runnable {
    private List<String> strList = new ArrayList<>();

    public A(List<String> strList) {
        this.strList = strList;
    }

    @Override
    public void run() {
        for (String a : strList) {
            sendToKafka(a);
        }
    }

    public void sendToKafka(String message) {
        System.out.println("Sent to Kafka Successfully" + message);
    }
}
