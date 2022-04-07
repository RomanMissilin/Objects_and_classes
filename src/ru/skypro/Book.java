package ru.skypro;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && name.equals(book.name);
        // Я не понял как его самому писать, и что тут к чему в этой части кода. Расскажете?
        // И как это фв консоль вывести?
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, name);
        // Я не понял как его самому писать, и что тут к чему в этой части кода. Расскажете?
        // И как это фв консоль вывести?
    }


}
