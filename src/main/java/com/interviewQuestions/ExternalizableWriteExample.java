package com.interviewQuestions;

import java.io.*;
import com.interviewQuestions.models.*;

public class ExternalizableWriteExample {
    public static void main(String[] args) {
        try {
            ExternalizableDemo externalizableDemo = new ExternalizableDemo(1, "Abhishek");
            File file = new File("externalization.txt");
            FileOutputStream fileInputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileInputStream);
            objectOutputStream.writeObject(externalizableDemo);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
