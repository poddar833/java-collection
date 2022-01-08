package com.interviewQuestions;

import com.interviewQuestions.models.ExternalizableDemo;

import java.io.*;

public class ExternalizableReadExample {
    public static void main(String[] args) {
        File file = new File("externalization.txt");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            ExternalizableDemo externalizableDemo = (ExternalizableDemo)objectInputStream.readObject();
            System.out.println(externalizableDemo);
        } catch (FileNotFoundException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
