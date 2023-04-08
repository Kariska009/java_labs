package knigi.model;

import java.time.LocalDate;
import java.util.Arrays;

public final class Book {
    private final int id;
    private final String name;
    private final Author[] authors;
    private final Publisher publisher;
    private final LocalDate yearOfPublication;
    private final int pages;
    private final double price;
    private final Binding binding;

    public Book(int id, String name, Author[] authors, Publisher publisher, LocalDate yearOfPublication,
                int pages, double price, Binding binding) {
        this.id = id;
        this.name = name;
        this.authors = authors;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
        this.pages = pages;
        this.price = price;
        this.binding = binding;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public LocalDate getYearOfPublication() {
        return yearOfPublication;
    }

    public int getPages() {
        return pages;
    }

    public double getPrice() {
        return price;
    }

    public Binding getBinding() {
        return binding;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", publisher=" + publisher.getName() +
                ", yearOfPublication=" + yearOfPublication +
                ", pages=" + pages +
                ", price=" + price +
                ", binding=" + binding +
                '}';
    }
}
