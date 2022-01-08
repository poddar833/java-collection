package com.interviewQuestions.models;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class ExternalizableDemo implements Externalizable {

    private int id;
    private String name;

    public ExternalizableDemo() {
        System.out.println("Default Constructor called");
    }

    public ExternalizableDemo(int id, String name) {
        System.out.println("Parameterized Constructor called");
        this.id = id;
        this.name = name;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        System.out.println("writeExternal method called");
        out.writeInt(id);
        out.writeObject(name);
        out.flush();
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        System.out.println("readExternal method called");
        id = in.readInt();
        name = (String) in.readObject();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ExternalizableDemo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}