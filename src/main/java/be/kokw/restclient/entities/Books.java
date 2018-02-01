package be.kokw.restclient.entities;

public class Books {
    private long id;
    private String title;
    private String authors;
    private String isbn;
    private String depot;
    private String topics;
    private String nrOfPages;
    private boolean inStock;

    public Books() {
    }

    public Books(String title, String authors, String isbn, String depot, String topics, String nrOfPages, boolean inStock) {
        this.title = title;
        this.authors = authors;
        this.isbn = isbn;
        this.depot = depot;
        this.topics = topics;
        this.nrOfPages = nrOfPages;
        this.inStock = inStock;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getDepot() {
        return depot;
    }

    public void setDepot(String depot) {
        this.depot = depot;
    }

    public String getTopics() {
        return topics;
    }

    public void setTopics(String topics) {
        this.topics = topics;
    }

    public String getNrOfPages() {
        return nrOfPages;
    }

    public void setNrOfPages(String nrOfPages) {
        this.nrOfPages = nrOfPages;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
}
