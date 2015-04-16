package server;

import java.util.List;
import javax.ejb.Local;
import model.Book;

/**
 *
 * @author remi
 * 
 * Main interface for BookBean
 * 
 * It has to provide 2 methods, to initialize books and
 * to get a list of books from database
 */
@Local
public interface BookBeanLocal {
    void initializeBooks();
    List<Book> listBooks();
}
