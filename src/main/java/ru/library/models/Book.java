package ru.library.models;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Book {
    private int id;

    @NotEmpty(message = "Поле \"Название\" не должно быть пустым")
    @Size(min = 2, max = 30, message = "Поле \"Название\" не должно бытье меньше 2 символов и больше 30")
    private String name;

    @NotEmpty(message = "Поле \"Автор\" не должно быть пустым")
    private String author;
    @NotEmpty(message = "Поле \"Год выпуска\" не должно быть пустым")
    private int createYear;

    public Book(String name, String author, int CreateYear) {
        this.name = name;
        this.author = author;
        this.createYear = CreateYear;
    }

    public Book() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCreateYear() {
        return createYear;
    }

    public void setCreateYear(int createYear) {
        this.createYear = createYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
