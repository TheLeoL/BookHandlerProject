package server;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
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
}
