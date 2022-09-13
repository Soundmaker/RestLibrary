package ru.library.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Person {
    private int id;

    @NotEmpty(message = "Поле \"ФИО\" не должно быть пустым")
    @Pattern(regexp = "[A-Z]\\w+, [A-Z]\\w+ [A-Z]\\w+",
            message = "Введите ФИО в формате: Фамилия, Имя Отчество")
    @Size(min = 2, max =100 , message = "Поле \"ФИО\" от 2 до 100 символов")
    private String fullName;

    @Min( value = 1900, message = "Поле \"Год рождения\" должен быть больше, чем 1900")
    private int birthYear;

    public Person(String fullName, int birthYear) {
        this.fullName = fullName;
        this.birthYear = birthYear;
    }

    public Person() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
