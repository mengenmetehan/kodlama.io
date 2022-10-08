package com.metehanmengen.week3.kodlamaio_web;

public class Instructor {
    private final String name;
    private final int age;
    private final int id;
    private final String lesson;

    public Instructor(String name, int age, int id, String lesson) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.lesson = lesson;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getLesson() {
        return lesson;
    }

    @Override
    public String toString() {
        return String.format("%s, %d yaşında %s dersinin eğitmenidir.", name, age, lesson);
    }
}
