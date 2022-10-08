package com.metehanmengen.week3.kodlamaio_web;

public class Course {
    private final int id;
    private final String name;
    private Instructor instructor;
    private double price;


    public Course(int id, String name, Instructor instructor, double price) {
        this.id = id;
        this.name = name;
        this.instructor = instructor;
        setPrice(price);
    }

    public Course(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private void setPrice(double price)
    {
        if (price < 0) {
            System.out.println("Fiyat 0 dan küçük olamaz");
            this.price = 0;
            }
        else
            this.price = price;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public double getPrice() {
        return price;
    }
}
