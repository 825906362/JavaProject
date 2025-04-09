package nynu.service;

import nynu.pojo.Book;
import nynu.pojo.User;

import java.util.List;

public interface BookService {
    List<Book> findAll();
    Book findById(Integer id);
}
