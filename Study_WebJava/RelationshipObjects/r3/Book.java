package Study_WebJava.RelationshipObjects.r3;

public class Book {
    private String name;
    private double price;
    private Author[] authors;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

    public String getAuthorNames() {
        String result = "";
        for (int i = 0; i < authors.length - 1; i++) {
            result += authors[i].getName() + ", ";
        } 
        result +=  authors[authors.length -1 ].getName();
        return result;
    }
}
