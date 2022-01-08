package com.javacollection;

public class CloningExample1 {
    public static void main(String[] args) {
        Address address = new Address("Daas Garden", "New Delhi");
        Student s = new Student(1, "Abhishek", address);
        try {
            Student copied = (Student) s.clone();
            Address copiedA = copied.getAddress();
            address.setStreet("Not a valid");
            System.out.println(address.getStreet());
            System.out.println(copiedA.getStreet());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

class Student implements Cloneable {
    private int id;
    private String name;
    private Address address;

    @Override
    public Object clone() throws CloneNotSupportedException {
        Student student = (Student) super.clone();
        student.address = (Address) student.address.clone();
        return student;
    }

    public Student() {
        System.out.println("Student constructor called");
    }


    public Student(int id, String name, Address address) {
        System.out.println("Student parameterized constructor called");
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
}

class Address implements Cloneable {
    private String street;
    private String city;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Address() {
        System.out.println("Address Constructor called");
    }

    public Address(String street, String city) {
        System.out.println("Address parameterized Constructor called");
        this.street = street;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}

