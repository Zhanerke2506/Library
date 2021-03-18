package Gaara;

public class Book {
    private String naz;
    private String author;

    public Book(String naz, String author) {
        this.naz = naz;
        this.author = author;
    }
    public String getNaz() {
        return naz;
    }
    public void setNaz(String naz) {
        this.naz = naz;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String toString() {
        return naz+" ("+author+")";
    }

}
