package ru.library.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import ru.library.dao.PersonDAO;
import ru.library.models.Person;
import ru.library.services.PeopleService;

@Component
public class PersonValidator implements Validator {

    private PeopleService peopleService;

    @Autowired
    public PersonValidator(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return Person.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Person person = (Person) target;
        if (peopleService.findByFullName(person.getFullName()).) {
            errors.rejectValue("fullName","", "Человек с таким именем уже существует");
        }
    }
}
