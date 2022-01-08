package com.interviewQuestions;

/*
 How to create custom immutable class.
 1. Mark the class as final, so that it can't be modified by inheritance.
 2. Mark the variable as private & final.
 3. Don't provide the setter for accessing the fields.
 4. Deep copy should be performed in the getter method
    in case class contains any reference type variable.
*/
public class MutableClass {
    public static void main(String[] args) {

        MutableClassExample mutableClassExample = new MutableClassExample(1, "Name", new Address("New Delhi"));
        Address address = mutableClassExample.getAddress();
        address.setCity("Updated City");
        int a = mutableClassExample.getId();
        a = 5;
        System.out.println(mutableClassExample.getAddress().getCity());
        System.out.println(mutableClassExample.getId());

    }
}

final class MutableClassExample {
    //Step 1. Mark the variable as private.
    private final int id;
    private final String name;
    private final Address address;

    public MutableClassExample(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }


    //Step 2. Don't provide any setters.
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {

        return (Address) address.clone();
    }
}

class Address implements Cloneable {
    private String city;

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        } finally {

        }
        return new Address();
    }

    public Address() {

    }

    public Address(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}