package ru.library.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Book {
    private int id;

    @NotEmpty(message = "Поле \"Название\" не должно быть пустым")
    @Size(min = 2, max = 100, message = "Поле \"Название\" должно быть от 2 до 100 символов в длину")
    private String title;

    @NotEmpty(message = "Поле \"Автор\" не должно быть пустым")
    @Size(min = 2, max = 100, message = "Поле \"Автор\" должно быть от 2 до 100 в длину")
    private String author;
    @Min(value = 1500, message = "Поле \"Год выпуска\" должно быть ,больше чем 1500")
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
