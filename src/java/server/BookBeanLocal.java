package server;

import java.util.List;
import javax.ejb.Local;
import model.Book;

/**
 *
 * @author remi
 */
@Local
public interface BookBeanLocal {
    void initializeBooks();
    List<Book> listBooks();
    List<String> listAuthors();
    void addBook(String title, String author, short year, float price);
}
