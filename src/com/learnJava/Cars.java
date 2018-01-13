package com.learnJava;

public class Cars {
    int year;
    String model;
    String colour;

    public Cars(int year, String model, String colour) {
        this.year = year;
        this.model = model;
        this.colour = colour;

    }

    public static void main(String[] args) {
        Cars honda = new Cars(2013, "Accord", "Gray");
        honda.year = 2013;
        honda.model = "Accord";
        honda.colour = "Gray";
        System.out.println(honda.year);
        System.out.println(honda.model);
        System.out.println(honda.colour);
    }
}
