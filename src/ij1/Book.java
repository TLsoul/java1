package ij1;

public class Book {
    private String title;
    private double price;
    private Author name;

    public Book(String developingJava, Author a, double v) {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Author getName() {
        return name;
    }

    public void setName(Author name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", name=" + name +
                '}';
    }
}
