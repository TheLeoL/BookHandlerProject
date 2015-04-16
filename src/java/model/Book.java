package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

/**
 *
 * @author remi
 * 
 * This class represents a Book.
 * 
 * A Book contains a title, an author, a publication year and a price.
 * 
 * 
 */
@Entity
@NamedQuery(name = "Book.findAll", query = "SELECT b from Book b")
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "TITLE")
    private String title;
    @Column(name = "AUTHOR")
    private String author;
    @Column(name = "PUB_YEAR")
    private short publicationYear;
    @Column(name = "PRICE")
    private float price;

    /**
     * Constructor of Book
     */
    public Book() {
    }

    /**
     * Initializes a book with its informations
     * @param t title
     * @param a author
     * @param y year
     * @param p price
     */
    public Book(String t, String a, short y, float p) {
        title = t;
        author = a;
        publicationYear = y;
        price = p;
    }

    /**
     * 
     * @return  author
     */
    public String getAuthor() {
        return author;
    }
/**
 * 
 * @param author name of author to set
 */
    public void setAuthor(String author) {
        this.author = author;
    }
/**
 * 
 * @return publication year
 */
    public short getPublicationYear() {
        return publicationYear;
    }
/**
 * 
 * @param publicationYear year to set
 */
    public void setPublicationYear(short publicationYear) {
        this.publicationYear = publicationYear;
    }
/**
 * 
 * @return price
 */
    public float getPrice() {
        return price;
    }
/**
 * 
 * @param price  price to set
 */
    public void setPrice(float price) {
        this.price = price;
    }
/**
 * 
 * @return title
 */
    public String getTitle() {
        return title;
    }
/**
 * 
 * @param title  title to set
 */
    public void setTitle(String title) {
        this.title = title;
    }
/**
 * 
 * @return the hash code
 */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (title != null ? title.hashCode() : 0);
        return hash;
    }
/**
 * Compares two books to see if it's the same
 * @param object
 * @return true if same Book
 */
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Book)) {
            return false;
        }
        Book other = (Book) object;
        return !((this.title == null && other.title != null) || (this.title != null && !this.title.equals(other.title)));
    }
/**
 * 
 * @return display of a book in a string
 */
    @Override
    public String toString() {
        return author + ", <i>" + title + "</i>, " + publicationYear + " ($" + price + ")";
    }

}
