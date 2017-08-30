package com.seed.library;

import java.util.Set;
import java.util.TreeSet;

public class Book {
    private int id;
    private String name;
    private Set<String> authors = new TreeSet<>();
    private int price;

    //Constructors
    public Book() {
        //Call parametrized constructor with default values
        this(0, "Unknown Book", new TreeSet<String>(), 0);
    }

    public Book(int id, String name, Set<String> authors, int price) {
        this.id = id;
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    //Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ID = " + id +
                "\nName = " + name +
                "\nAuthors = " + authors +
                "\nPrice = " + price;
    }
}
