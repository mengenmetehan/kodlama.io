package com.metehanmengen.week3.kodlamaio_web;

import java.util.Optional;

public class Category {
    private final int id;
    private final String name;
    private Optional<String> description;


    public Category(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = Optional.of(description);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Optional<String> getDescription() {
        return description;
    }
}
