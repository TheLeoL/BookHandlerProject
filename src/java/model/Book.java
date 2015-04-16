package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author remi
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Book.findAll", query = "SELECT b FROM Book b"),
    @NamedQuery(name = "Book.findAuthors", query = "SELECT DISTINCT b.author FROM Book b")})
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

    public Book() {
    }

    public Book(String t, String a, short y, float p) {
        title = t;
        author = a;
        publicationYear = y;
        price = p;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public short getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(short publicationYear) {
        this.publicationYear = publicationYear;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (title != null ? title.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Book)) {
            return false;
        }
        Book other = (Book) object;
        return !((this.title == null && other.title != null) || (this.title != null && !this.title.equals(other.title)));
    }

    @Override
    public String toString() {
        return author + ", <i>" + title + "</i>, " + publicationYear + " ($" + price + ")";
    }

}
