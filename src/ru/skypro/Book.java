package ru.skypro;

public class Book {
   private int year;
   private final String name;

    public Book(String name, int year) {
        this.name = name;
        this.year = year;
    }


    public String getName() {
        return this.name;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }


}
