package com.interviewQuestions.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Address implements Cloneable{
    private String street;
    private String city;

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("Clone method called for Address");
        return super.clone();
    }

    public Address() {
    }

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }
}
