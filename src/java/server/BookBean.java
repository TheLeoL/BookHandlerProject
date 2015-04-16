package server;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import model.Book;

/**
 *
 * @author remi
 */
@Stateless
public class BookBean implements BookBeanLocal {

    public BookBean() {
    }
    
    @PersistenceUnit
    EntityManagerFactory emf;

    @Override
    public void initializeBooks() {
        EntityManager em;
        Book b1, b2, b3;

        em = emf.createEntityManager();

        em.createQuery("DELETE FROM Book").executeUpdate();
        
        b1 = new Book("Le Pere Goriot", "Honore de Balzac", (short) 2011, 1);
        b2 = new Book("Les Chouans", "Honore de Balzac", (short) 2010, 1);
        b3 = new Book("Les Miserables", "Victor Hugo", (short) 2014, 5);

        em.persist(b1);
        em.persist(b2);
        em.persist(b3);
    }
    
    @Override
    public List<Book> listBooks() {
        EntityManager em;
        List<Book> list;

        em = emf.createEntityManager();
        
        list = em.createNamedQuery("Book.findAll").getResultList();
        
        return list;
    }
    
    @Override
    public List<String> listAuthors() {
        EntityManager em;
        List<String> list;

        em = emf.createEntityManager();
        
        list = em.createNamedQuery("Book.findAuthors").getResultList();
        
        return list;
    }
    
    @Override
    public void addBook(String title, String author, short year, float price) {
        EntityManager em;
        Book b;
        
        em = emf.createEntityManager();
        
        b = new Book(title, author, year, price);

        em.persist(b);
    }
}
