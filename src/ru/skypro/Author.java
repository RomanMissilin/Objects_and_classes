package ru.skypro;

import java.util.Objects;

public class Author {
    private final String name;

    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String toString () {
        return "Имя автора " + this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name);
        // Я не понял как его самому писать, и что тут к чему в этой части кода. Расскажете?
        // И как это фв консоль вывести?
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
        // Я не понял как его самому писать, и что тут к чему в этой части кода. Расскажете?
        // И как это фв консоль вывести?
    }
}
