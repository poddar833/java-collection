package com.multithreading;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecuterFrameworkExample1 {
    public static void main(String[] args) {
        Task task1 = new Task("Executor Framework Example 1");
        Task task2 = new Task("Executor Framework Example 2");
        Task task3 = new Task("Executor Framework Example 3");
        Task task4 = new Task("Executor Framework Example 4");
        Task task5 = new Task("Executor Framework Example 5");
        Task task6 = new Task("Executor Framework Example 6");
        Task task7 = new Task("Executor Framework Example 7");
        ExecutorService executor = Executors.newFixedThreadPool(5);
        Future<String> result1 = executor.submit(task1);
        Future<String> result2 = executor.submit(task2);
        Future<String> result3 = executor.submit(task3);
        Future<String> result4 = executor.submit(task4);
        Future<String> result5 = executor.submit(task5);
        executor.submit(task6);
        executor.submit(task7);
        executor.shutdown();
    }

}

@Setter
@Getter
@ToString
class Task implements Callable<String> {
    private String message;

    public Task() {

    }

    public Task(String message) {
        this.message = message;
    }

    @Override
    public String call() throws Exception {
        System.out.println("Message: " + this.message);
        return this.message;
    }
}
