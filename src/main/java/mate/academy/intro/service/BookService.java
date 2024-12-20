package mate.academy.intro.service;

import java.util.List;
import mate.academy.intro.model.Book;

public interface BookService {

    List<Book> getAllBooks();

    Book addBook(Book book);
}
