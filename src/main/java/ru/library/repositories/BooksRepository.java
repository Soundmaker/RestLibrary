package ru.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.library.models.Book;

public interface BooksRepository extends JpaRepository<Book,Integer> {
}
