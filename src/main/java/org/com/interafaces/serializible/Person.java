package org.com.interafaces.serializible;

import lombok.Data;

import java.io.*;

@Data
public class Person implements Serializable {

    private static final long VERSION_ID = 1L;
    private String name;
    private String country;
    private int age;
    transient int weight;
}