package com.java8;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class LocalDateExample {
    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("GMT"));
        Date date = new Date();
        Format f = new SimpleDateFormat("yyyy-dd-MM HH:mm:ss:SSS Z");
        System.out.println("Without Formatted Date: " + date);
        System.out.println("Formatted Date: " + f.format(date));
    }
}
